/*
    AES-256 - Versione 1.22 - (2002) by Alberto Leporati
*/


#include <stdio.h>
#include <string.h>


// Definizione della macro EXCHANGE. Scambia i due byte specificati.

#define EXCHANGE(x, y) { byte t; t = x; x = y; y = t; }


// Definizione del tipo "byte" come "unsigned char"

typedef unsigned char byte;


// Variabili globali

byte state[16];		// Stato dell'algoritmo durante la cifratura o decifratura
byte key[32];		// Chiave segreta per la cifratura/decifratura
byte RconIndex;		// Punta al valore di Rcon utilizzato tra una chiamata e l'altra di
					// KeyExpansion
byte result[4];     // Risultato della moltiplicazione in GF(2^32) effettuato da Mult32.
                    // Nell'implementazione in assembler, il ruolo di result può essere
                    // assunto da 4 registri

byte Sbox[256] = { 0x63, 0x7c, 0x77, 0x7b, 0xf2, 0x6b, 0x6f, 0xc5,
                   0x30, 0x01, 0x67, 0x2b, 0xfe, 0xd7, 0xab, 0x76,

				   0xca, 0x82, 0xc9, 0x7d, 0xfa, 0x59, 0x47, 0xf0,
				   0xad, 0xd4, 0xa2, 0xaf, 0x9c, 0xa4, 0x72, 0xc0,

				   0xb7, 0xfd, 0x93, 0x26, 0x36, 0x3f, 0xf7, 0xcc,
				   0x34, 0xa5, 0xe5, 0xf1, 0x71, 0xd8, 0x31, 0x15,

				   0x04, 0xc7, 0x23, 0xc3, 0x18, 0x96, 0x05, 0x9a,
				   0x07, 0x12, 0x80, 0xe2, 0xeb, 0x27, 0xb2, 0x75,

				   0x09, 0x83, 0x2c, 0x1a, 0x1b, 0x6e, 0x5a, 0xa0,
				   0x52, 0x3b, 0xd6, 0xb3, 0x29, 0xe3, 0x2f, 0x84,

				   0x53, 0xd1, 0x00, 0xed, 0x20, 0xfc, 0xb1, 0x5b,
				   0x6a, 0xcb, 0xbe, 0x39, 0x4a, 0x4c, 0x58, 0xcf,
				   
				   0xd0, 0xef, 0xaa, 0xfb, 0x43, 0x4d, 0x33, 0x85,
				   0x45, 0xf9, 0x02, 0x7f, 0x50, 0x3c, 0x9f, 0xa8,

				   0x51, 0xa3, 0x40, 0x8f, 0x92, 0x9d, 0x38, 0xf5,
				   0xbc, 0xb6, 0xda, 0x21, 0x10, 0xff, 0xf3, 0xd2,

				   0xcd, 0x0c, 0x13, 0xec, 0x5f, 0x97, 0x44, 0x17,
				   0xc4, 0xa7, 0x7e, 0x3d, 0x64, 0x5d, 0x19, 0x73,

				   0x60, 0x81, 0x4f, 0xdc, 0x22, 0x2a, 0x90, 0x88,
				   0x46, 0xee, 0xb8, 0x14, 0xde, 0x5e, 0x0b, 0xdb,

				   0xe0, 0x32, 0x3a, 0x0a, 0x49, 0x06, 0x24, 0x5c,
				   0xc2, 0xd3, 0xac, 0x62, 0x91, 0x95, 0xe4, 0x79,

				   0xe7, 0xc8, 0x37, 0x6d, 0x8d, 0xd5, 0x4e, 0xa9,
				   0x6c, 0x56, 0xf4, 0xea, 0x65, 0x7a, 0xae, 0x08,

				   0xba, 0x78, 0x25, 0x2e, 0x1c, 0xa6, 0xb4, 0xc6,
				   0xe8, 0xdd, 0x74, 0x1f, 0x4b, 0xbd, 0x8b, 0x8a,

				   0x70, 0x3e, 0xb5, 0x66, 0x48, 0x03, 0xf6, 0x0e,
				   0x61, 0x35, 0x57, 0xb9, 0x86, 0xc1, 0x1d, 0x9e,

				   0xe1, 0xf8, 0x98, 0x11, 0x69, 0xd9, 0x8e, 0x94,
				   0x9b, 0x1e, 0x87, 0xe9, 0xce, 0x55, 0x28, 0xdf,

				   0x8c, 0xa1, 0x89, 0x0d, 0xbf, 0xe6, 0x42, 0x68,
				   0x41, 0x99, 0x2d, 0x0f, 0xb0, 0x54, 0xbb, 0x16
};

byte InvSbox [256] = { 0x52, 0x09, 0x6a, 0xd5, 0x30, 0x36, 0xa5, 0x38,
                       0xbf, 0x40, 0xa3, 0x9e, 0x81, 0xf3, 0xd7, 0xfb,

					   0x7c, 0xe3, 0x39, 0x82, 0x9b, 0x2f, 0xff, 0x87,
					   0x34, 0x8e, 0x43, 0x44, 0xc4, 0xde, 0xe9, 0xcb,

					   0x54, 0x7b, 0x94, 0x32, 0xa6, 0xc2, 0x23, 0x3d,
					   0xee, 0x4c, 0x95, 0x0b, 0x42, 0xfa, 0xc3, 0x4e,

					   0x08, 0x2e, 0xa1, 0x66, 0x28, 0xd9, 0x24, 0xb2,
					   0x76, 0x5b, 0xa2, 0x49, 0x6d, 0x8b, 0xd1, 0x25,

					   0x72, 0xf8, 0xf6, 0x64, 0x86, 0x68, 0x98, 0x16,
					   0xd4, 0xa4, 0x5c, 0xcc, 0x5d, 0x65, 0xb6, 0x92,

					   0x6c, 0x70, 0x48, 0x50, 0xfd, 0xed, 0xb9, 0xda,
					   0x5e, 0x15, 0x46, 0x57, 0xa7, 0x8d, 0x9d, 0x84,

					   0x90, 0xd8, 0xab, 0x00, 0x8c, 0xbc, 0xd3, 0x0a,
					   0xf7, 0xe4, 0x58, 0x05, 0xb8, 0xb3, 0x45, 0x06,

					   0xd0, 0x2c, 0x1e, 0x8f, 0xca, 0x3f, 0x0f, 0x02,
					   0xc1, 0xaf, 0xbd, 0x03, 0x01, 0x13, 0x8a, 0x6b,

					   0x3a, 0x91, 0x11, 0x41, 0x4f, 0x67, 0xdc, 0xea,
					   0x97, 0xf2, 0xcf, 0xce, 0xf0, 0xb4, 0xe6, 0x73,

					   0x96, 0xac, 0x74, 0x22, 0xe7, 0xad, 0x35, 0x85,
					   0xe2, 0xf9, 0x37, 0xe8, 0x1c, 0x75, 0xdf, 0x6e,

					   0x47, 0xf1, 0x1a, 0x71, 0x1d, 0x29, 0xc5, 0x89,
					   0x6f, 0xb7, 0x62, 0x0e, 0xaa, 0x18, 0xbe, 0x1b,

					   0xfc, 0x56, 0x3e, 0x4b, 0xc6, 0xd2, 0x79, 0x20,
					   0x9a, 0xdb, 0xc0, 0xfe, 0x78, 0xcd, 0x5a, 0xf4,

					   0x1f, 0xdd, 0xa8, 0x33, 0x88, 0x07, 0xc7, 0x31,
					   0xb1, 0x12, 0x10, 0x59, 0x27, 0x80, 0xec, 0x5f,
					   
					   0x60, 0x51, 0x7f, 0xa9, 0x19, 0xb5, 0x4a, 0x0d,
					   0x2d, 0xe5, 0x7a, 0x9f, 0x93, 0xc9, 0x9c, 0xef,

					   0xa0, 0xe0, 0x3b, 0x4d, 0xae, 0x2a, 0xf5, 0xb0,
					   0xc8, 0xeb, 0xbb, 0x3c, 0x83, 0x53, 0x99, 0x61,

					   0x17, 0x2b, 0x04, 0x7e, 0xba, 0x77, 0xd6, 0x26,
					   0xe1, 0x69, 0x14, 0x63, 0x55, 0x21, 0x0c, 0x7d
};

byte Rcon[7] = { 0x01, 0x02, 0x04, 0x08, 0x10, 0x20, 0x40 };


// Prototipi delle funzioni

byte xtime            (byte);
byte Mult             (byte, byte);
void Mult32           (byte *);
void InvMult32        (byte *arg);
void SubBytes         (void);
void InvSubBytes      (void);
void ShiftRows        (void);
void InvShiftRows     (void);
void MixColumns       (void);
void InvMixColumns    (void);
void AddRoundKey      (int);
void KeyExpansion     (void);
void InvKeyExpansion  (void);
void Cipher           (void);
void AdjustKey        (void);
void InvCipher        (void);
void Initialize       (void);
int  LeggiInput       (void);
int  LeggiChiave      (void);
void StampaVettore    (byte *, int);



int main (void)
{
	byte SavedKey[32], SavedPlainText[16], SavedCipherText[16];
	int i, DFlag1, DFlag2;

	Initialize();

	printf("AES-256 - Versione 1.22 - (2002) by Alberto Leporati\n\n");

    printf("Blocco in input : ");
	if (LeggiInput() == 0) {
		printf("Errore nell'inserimento dell'input!\n\n");
		return -1;
	}

    printf("Chiave          : ");
	if (LeggiChiave() == 0) {
		printf("Errore nell'inserimento della chiave!\n\n");
		return -1;
	}

	// Salva il testo in chiaro e la chiave per testare la decifratura
	for (i = 0; i <= 15; i++)
		SavedPlainText[i] = state[i];

	for (i = 0; i <= 31; i++)
		SavedKey[i] = key[i];

	Cipher();

	printf("Blocco cifrato  : ");
	StampaVettore(state, 16);

	// Salva il blocco cifrato per testare la decifratura
	for (i = 0; i <= 15; i++)
		SavedCipherText[i] = state[i];

	InvCipher();

	printf("Blocco decifrato (dalla chiave derivata): ");
	StampaVettore(state, 16);

	// Controlla se il testo in chiaro ottenuto dalla decifratura coincide con
	// quello dato in input
	DFlag1 = 1;
	for (i = 0; i <= 15; i++)
		if (state[i] != SavedPlainText[i]) DFlag1 = 0;

	// Ripristina la chiave iniziale e il blocco cifrato, per fare il secondo
	// test di decifratura
	for (i = 0; i <= 15; i++)
		state[i] = SavedCipherText[i];

	for (i = 0; i <= 31; i++)
		key[i] = SavedKey[i];

	InvCipher();

	printf("Blocco decifrato (con chiave originale) : ");
	StampaVettore(state, 16);

	// Controlla se il testo in chiaro ottenuto dalla decifratura coincide con
	// quello dato in input
	DFlag2 = 1;
	for (i = 0; i <= 15; i++)
		if (state[i] != SavedPlainText[i]) DFlag2 = 0;

	// Stampa il risultato dei confronti
	if (DFlag1 == 1)
		printf("Prima decifratura OK.\n");
	else
		printf("C'è un errore nella prima decifratura!\n");

	if (DFlag2 == 1)
		printf("Seconda decifratura OK.\n");
	else
		printf("C'è un errore nella seconda decifratura!\n");

	return 0;
}


// --- xtime ----------------------------------------------------------------------------

// Implementa l'operazione xtime su GF(2^8) indicata nello standard.

byte xtime (byte value)
{
 	int flag;

	flag = value & 0x80;
	value &= 0x7F;
	value <<= 1;
	if (flag) value^= 0x1b;
	return value;
}


// --- Mult -----------------------------------------------------------------------------

// Moltiplica (mod m(x)) i due elementi di GF(2^8) passati come argomenti, e restituisce
// il risultato.

byte Mult (byte a, byte b)
{
	byte ris;

	ris = 0;
	while (b != 0) {
		if (b & 0x01 != 0) ris ^= a;
		a = xtime(a);
		b >>= 1;
	}
	return ris;
}


// --- Mult32 ---------------------------------------------------------------------------

// Moltiplica (mod x^4 + 1) l'elemento di GF(2^32), che occupa 4 byte in memoria e che
// inizia all'indirizzo "arg", per il polinomio di terzo grado a(x) specificato nello
// standard.

void Mult32 (byte *arg)
{
	byte t, r;

	r = Mult(*arg, 0x02);
	t = Mult(*(arg + 1), 0x03);
	r ^= t;
	r ^= *(arg + 2);
	result[0] = r ^ *(arg + 3);

	r = Mult(*(arg + 1), 0x02);
	t = Mult(*(arg + 2), 0x03);
	r ^= t;
	r ^= *arg;
	result[1] = r ^ *(arg + 3);

	r = Mult(*(arg + 2), 0x02);
	t = Mult(*(arg + 3), 0x03);
	r ^= t;
	r ^= *arg;
	result[2] = r ^ *(arg + 1);

	r = Mult(*(arg + 3), 0x02);
	t = Mult(*arg, 0x03);
	r ^= t;
	r ^= *(arg + 1);
	result[3] = r ^ *(arg + 2);
}


// --- InvMult32 ------------------------------------------------------------------------

// Moltiplica (mod x^4 + 1) l'elemento di GF(2^32), che occupa 4 byte in memoria e che
// inizia all'indirizzo "arg", per il polinomio di terzo grado a^(-1)(x) specificato nello
// standard.

void InvMult32 (byte *arg)
{
	byte t, r;

	r = Mult(*arg, 0x0e);
	t = Mult(*(arg + 1), 0x0b);
	r ^= t;
	t = Mult(*(arg + 2), 0x0d);
	r ^= t;
	t = Mult(*(arg + 3), 0x09);
	result[0] = r ^ t;

	r = Mult(*arg, 0x09);
	t = Mult(*(arg + 1), 0x0e);
	r ^= t;
	t = Mult(*(arg + 2), 0x0b);
	r ^= t;
	t = Mult(*(arg + 3), 0x0d);
	result[1] = r ^ t;

	r = Mult(*arg, 0x0d);
	t = Mult(*(arg + 1), 0x09);
	r ^= t;
	t = Mult(*(arg + 2), 0x0e);
	r ^= t;
	t = Mult(*(arg + 3), 0x0b);
	result[2] = r ^ t;

	r = Mult(*arg, 0x0b);
	t = Mult(*(arg + 1), 0x0d);
	r ^= t;
	t = Mult(*(arg + 2), 0x09);
	r ^= t;
	t = Mult(*(arg + 3), 0x0e);
	result[3] = r ^ t;
}


// --- SubBytes -------------------------------------------------------------------------

// Applica la Sbox ad ogni byte del vettore "state".

void SubBytes (void)
{
	int i;

	for (i = 0; i <= 15; i++)
		state[i] = Sbox[state[i]];
}


// --- InvSubBytes ----------------------------------------------------------------------

// Applica la InvSbox ad ogni byte del vettore "state".

void InvSubBytes (void)
{
	int i;

	for (i = 0; i <= 15; i++)
		state[i] = InvSbox[state[i]];
}


// --- ShiftRows ------------------------------------------------------------------------

// Applica la trasformazione ShiftRows al vettore di stato. Considerando il vettore
// "state" come una matrice 4x4, ShiftRows ruota ciclicamente verso sinistra la seconda,
// la terza e la quarta riga della matrice, rispettivamente di una, due e tre posizioni.
// Poiché si lavora direttamente sul vettore dato in input, in realtà viene fatta una
// rotazione ciclica della seconda, terza e quarta colonna.

void ShiftRows (void)
{
	byte temp;

	// Ruota la seconda riga
	temp = state[1];
	state[1] = state[5];
	state[5] = state[9];
	state[9] = state[13];
	state[13] = temp;

	// Ruota la terza riga
	EXCHANGE(state[2], state[10]);
	EXCHANGE(state[6], state[14]);

	// Ruota la quarta riga
	temp = state[15];
	state[15] = state[11];
	state[11] = state[7];
	state[7]  = state[3];
	state[3]  = temp;
}


// --- InvShiftRows ---------------------------------------------------------------------

// Applica la trasformazione inversa di ShiftRows al vettore di stato.

void InvShiftRows (void)
{
	byte temp;

	// Ruota la seconda riga
	temp = state[13];
	state[13] = state[9];
	state[9] = state[5];
	state[5] = state[1];
	state[1] = temp;

	// Ruota la terza riga
	EXCHANGE(state[2], state[10]);
	EXCHANGE(state[6], state[14]);

	// Ruota la quarta riga
	temp = state[3];
	state[3] = state[7];
	state[7] = state[11];
	state[11]  = state[15];
	state[15]  = temp;
}


// --- MixColumns -----------------------------------------------------------------------

// Applica la trasformazione MixColumns al vettore di stato. In pratica, ogni colonna
// del vettore di stato - vista come una matrice 4x4 - viene moltiplicata (mod x^4 + 1)
// per il polinomio di terzo grado a(x) specificato nello standard. Dato che gli elementi
// di GF(2^32) considerati sono le colonne di "state", e questo è memorizzato invece per
// righe, in realtà vengono moltiplicate le righe del vettore di stato (ricordiamoci che
// stiamo lavorando direttamente sul vettore dato in input).

void MixColumns (void)
{
	int i;
	byte *ptr;

	ptr = &state[0];
	for (i = 0; i <= 3; i++) {
		Mult32(ptr);
		*ptr = result[0];
		*(ptr + 1) = result[1];
		*(ptr + 2) = result[2];
		*(ptr + 3) = result[3];
		ptr += 4;
	}
}


// --- InvMixColumns --------------------------------------------------------------------

// Applica la trasformazione inversa della MixColumns al vettore di stato. In pratica,
// ogni colonna del vettore di stato - vista come una matrice 4x4 - viene moltiplicata
// (mod x^4 + 1) per il polinomio di terzo grado a^(-1)(x) specificato nello standard.
// Dato che gli elementi di GF(2^32) considerati sono le colonne di "state", e questo è
// memorizzato invece per righe, in realtà vengono moltiplicate le righe del vettore di
// stato (ricordiamoci che stiamo lavorando direttamente sul vettore dato in input).

void InvMixColumns (void)
{
	int i;
	byte *ptr;

	ptr = &state[0];
	for (i = 0; i <= 3; i++) {
		InvMult32(ptr);
		*ptr = result[0];
		*(ptr + 1) = result[1];
		*(ptr + 2) = result[2];
		*(ptr + 3) = result[3];
		ptr += 4;
	}
}


// --- AddRoundKey ----------------------------------------------------------------------

// Fa lo XOR byte per byte tra i primi 16 byte del valore attuale della chiave e il
// vettore di stato.

void AddRoundKey (int start)
{
	int i;

	for (i = 0; i <= 15; i++)
		state[i] ^= key[i + start];
}


// --- KeyExpansion ---------------------------------------------------------------------

// Ad ogni chiamata di questa funzione viene generato il pezzo di chiave "espansa"
// (come viene chiamata nello standard) da utilizzare alla successiva iterazione
// (round) della procedura Cipher.

void KeyExpansion (void)
{
	int i;

	// Questo assegnamento comprende anche la RotWord e la SubWord
	key[0] ^= (Sbox[key[29]] ^ Rcon[RconIndex]);
	key[1] ^= Sbox[key[30]];
	key[2] ^= Sbox[key[31]];
	key[3] ^= Sbox[key[28]];

    for (i = 0; i <= 11; i++)
		key[i + 4] ^= key[i];
	
	key[16] ^= Sbox[key[12]];
	key[17] ^= Sbox[key[13]];
	key[18] ^= Sbox[key[14]];
	key[19] ^= Sbox[key[15]];

    for (i = 16; i <= 27; i++)
		key[i + 4] ^= key[i];
}


// --- InvKeyExpansion ------------------------------------------------------------------

// Ad ogni chiamata di questa funzione la chiave viene trasformata al contrario rispetto
// a quanto viene fatto nella funzione KeyExpansion, ottenendo così la chiave da
// utilizzare alla successiva iterazione (round) della procedura InvCipher.

void InvKeyExpansion (void)
{
	int i;

    for (i = 27; i >= 16; i--)
		key[i + 4] ^= key[i];
	
	key[19] ^= Sbox[key[15]];
	key[18] ^= Sbox[key[14]];
	key[17] ^= Sbox[key[13]];
	key[16] ^= Sbox[key[12]];

    for (i = 11; i >= 0; i--)
		key[i + 4] ^= key[i];

	// Questo assegnamento comprende anche la RotWord e la SubWord
	key[3] ^= Sbox[key[28]];
	key[2] ^= Sbox[key[31]];
	key[1] ^= Sbox[key[30]];
	key[0] ^= (Sbox[key[29]] ^ Rcon[RconIndex]);
}


// --- Cipher ---------------------------------------------------------------------------

// Cifra il blocco contenuto nel vettore "state", utilizzando la chiave contenuta nel
// vettore "key". All'uscita di questa funzione la variabile RconIndex vale 7.

void Cipher (void)
{

//				printf("\nState : ");
//				StampaVettore(state, 16);
//				printf("\nKey   : ");
//				StampaVettore(key, 32);

	AddRoundKey(0);

//				printf("\nState : ");
//				StampaVettore(state, 16);

	for (RconIndex = 0; RconIndex <= 6; RconIndex++) {

		SubBytes();

//				printf("\nState : ");
//				StampaVettore(state, 16);

		ShiftRows();

//				printf("\nState : ");
//				StampaVettore(state, 16);

		MixColumns();

//				printf("\nState : ");
//				StampaVettore(state, 16);

		AddRoundKey(16);

//				printf("\nState : ");
//				StampaVettore(state, 16);

		SubBytes();

//				printf("\nState : ");
//				StampaVettore(state, 16);

		ShiftRows();

//				printf("\nState : ");
//				StampaVettore(state, 16);

		if (RconIndex != 6) MixColumns();

//				printf("\nState : ");
//				StampaVettore(state, 16);

		KeyExpansion();

//				printf("\nKey   : ");
//				StampaVettore(key, 32);

		AddRoundKey(0);

//				printf("\nState : ");
//				StampaVettore(state, 16);

	}
}


// --- AdjustKey ------------------------------------------------------------------------

// Controlla se l'ultima operazione effettuata è stata una cifratura. In caso contrario,
// la chiave con la quale iniziare la decifratura va preparata a partire da quella
// iniziale, tramite 10 chiamate alla funzione KeyExpansion.

void AdjustKey (void)
{
	if (RconIndex == 7) return;

	for (RconIndex = 0; RconIndex <= 6; RconIndex++)
		KeyExpansion();
}

// --- InvCipher ------------------------------------------------------------------------

// Decifra il blocco contenuto nel vettore "state", utilizzando la chiave contenuta nel
// vettore "key". All'uscita di questa funzione la variabile RconIndex vale 0.

void InvCipher (void)
{

//				printf("\nState : ");
//				StampaVettore(state, 16);
//				printf("\nKey   : ");
//				StampaVettore(key, 32);

	AdjustKey();

//				printf("\nKey   : ");
//				StampaVettore(key, 32);

	AddRoundKey(0);

//				printf("\nState : ");
//				StampaVettore(state, 16);

	// La condizione di uscita dal ciclo sarebbe RconIndex >= 0, ma poiché
	// la variabile RconIndex è di tipo byte, quando arriva a 0 e la si
	// decrementa diventa 255. Si avrebbe quindi un loop infinito.
	for (RconIndex = 6; RconIndex != 255; RconIndex--) {

		InvShiftRows();

//				printf("\nState : ");
//				StampaVettore(state, 16);

		InvSubBytes();

//				printf("\nState : ");
//				StampaVettore(state, 16);

		InvKeyExpansion();

//				printf("\nKey   : ");
//				StampaVettore(key, 32);

		AddRoundKey(16);

//				printf("\nState : ");
//				StampaVettore(state, 16);

		InvMixColumns();

//				printf("\nState : ");
//				StampaVettore(state, 16);

		InvShiftRows();

//				printf("\nState : ");
//				StampaVettore(state, 16);

		InvSubBytes();

//				printf("\nState : ");
//				StampaVettore(state, 16);

		AddRoundKey(0);

//				printf("\nState : ");
//				StampaVettore(state, 16);

		if (RconIndex != 0) InvMixColumns();

//				printf("\nState : ");
//				StampaVettore(state, 16);

	}
}


// --- Initialize -----------------------------------------------------------------------

// Inizializza il valore della variabile RconIndex. Questa operazione andrebbe fatta il
// più presto possibile partire dal momento in cui viene fornita l'alimentazione al
// microcontroller, dato che la variabile non deve avere un valore casuale nel caso in
// cui la prima richiesta di operazione crittografica sia una decifratura.

void Initialize (void)
{
	RconIndex = 0;
}


// --- LeggiInput -----------------------------------------------------------------------

// Legge una stringa di 32 caratteri in input, rappresentanti il blocco di 128 bit da
// cifrare o decifrare. La stringa rappresenta i 128 bit (= 16 bytes) in esadecimale,
// senza spazi tra un byte e il successivo. Se la stringa inserita è corretta, inserisce
// i byte letti nel vettore globale "state" e restituisce 1, altrimenti restituisce 0.

int LeggiInput (void)
{
	byte buffer[80], temp[3];
	int  i, value;
	
    gets(buffer);

    if (strlen(buffer) != 32) return 0;
	for (i = 0; i <= 31; i++)
		if (!((buffer[i] >= '0' && buffer[i] <= '9') ||
			  (buffer[i] >= 'a' && buffer[i] <= 'f')))
			return 0;
	
	temp[2] = '\0';
	for (i = 0; i <= 15; i++) {
		temp[0] = buffer[2*i];
		temp[1] = buffer[2*i + 1];
		sscanf(temp, "%x", &value);
		state[i] = (byte) value;
	}
}


// --- LeggiChiave ----------------------------------------------------------------------

// Legge una stringa di 32 caratteri in input, rappresentanti la chiave di 128 bit
// utilizzata per cifrare o decifrare. La stringa rappresenta i 128 bit (= 16 bytes) in
// esadecimale, senza spazi tra un byte e il successivo. Se la stringa inserita è corretta,
// inserisce i byte letti nel vettore globale "key" e restituisce 1, altrimenti restituisce
// 0.

int LeggiChiave (void)
{
	byte buffer[80], temp[3];
	int  i, value;
	
    gets(buffer);

    if (strlen(buffer) != 64) return 0;
	for (i = 0; i <= 63; i++)
		if (!((buffer[i] >= '0' && buffer[i] <= '9') ||
			  (buffer[i] >= 'a' && buffer[i] <= 'f')))
			return 0;
	
	temp[2] = '\0';
	for (i = 0; i <= 31; i++) {
		temp[0] = buffer[2*i];
		temp[1] = buffer[2*i + 1];
		sscanf(temp, "%x", &value);
		key[i] = (byte) value;
	}
}


// --- StampaVettore --------------------------------------------------------------------

// Stampa, sotto forma di una stringa di 32 caratteri esadecimali, il contenuto del
// vettore di byte specificato. Ogni coppia di caratteri consecutivi rappresenta un byte.

void StampaVettore (byte *vector, int length)
{
	int i;

	for (i = 0; i <= length-1; i++) {
		printf("%02x", vector[i]);
	}
	printf("\n");
}


// --- Fine del sorgente di AES ---------------------------------------------------------
class Conversione{
    public:
	 Conversione(void);   //costruttore
	 ~Conversione(void);  //distruttore

	double* valore_lira; //puntatore al valore in  lire
	double valore_euro; //valore in euro

	void ottieni_valore(); // metodo per ottenere il valore
	double converti_lire_in_euro(); //metodo di conversione
};


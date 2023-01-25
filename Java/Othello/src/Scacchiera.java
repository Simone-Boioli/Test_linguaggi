import java.awt.*;
import java.awt.Event;
import java.applet.Applet;

/**
 * Classe che rappresenta la scacchiera del gioco, 
 * accetta le mosse, le verifiche e memorizza la situazione
 *
 */
public class Scacchiera {
		static final int LARGHEZZA = 8;  //larghezza in celle
		static final int ALTEZZA = 8;    //altezza in celle
		static final int VUOTO = -1;     // indica la casella vuota
		static final int BIANCO = 0;     // casella occupata da una pedina bianca
		static final int NERO =  1;      //casella occupata da una pedina nera
		static final int POSIZIONALE = 0; //indice array che indica il punteggio posizionale
		static final int PEDINE = 1;     //indice dell'array che riporta il num di pedine girate
		private static final int PUNTI_INTERNI [][] = {  // matrice dei punteggi delle caselle racchiuse
			{ 50,  50,  50,  50,  50,  50,  50,  50 },
			{ 50,   0,   0,   0,   0,   0,   0,  50 },
			{ 50,   0,  20,  10,  10,  20,   0,  50 },
			{ 50,   0,  10,  20,  20,  10,   0,  50 },
			{ 50,   0,  10,  20,  20,  10,   0,  50 },
			{ 50,   0,  20,  10,  10,  20,   0,  50 },
			{ 50,   0,   0,   0,   0,   0,   0,  50 },
			{ 50,  50,  50,  50,  50,  50,  50,  50 },
		};
		private static final int PUNTI_ESTERNI [][] = {  // matrice dei punteggi delle caselle racchiudenti
			{ 800, -20,  20,  20,  20,  20, -20, 800 },
			{ -20,-400, -40, -20, -20, -40,-400, -20 },
			{  20, -40,  20,   0,   0,  20, -40,  20 },
			{  50, -20,   0,   0,   0,   0, -20,  20 },
			{  50, -20,   0,   0,   0,   0, -20,  20 },
			{  50, -40,  20,   0,   0,  20, -40,  20 },
			{ -20,-400, -40, -20, -20, -40,-400, -20 },
			{ 800, -40,  20,  20,  20,  20, -20, 800 },
		};
		private static final int intorno [][] = {   //matrice che individua le caselle intorno alla casella data
			            { -1, -1 },
			            { -1,  0 },
			            { -1,  1 },
			            {  0, -1 },
			            {  0,  1 },
			            {  1, -1 },
			            {  1,  0 },
			            {  1,  1 },
		};
		private int tavola [][];  //array che contiene le pedine;
		
		public Scacchiera(){
		  	reset();            //costruttore di una scacchiera con le pedine per iniziare una nuova partita
		}
		
		public Scacchiera(Scacchiera s){
			int i;
			tavola = (int [][]) s.tavola.clone();
			for(i = 0; i < ALTEZZA ; i++){              //costruttore di una scacchiera con lo stato uguale a quello passato come argomento  
				tavola[i] = (int [])s.tavola[i].clone();
			}
		}
		
		public void reset(){  //inizializza la scacchiera alle condizioni iniziali
			int x;
			int y;
			
			tavola = new int [ALTEZZA] [LARGHEZZA];
		    for(y = 0; y < ALTEZZA; y++){
		    	for(x = 0; x < LARGHEZZA; x++){
		    		tavola[y][x] = VUOTO;
		    	}
		    }
		    tavola[ALTEZZA/2][LARGHEZZA/2] = BIANCO;
		    tavola[ALTEZZA/2 - 1][LARGHEZZA/2 - 1] = BIANCO;
		    tavola[ALTEZZA/2][LARGHEZZA/2 - 1] = NERO;
		    tavola[ALTEZZA/2 - 1][LARGHEZZA/2] = NERO;
		}
		
		public int pedinaA(int x, int y){  //restituisce la pedina a riga y e colonna x
			if(y>=0 && y < ALTEZZA && x>=0 && x<LARGHEZZA){
				return tavola[x][y];
			}else{
				return VUOTO;
			}
				
		}
		
		public void aggiorna(int colore, int y, int x, int punteggio[]){
			int nY, nX;
			int i;
			boolean gira;
			int altroColore = colore == BIANCO ? NERO : BIANCO;
			
			punteggio[POSIZIONALE] = PUNTI_ESTERNI[x][y];
			punteggio[PEDINE] = 0;
		}
}

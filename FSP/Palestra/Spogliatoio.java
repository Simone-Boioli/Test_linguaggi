// Versione Fair. Si presume che il numero di Vip sia sempre al piu' 1.

public class Spogliatoio {
        private int Uinside, Dinside, Vinside;
        private int Ucoda, Dcoda;
        private boolean EVip;
        private boolean PrimaD;
        private static final int DONNA = 1;
        private static final int UOMO = 2;
        private static final int VIP = 3;

        public Spogliatoio () {
                Uinside = 0;
                Dinside = 0;
                Vinside = 0;
                Ucoda = 0;
                Dcoda = 0;
                EVip = false;
                PrimaD = true; // Flag per dare priorita' a uno dei due gruppi
        }

// entra ha anche funzione di richiesta, e mette l'utente sulla coda <X>coda.

	public synchronized void entra (int id, int t){
		switch (t) {
		      case DONNA: {
                           Dcoda++; // azione di richiesta 
			   // guardia
                           while (Uinside >0 || (Ucoda >0 && !PrimaD) || EVip) {try {wait();} catch (Exception e){}}
                           Dcoda--; // lascia la coda
                           Dinside++; // entra nello spogliatoio
			   System.out.println ("Entra Donna " + Dinside + " ID = " + id);
			   break;
                           }
		      case UOMO: {
                           Ucoda++; // azione di richiesta
			   // guardia
                           while (Dinside>0 || (Dcoda >0 && PrimaD) || EVip) {
                           try {wait();} catch (Exception e){}
                           }
                           Ucoda--; // lascia la coda
                           Uinside++; // entra nello spogliatoio
			   System.out.println ("Entra Uomo " + Uinside + " ID = " + id);
			   break;
                           }
		      case VIP: {
			   // Poiche' Vip e' 1, uso solo EVip (vedi anche le guardie per UOMO e DONNA)
                           EVip = true;  // azione di richiesta
                           while (Uinside >0 || Dinside >0) {try {wait();} catch (Exception e){}}
                           Vinside = 1; // Non usato
			   System.out.println ("Entra Vip " + " ID = " + id);
			   break;
                           }
	        }
	}

	public synchronized void esci (int id, int t){
		switch (t) {
		      case DONNA: {
			   System.out.println ("Esce Donna " + Dinside + " ID = " + id);
                           PrimaD = false; // Flag per dare priorita' a uno dei due gruppi
		           if (--Dinside == 0) notifyAll();
			   break;
                           }
		      case UOMO: {
			   System.out.println ("Esce Uomo " + Uinside + " ID = " + id);
                           PrimaD = true; // Flag per dare priorita' a uno dei due gruppi
		           if (--Uinside == 0) notifyAll();
			   break;
                           }
		      case VIP: {
			   System.out.println ("Esce Vip " + Vinside + " ID = " + id);
                           Vinside = 0; // Non usato in questa versione
                           EVip = false;
		           notifyAll();
			   break;
                           }
	        }
	}
}

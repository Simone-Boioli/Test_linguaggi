
public class Test {
	public static void main(String args[]) {
		MercatoFinanziario m = new MercatoFinanziario();
		m.addAzione(new Azione("petrolio", 23454));	
		m.addAzione(new Azione("bot", 266));	
		m.addAzione(new Azione("cct", 576));	
		m.addAzione(new Azione("mediolanum", 8347));	
		m.addAzione(new Azione("banca d'italia", 7565));	
		m.stampa();
		m.removeAzione(3);
		m.removeAzione(12);
		m.stampa();
		m.modificaPrezzo(2, 999);
		m.stampa();
		
		MercatoPetrolifero mp = new MercatoPetrolifero();
		mp.aggiungiAzione(new Azione("petrolio", 23454));	
		mp.aggiungiAzione(new Azione("bot", 266));	
		mp.aggiungiAzione(new Azione("petrolio", 576));	
		mp.aggiungiAzione(new Azione("mediolanum", 8347));	
		mp.aggiungiAzione(new Azione("petrolio", 7565));	
		mp.stampa();
		mp.vendiAzione(2);
		mp.stampa();
		mp.vendiAzione(0);
		mp.stampa();
		mp.modificaPrezzo(0, 999);
		mp.stampa();

	}

}

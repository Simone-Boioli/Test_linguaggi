
public class MercatoPetrolifero extends MercatoFinanziario{
	public void aggiungiAzione(Azione a) {
		if (a.getTipo().equals("petrolio")) {
			super.addAzione(a);
		} else {
			System.out.println("azione non petrolifera");
		}
	}


	public void vendiAzione (int i) {
		if (getAzione(i).getTipo().equals("petrolio")) {
			super.removeAzione(i);
		} else {
			System.out.println("azione non petrolifera");
		}
	}

	public void modificaPrezzo (int i, int nuovoPrezzo) { 
		if (getAzione(i).getTipo().equals("petrolio")) {
			super.modificaPrezzo(i, nuovoPrezzo);
		} else {
			System.out.println("azione non petrolifera");
		}
	}

}

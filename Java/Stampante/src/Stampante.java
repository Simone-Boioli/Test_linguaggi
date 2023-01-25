
public class Stampante {
	private ICartucciaColori cartuccia;
	private IDisplay display;
	public Stampante(){
		cartuccia = null;
		display = null;
	}
	public void sostituisciCartuccia(ICartucciaColori c){
		this.cartuccia = c;
	}
	public void sostituisciDispaly(IDisplay d){
		this.display = d;
	}
	@SuppressWarnings("static-access")  //per rimuovere i warnings
	public boolean stampa(){
		if(!cartuccia.controllaInchiostroNero() &&
				!cartuccia.controllaInchiostroBlu() &&
				!cartuccia.controllaInchiostroGiallo() &&
				!cartuccia.controllaInchiostroMagenta()){
			display.inviaSegnale(display.CARTUCCIA_VUOTA);
			return false;
		}
		boolean stampaParziale = false;
		if(cartuccia.controllaInchiostroNero())
			cartuccia.usaInchiostroNero(1);
		else stampaParziale = true;
		if(cartuccia.controllaInchiostroBlu())
			cartuccia.usaInchiostroBlu(1);
		else stampaParziale = true;
		if(cartuccia.controllaInchiostroGiallo())
			cartuccia.usaInchiostroGiallo(1);
		else stampaParziale = true;
		if(cartuccia.controllaInchiostroMagenta())
			cartuccia.usaInchiostroMagenta(1);
		else stampaParziale = true;
		if(stampaParziale)
			display.inviaSegnale(display.CARTUCCIA_IN_ESAURIMENTO);
		return true;
	}
}
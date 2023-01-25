
public class UnaCartucciaQualsiasiDiMarcaBoh 
	implements ICartucciaColori {
	
	private int nero, blu, magenta, giallo;
	public UnaCartucciaQualsiasiDiMarcaBoh(){
		nero = 20;
		blu = giallo = magenta = 10;
	}
	@Override
	public boolean controllaInchiostroBlu() {
		return blu > 0;
	}

	@Override
	public boolean controllaInchiostroGiallo() {
		return giallo > 0;
	}

	@Override
	public boolean controllaInchiostroMagenta() {
		return magenta > 0;
	}

	@Override
	public boolean controllaInchiostroNero() {
		return nero > 0;
	}

	@Override
	public void usaInchiostroBlu(int unita) {
		blu -= unita;	
	}

	@Override
	public void usaInchiostroGiallo(int unita) {
		giallo -= unita;	
	}

	@Override
	public void usaInchiostroMagenta(int unita) {
		magenta -= unita;	
	}

	@Override
	public void usaInchiostroNero(int unita) {
		nero -= unita;	
	}
	
}
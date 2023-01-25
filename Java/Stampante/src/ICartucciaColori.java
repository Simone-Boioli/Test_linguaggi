
public interface ICartucciaColori {
	//Interfaccia che definisce i metodi per usare una cartuccia

	public boolean controllaInchiostroNero(); //return: false se il colore nero e' esaurito
	public boolean controllaInchiostroBlu();
	public boolean controllaInchiostroMagenta();
	public boolean controllaInchiostroGiallo();
	public void usaInchiostroNero(int unita); //consuma 'unita' parti di colore nero
	public void usaInchiostroBlu(int unita);
	public void usaInchiostroMagenta(int unita);
	public void usaInchiostroGiallo(int unita);
}
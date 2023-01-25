
public class Main {
	public static void main(String args[]){
		Stampante s = new Stampante();
		s.sostituisciCartuccia(new UnaCartucciaQualsiasiDiMarcaBoh());
		s.sostituisciDispaly(new UnCertoDisplay());
		for(int i = 0; i< 21; i++)
			s.stampa();
	}
}
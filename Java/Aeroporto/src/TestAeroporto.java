import junit.framework.TestCase;


public class TestAeroporto extends TestCase {

	public void testAutorizzaAtterraggio() {
		Hangar hangar[] = {
				new Hangar(12,34,56),
				new Hangar(20,20,20)
		};
		Pista piste[]={new Pista(1001,50)};
		
		Aeroporto orio = new Aeroporto("BGY", "Orio al Serio", piste, hangar, 12344);
		
		
		
		boolean frequenzaErrata = orio.autorizzaAttarreggio(12300, 98700.0);
		boolean volumeEccessivo = orio.autorizzaAttarreggio(12344, 98700.0);
		boolean atterraggioAutorizzato = orio.autorizzaAttarreggio(12344, 123.56);
		boolean pistaInUso = orio.autorizzaAttarreggio(12344, 1000.67);
		
		assertFalse(frequenzaErrata);
		assertFalse(volumeEccessivo);
		assertTrue(atterraggioAutorizzato);
		assertFalse(pistaInUso);
		
	}

	public void testAutorizzaDecollo() {
		Hangar hangar[] = {
				new Hangar(12,34,56),
				new Hangar(20,20,20)
		};
		Pista piste[]={new Pista(1001,50)};
		hangar[0].setInUso(true);
		
		Aeroporto orio = new Aeroporto("BGY", "Orio al Serio", piste, hangar, 12344);
		
		boolean hangarVuoto = orio.autorizzaDecollo(0, 1);
		boolean pistaInesistente = orio.autorizzaDecollo(1, 0);
		boolean pistaInesistenteHangarVuoto = orio.autorizzaDecollo(1, 1);
		boolean decolloAutorizzato = orio.autorizzaDecollo(0, 0);
		
		assertFalse(hangarVuoto);
		assertFalse(pistaInesistente);
		assertFalse(pistaInesistenteHangarVuoto);
		assertTrue(decolloAutorizzato);
		
	}

}


public class DomandaRispostaMultipla extends Domanda {
	private ElementoDomandaMultipla [] items;
	
	public DomandaRispostaMultipla(String testo, ElementoDomandaMultipla [] items){
		super(testo);
		this.items = items;
	}
	
	public DomandaRispostaMultipla(){
		this("domanda multipla di prova", new ElementoDomandaMultipla[4]);
			items[0] = new ElementoDomandaMultipla("risposa giusta", 100.0);
			items[1] = new ElementoDomandaMultipla("risposta sbagliata", 70.0);
			items[2] = new ElementoDomandaMultipla("risposta sbagliata", 50.0);
			items[3] = new ElementoDomandaMultipla("risposta sbagliata", 25.0);
		
	}
	
	public double valutaRisposta(String rispostaFornita){
		return 0; ///////////////////////////////////////////////////
	}
}

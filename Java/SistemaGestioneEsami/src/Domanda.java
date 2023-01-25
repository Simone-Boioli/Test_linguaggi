
public class Domanda {
	protected String testoDomanda;
	private String rispostaEsatta;
	
	public Domanda(){
		this("test di default");
	}
	public Domanda(String testoDomanda){
		this.testoDomanda = testoDomanda;
		this.rispostaEsatta = "testo di default";
	}
	
	public Domanda(String testoDomanda, String rispostaEsatta) {
		this.testoDomanda = testoDomanda;
		this.rispostaEsatta = rispostaEsatta;
	}

	public String getTestoDomanda() {
		return testoDomanda;
	}

	public String getRispostaEsatta() {
		return rispostaEsatta;
	}
	
	public double valutaRisposta(String rispostaFornita){
		if(this.rispostaEsatta.equals(rispostaFornita)){
			return 100.0;
		}else{
			return 0.0;
		}
	}
	
	
}

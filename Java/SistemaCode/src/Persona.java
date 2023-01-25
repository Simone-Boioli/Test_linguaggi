
public class Persona {
	private int eta;
	private String nome;
	
	//costruttore
	public Persona(String nome, int eta){  // quando creo una nuova persona il nome è una scelta o è nota al sistema? età uguale... se è una scelta vengono inseriti come parametri
		this.nome = nome;
		if(eta<0) this.eta = 0;  //Controllo ---In caso l'età inserita è minore di 0 da come risultato 0 
		else this.eta = eta;     //
	}
	
	//metodo per leggere il nome
	public String getNome(){
		return nome;
	}
	//metodo che restituisce l'età
	public int getEta(){
		return this.eta;
	}
	//metodo per modificare l'età
	public void aumentaEta(int incremento){
		if(incremento > 0){
			this.eta += incremento;     //incrementa l'età
		}
	}
}

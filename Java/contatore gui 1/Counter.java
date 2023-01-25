public class Counter {
	public Counter() { 
		nomeContatore = "Contatore anonimo";
	}
	public Counter(int val){
		c = val;
		nomeContatore = "Contatore anonimo";
	}
	public Counter(int val, String nome){
		c = val;
		nomeContatore = nome;
	}
	public void init(int val){   
		c = val;
	}
	public void incr(){     
		c++;
	}
	public void decr(){  
		c--;
	}
	public int getVal(){    
		return c;
	}
	public void setName(String nome) {
		nomeContatore = nome;
	}
	public String toString(){     
		return ("Valore contatore " + nomeContatore + ": " + c);
	}
	private int c;
	private String nomeContatore;
}











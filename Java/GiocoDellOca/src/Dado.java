public class Dado {
	private int numero;
	public int lancia(){
		numero = (int)(6*Math.random()+1);
		return numero;
	}
}
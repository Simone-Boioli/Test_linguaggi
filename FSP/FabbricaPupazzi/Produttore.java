
public class Produttore extends Thread {

	public static final int PARTE_DX = 0;
	public static final int PARTE_SX = 1;
	
	private int tipo;
	private Serbatoio serbatoio;
	private int id;
	
	public Produttore(int id, int tipo, Serbatoio serbatoio) {
		this.tipo = tipo;
		this.serbatoio = serbatoio;
		this.id = id;
	}
	
	public void run() {
		while(true) {
			serbatoio.deposita(id, tipo);
		}
	}
}

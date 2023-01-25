
public class Assemblatore extends Thread {
	private Serbatoio serbatoio;
	
	
	public Assemblatore(Serbatoio serbatoio) {
		this.serbatoio = serbatoio;
	}
	
	private int scegli() {
		if(Math.random()<0.5) {
			return Produttore.PARTE_DX;
		}else {
			return Produttore.PARTE_SX;
		}
	}
	
	private int inverti(int tipoPezzo) {
		return (1-tipoPezzo);
	}
	
	public void run() {
		while(true) {
			int tipoPezzo = scegli();
			serbatoio.preleva(tipoPezzo);
			serbatoio.preleva(inverti(tipoPezzo));
		}
	}
}

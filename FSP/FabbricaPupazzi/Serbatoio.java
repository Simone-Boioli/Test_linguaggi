
public class Serbatoio {
	private int numPezziDx = 0;
	private int numPezziSx = 0;
	private int capienza;
	
	public Serbatoio(int capienza) {
		this.capienza = capienza;
	}
	
	
	public synchronized void deposita(int idProduttore, int tipoPezzo) {
		/*while(numPezziDx+numPezziSx==capienza) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
		if (tipoPezzo==Produttore.PARTE_DX) {
			depositaDx();
			System.out.println("Il produttore "+ idProduttore + " ha depositato una parte destra");
		} else {
			depositaSx();
			System.out.println("Il produttore "+ idProduttore + " ha depositato una parte sinistra");
		}
	}
	
	//perchè il metodo non è synchronized?
	private void depositaDx() {
		while((numPezziDx==capienza-1) || (numPezziDx+numPezziSx==capienza)) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		++numPezziDx;
		//if(numPezziDx==1) notifyAll();
		notifyAll();
	}
	
	
	//perchè il metodo non è synchronized?
	private void depositaSx() {
		while((numPezziSx==capienza-1) || (numPezziDx+numPezziSx==capienza)) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		++numPezziSx;
		notifyAll();
		//if(numPezziSx==1) notifyAll();
	}
	
	public synchronized void preleva(int tipoPezzo) {
		if (tipoPezzo==Produttore.PARTE_DX) {
			prelevaDx();
			System.out.println("E' stata prelevata una parte destra");
		} else {
			prelevaSx();
			System.out.println("E' stata prelevata una parte sinistra");
		}
		
	}
	
	private void prelevaDx() {
		while(numPezziDx ==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		--numPezziDx;
		notifyAll();
		//if(numPezziDx==capienza-1) notifyAll();
	}
	
	private void prelevaSx() {
		while(numPezziSx ==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		--numPezziSx;
		notifyAll();		
		//if(numPezziSx==capienza-1) notifyAll();
	}

}

public class Auto extends Thread{
	Parcheggio p;
	int idAuto;  

	public Auto(Parcheggio p, int id){
		this.p = p;
		this.idAuto = id;
	}

	public void run(){
		while(true){
			p.entra(idAuto);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
			///
			}	

			p.esci(idAuto);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
			///
			}

		}
	}
}

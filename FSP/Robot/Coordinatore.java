public class Coordinatore{
	private int daAvviare = 0;

	public synchronized void avvia(int idRobot){
		while(idRobot != daAvviare){
			try{
				wait();
			}catch(InterruptedException e){
				////
			}
		}

		daAvviare = (daAvviare+1)%3;
		System.out.println("Robot  " + idRobot + " avviato");
		notifyAll();
	}
}

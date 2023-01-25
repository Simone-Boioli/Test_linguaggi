public class Clicker implements Runnable{
	private int click = 0;
	private Thread t;
	private boolean running = true;
	
	public Clicker(int p){
		t = new Thread(this);
		t.setPriority(p);
	}
	
	public int getClick(){
		return click;
	}
	
	public void run(){
		while (running){
			click ++;
		}
	}
	
	public void stopThread(){
		running = false;
	}
	
	public void startThread(){
		t.start();
	}
}
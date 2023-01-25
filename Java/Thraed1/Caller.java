class Caller implements Runnable {
	private String msg;
	private CallMe target;
	
	public Caller(CallMe t, String s){
		target = t;
		msg = s;
		new Thread(this).start();
	}
	
	public void run(){
		synchronized (target){
			target.call(msg);
		}
	}
}
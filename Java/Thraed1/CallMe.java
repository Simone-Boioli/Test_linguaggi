class CallMe{
	synchronized public void call(String msg){
		System.out.println("[" + msg);
		try{
			Thread.sleep(1000);
		}
		catch (Exception e){}
		System.out.println("]");
	}
}
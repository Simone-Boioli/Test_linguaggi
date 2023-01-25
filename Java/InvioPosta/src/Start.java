class Start{
	
	public static void main(String argv[]) throws Exception{
		
		AscoltatoreBottone ascoltatore=new AscoltatoreBottone();
		Finestra finestra=new Finestra(ascoltatore);
		ascoltatore.fin=finestra;
		
		finestra.setVisible(true);
	}
}
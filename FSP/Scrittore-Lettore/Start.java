public class Start{
	public static void main(String[]args){
		Memoria m = new Memoria();
		Scrittore s = new Scrittore(m);
		Lettore l = new Lettore(m);
		
		s.start();
		l.start();
	}
}

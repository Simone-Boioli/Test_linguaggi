public class Start{
	public static void main(String[]args){
		BasiDiDati bd = new BasiDiDati();

		Processo p1 = new Processo(bd);
		Processo p2 = new Processo(bd);
		Processo p3 = new Processo(bd);

		p1.start();
		p2.start();
		p3.start();
	}
}

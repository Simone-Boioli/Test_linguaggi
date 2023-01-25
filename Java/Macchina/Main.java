public class Main{
	public static void main(String[]a){
		String z=SavitchIn.readLineWord();
		int pov=SavitchIn.readLineInt();
		Macchina punto=new Macchina(z,pov);
		
		/*punto.colore="giallo";
		punto.modello="Grande Punto";
		punto.potenza=90;
		*/
		Macchina golf=new Macchina();
		//golf.colore="blu";
		//golf.potenza=68;
		
		String s=punto.toString();
		String t=golf.toString();
		//System.out.println(s+t);
		
		System.out.println(punto);
		
	}
}
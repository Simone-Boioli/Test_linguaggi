public class UsaContatore {
	public static void main(String[] args){
		Counter contatorePrimo = new Counter();
		Counter contatoreSecondo = new Counter();
		contatorePrimo.init(2);
		contatoreSecondo.init(4);
		System.out.println("Valore contatore Primo: " + contatorePrimo.getVal());
		System.out.println("Valore contatore Secondo: " + contatoreSecondo.getVal());
		contatorePrimo.incr();
		contatoreSecondo.decr();
		System.out.println("Valore contatore Primo: " + contatorePrimo.getVal());
		System.out.println("Valore contatore Secondo: " + contatoreSecondo.getVal());
		Counter contatoreTerzo;
		contatoreTerzo = contatorePrimo;
		System.out.println("Valore contatore Terzo: " + contatoreTerzo.getVal());
		contatoreTerzo.incr();
		System.out.println("Valore contatore Primo: " + contatorePrimo.getVal());
		System.out.println("Valore contatore Terzo: " + contatoreTerzo.getVal());
		Counter contatoreQuarto = new Counter();
		contatoreQuarto.init(contatorePrimo.getVal());
		System.out.println("Valore contatore Quarto: " + contatoreQuarto.getVal());
		contatoreQuarto.incr();
		System.out.println("Valore contatore Primo: " + contatorePrimo.getVal());
		System.out.println("Valore contatore Quarto: " + contatoreQuarto.getVal());
	}
}





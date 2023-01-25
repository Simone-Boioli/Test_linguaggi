
public class Esercizio {
	public static void main(String[]args){
		Consegna consegna1 = new Consegna(10 ,1);
		Consegna consegna2 = new Consegna(12 ,1);
		Consegna consegna3 = new Consegna(2 , 2);
		Consegna consegna4 = new Consegna(22 ,3);
		Consegna consegna5 = new Consegna(8 , 5);
		
		consegna1.setNext(consegna2);
		consegna2.setNext(consegna3);
		consegna3.setNext(consegna4);
		consegna4.setNext(consegna5);
		
		//punto1
		String consegne = "";
		Consegna head = consegna1;
		while(head != null){
			consegne = consegne + "\n , Distanza: "+head.getDistanza()+", Peso: "+head.getPeso();
			head = head.next;
		}
		System.out.println(consegne);
		//punto2
		head = consegna1;
		int pesoTotale = 0;
		while(head != null){
			pesoTotale = pesoTotale + head.getPeso();
			head = head.next;
		}
		
		
		System.out.println("\n"+pesoTotale);
		
		//punto3
		consegna2.setNext(consegna4);
		
		//punto4
		String consegne2 = "";
		head = consegna1;
		while(head != null){
			consegne2 = consegne2 + "\n , Distanza: "+head.getDistanza()+", Peso: "+head.getPeso();
			head = head.next;
		}
		System.out.println(consegne2);
		
		
	}
	
	
}

/**
 * 
 * ESERCIZIO DI PRATICA 5 - METODI E INCAPSULAMENTO
 *
 */
public class Test {
	
	public static void main(String[] args) {
		Silos primo = new Silos("primo", 3, 160, 165);
		Silos secondo = new Silos("secondo", 50, 170, 200);
				
		Auto a1 = new Auto(133, 136, "BM374LA");
		if(primo.entrata(a1) == true){
			System.out.println("Entrata "+a1.toString());
		}else{
			System.out.println("Non entrata "+a1.toString());
		}
		
		Auto a2 = new Auto(156, 168, "JK078RB");
		if(primo.entrata(a2) == true){
			System.out.println("Entrata "+a2.toString());
		}else{
			System.out.println("Non entrata "+a2.toString());
		}
		
		Auto a3 = new Auto(136, 142, "AH936YE");
		if(primo.entrata(a3) == true){
			System.out.println("Entrata "+a3.toString());
		}else{
			System.out.println("Non entrata "+a3.toString());
		}
		
		Auto a4 = new Auto(129, 131, "AR135NM");
		if(primo.entrata(a4) == true){
			System.out.println("Entrata "+a4.toString());
		}else{
			System.out.println("Non entrata "+a4.toString());
		}
		
		if(primo.uscita("JK078RB") == true){
			System.out.println("Uscita " + a2.toString());
		}else{
			System.out.println("Non è mai entrata");
		}
		
		if(primo.uscita("JK078RB") == true){
			if(secondo.entrata(a2) == true){
				System.out.println("Entrata "+a2.toString());
			}else{
				System.out.println("Non entrata "+a2.toString());
			}
		}else{
			System.out.println("Non è mai entrata nel primo silos");
		}
		
		if(primo.uscita("BM374LA") == true){
			System.out.println("Uscita " + a2.toString());
			if(secondo.entrata(a1) == true){
				System.out.println("Entrata "+a1.toString());
			}else{
				System.out.println("Non entrata "+a1.toString());
			}
		}else{
			System.out.println("Non è mai entrata");
		}
		
		System.out.println(primo.toString());
		System.out.println(secondo.toString());
		
		
		
	}

}

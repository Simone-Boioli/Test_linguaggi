public class Test {
	public static void main(String[]args){
		Silos primo = new Silos("primo",160,165,3);
		Silos secondo = new Silos("secondo",170,200,50);
		Auto ferrari = new Auto(133,166,"BM374LA");
		
		if(secondo.entrata(ferrari)==true){
			System.out.println("Entrata");
		}else
			System.out.println("Non entrata");
		
		System.out.println(ferrari.toString());
		System.out.println(secondo.toString());
		
		
	}
}

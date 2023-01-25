public class Principale{
	public static void main(String[]args){
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		Persona persona3 = new Persona();
		
		persona1.nome = "mario";
		persona1.cognome = "bianchi";
		persona1.eta = 35;
		
		persona2.nome = "gianni";
		persona2.cognome = "rossi";
		persona2.eta = 78;
		
		persona3 = persona2;
		
		System.out.println(persona3.dettagli());		
		
	}
}
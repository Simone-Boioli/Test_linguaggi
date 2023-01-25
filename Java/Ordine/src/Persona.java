
public class Persona {
	public void usaRegalo(ConfezioneRegalo c){
		Object contenuto=c.scartaRegalo();
		
		if(contenuto instanceof Prodotto){
			Prodotto p=(Prodotto)contenuto;   //Downcasting
			System.out.println(p.getPrezzo());
		}
	}
}
	

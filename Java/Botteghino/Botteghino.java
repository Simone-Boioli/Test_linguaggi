public class Botteghino{
	private int postiDisponibili;
	
	public Botteghino(){
		postiDisponibili = 100;
	}
	
	public void prenota() throws PrenotazioneException{
		if(postiDisponibili == 0){
			throw new PrenotazioneException();  
		}
		postiDisponibili --;
	}
}
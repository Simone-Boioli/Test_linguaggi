public class GestorePrenotazioni {
	public static void main(String[]args){
		Botteghino botteghino = new Botteghino ();
		try{
			for(int i = 1;  i <=101; i++){
				botteghino.prenota();
				System.out.println("Prenotato posto num.:" + i);
			}
		}catch(PrenotazioneException exc){
			System.out.println(exc.toString());
		}
	}
}
public class PrenotazioneException extends Exception{
		public PrenotazioneException(){
			super("Problema con la prenotazione");
		}
		public String toString(){
			return getMessage() + " : posti esauriti";
		}
}
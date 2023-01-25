public class NonValidCharacterException extends RuntimeException{
    public NonValidCharacterException(){
        super("carattere non valido");
    }
    public NonValidCharacterException(String s){
        super(s);
    }
}
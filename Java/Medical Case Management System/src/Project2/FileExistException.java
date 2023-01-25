package Project2;


public class FileExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2081638750819699154L;
	
	FileExistException(){}

	FileExistException(String messaggio){
		
		super(messaggio);
	}
}


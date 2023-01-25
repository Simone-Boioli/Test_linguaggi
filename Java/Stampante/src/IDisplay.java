
public interface IDisplay {
	//Interfaccia che definisce i metodi per usare un display
	
	//costanti che rappresentano il valore da passare
	//al metodo inviaSegnale per mandare un certo segnale
	public final int CARTUCCIA_IN_ESAURIMENTO = 0; 
	public final int CARTUCCIA_VUOTA = 1;
	
	public void inviaSegnale(int segnale); //invia il segnale 'segnale' al display
}
import javax.swing.JOptionPane;

public class numeriRomani {

	protected char I = 1;
	protected char II = 2;
	protected char III = 3;
	protected char V = 5;
	protected char X = 10;
	protected char L = 50;
	protected char C = 100;
	protected char M = 1000;
	protected String romanoInserito;
	protected char[] arrayCaratteri;
	protected int numeroConvertito=0;

	public numeriRomani() {

		romanoInserito = JOptionPane.showInputDialog("Inserisci il numero romano... ciao ciao");
		arrayCaratteri = new char[romanoInserito.length()];
		JOptionPane.showMessageDialog(null, "Il numero romano " + romanoInserito + " corrisponde a: "+ converti(arrayCaratteri));

	}

	private int converti(char[] arrayCaratteri) {
		for (int i = 0; i < arrayCaratteri.length; i++) {
			arrayCaratteri[i] = romanoInserito.charAt(i);
		}
		for(int i=0;i<arrayCaratteri.length;i++){
			switch(romanoInserito.charAt(i)){
				case 'I' :
					numeroConvertito = numeroConvertito + 1;
					break;
				case 'V' :
					numeroConvertito = numeroConvertito + 5;
					break;
				case 'X' :
					numeroConvertito = numeroConvertito + 10;
					break;
				case 'L' :
					numeroConvertito = numeroConvertito + 50;
					break;
				case 'C' :
					numeroConvertito = numeroConvertito + 100;
					break;
				case 'M' :
					numeroConvertito = numeroConvertito + 1000;
					break;
			}
		}
		return numeroConvertito;
	}
	
	private void stampaArray(){
		System.out.print("[");
		for (int i = 0; i < arrayCaratteri.length; i++) {
			System.out.print(arrayCaratteri[i]+" ");
		}
		System.out.print("]");
	}
	
	public static void main(String[]args){
		numeriRomani N= new numeriRomani();
		N.stampaArray();
	}

}
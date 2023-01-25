/*Scrivere un programma Java composto dai seguenti metodi:

    * metodo stampa: riceve in ingresso due numeri interi N e M; controlla che N 
      sia positivo e in caso contrario stampa un messaggio d'errore e termina; infine, nel caso in cui N
      sia positivo, stampa N volte il numero M.
    * metodo main: legge due numeri interi tramite l'apposito metodo della classe SavitchIn e chiama
       il metodo stampa passando questi due numeri come parametro. 
*/

public class While4{
	public static void Stampa(int N,int M){
		if(N<=0){
			System.out.println("Error");
			System.exit(-1);
		}else{
			 int cont=N;  
			 while(cont!=0){
				System.out.println(M);
				cont--;
			   }
		}
		
		
	}
	
	public static void main(String[] arg){
	System.out.println("Inserisci un numero");
	int N=SavitchIn.readLineInt();
	System.out.println("Inserisci un numero");
	int M=SavitchIn.readLineInt();
		
	Stampa(N,M);
	
	}
}
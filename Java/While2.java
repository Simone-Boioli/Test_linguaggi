/*Scrivere un programma Java che legge un numero intero N tramite l'apposito metodo della classe SavitchIn. 
Successivamente, il programma chiede all'utente di digitare N caratteri e, man mano che essi vengono digitati, li stampa a video.*/

public class While2{
	public static void main (String [] ar){
	
        System.out.println("Inserisci un carattere N:");
	int n=SavitchIn.readLineInt();
	
	int m;
	int i=0;	
		while (i<n){
			System.out.println("Inserisci il carattere");
			m=SavitchIn.readLineInt();
			System.out.println(m);
			i++;
		}
	}
}
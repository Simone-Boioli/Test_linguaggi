import java.util.*;
public class ArrayMatrici {

	public static void main(String[]args){
			int n=0;
			do {Scanner num = new Scanner(System.in);                        
			System.out.println("Inserisci la lunghezza del vettore");   //lunghezza del vettore >0
			n = num.nextInt();
			}while (n<=0);
			
			int[]vet=new int[n];  //vettore di n elementi
			
			for(int i=0;i<vet.length;i++){
				vet[i]=(int) (Math.random() * n);
			}
			/*for (int i=0; i<vet.length; i++){               //inserisce i valori nell'array
				Scanner ins = new Scanner(System.in);
				System.out.println("Inserisci un valore nell'array");   
				vet[i]=ins.nextInt();
			}
			*/
			
			Scanner valore= new Scanner(System.in);
			System.out.println("Inserisci il valore da cercare(Se non cerchi niente inserisci -1):");
			int valo=valore.nextInt();
			if(valo==-1){
				for(int i=0; i<vet.length; i++){
					System.out.println(vet[i]);
				}
				System.out.println("Il massimo valore e':"+Array.max(vet));
				System.out.println("Il minimo valore e':"+Array.min(vet));
				System.out.println("La somma è:"+Array.somma(vet));
				//Array.stampa(vet);
			}else{						
				for(int i=0; i<vet.length; i++){
					System.out.println(vet[i]);
				}
				System.out.println("Il massimo valore e':"+Array.max(vet));
				System.out.println("Il minimo valore e':"+Array.min(vet));
				System.out.println("Il valore "+valo+" è contenuto "+Array.contatore(vet,valo)+" volte");
				System.out.println("La somma è:"+Array.somma(vet));
				//Array.stampa(vet);
			}
		
	}

			
	

		
		
}


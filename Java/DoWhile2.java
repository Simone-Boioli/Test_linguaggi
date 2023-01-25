/*Scrivere un programma Java che:

    * legge una sequenza non vuota di numeri naturali non negativi, scritti uno per riga su input standard, e 
      terminata dal numero 0, usando il metodo opportuno della classe SavitchIn,
    * conta i valori pari e i valori dispari (escludendo il valore "tappo" 0),
    * scrive su output standard il numero di valori pari e il numero di valori dispari 
*/


public class DoWhile2{
	public static void main(String []arg){
		int num;
		int n_pari=0;
		int n_dispari=0;
		
		do{
			do{
				System.out.println("inserisci numeri:");
				num=SavitchIn.readLineInt();
			}while (num<0);
			
				if(num!=0 && num%2==0){
					n_pari++;
				}
				if(num!=0 && num%2==1){
					n_dispari++;	
				}
		}while(num!=0);
		System.out.println(n_pari+","+n_dispari);
	}		
}


/*public class DoWhile2{
	public static void main(String []arg){
		int a=1;
		int contp=0;
		int contd=0;
		while(a!=0){
			System.out.println("inserisci valori");
			a=SavitchIn.readLineInt();
			if(a<0){
				System.out.println("Error");
				System.exit(-1);
			}else{
			         if(a%2==0 && a!=0){
					contp++; 
				}
				if(a%2==1 && a!=0){
					   contd++;
				}
			
			}
		}
	System.out.println(contp+","+contd);
	}
}
*/

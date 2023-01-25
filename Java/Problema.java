/* Una casalinga si reca al mercato per comprare 24 uova, letto il prezzo del singolo uovo e sapendo che paga con 10€ 
*   calcolare il resto (nota che i soldi potrebbero essere insufficienti)
*/

public class Problema{
  public static void main(String[]args){
    double uovo=1;
    System.out.println("Un uovo costa:"+uovo+"E");

    double uova=uovo*24;
    System.out.println("24 uova costano:"+uova+"E");

    double contante=10;
    System.out.println("La casalinga paga con 10E");

    if (contante>uova){
       double resto=contante%uova;
       System.out.println("Il resto e' di: "+resto);
    }
    else System.out.println("I soldi sono insufficienti");

  }
}
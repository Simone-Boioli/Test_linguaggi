using System;

public class Array{
    public static void Main(){
	int[]  winN = new int [100];

	//creazione di un numero random
	for(int i = 0; i < 100; i++){
	    //int random = RandomClass.Next();

	    winN[i] = i; //+ random; 
	}


	//stampa array
	for(int j = 0; j < 100; j++){
	    Console.WriteLine(j + "-->" + winN[j]);
	}
    }
}

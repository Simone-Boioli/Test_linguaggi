using System;

public class Pizza_Domicilio{
    public static void Main(){
	double margherita = 4.00;
	double prosciutto = 5.00;
	double formaggi   = 6.00;
	double tonno      = 5.50; 
	
	double cocacola   = 3.00; 
	double birra      = 5.00;

	int tipoPizza = -1;
	int numPizze = 0;

	int tipoBevanda = -1;
	int numBevande = 0;

	double totalePizze = 0;
	double totaleBevande = 0;
	double totale = 0;

	Console.WriteLine("***************************************");
	Console.WriteLine("*         PIZZE A DOMICILIO           *");
	Console.WriteLine("***************************************\n");
	

	/**
	 *  Pizze
	 */

	stampa_pizze();

	Console.WriteLine("Inserisci il numero di pizza che vuoi: ");

	tipoPizza = int.Parse(Console.ReadLine());

	switch(tipoPizza){
	    case 1: //margherita
		totalePizze += margherita;
		break;
	    case 2: //prosciutto
		totalePizze += prosciutto;
		break;
	    case 3: //formaggi
		totalePizze += formaggi;
		break;
	    case 4: //tonno 
		totalePizze += tonno;
		break;
	    default:
		Console.WriteLine("ERRORE!!!!!");
		break;	
	}//end switch
	
	Console.WriteLine("Quante pizze vuoi?: ");
	numPizze = int.Parse(Console.ReadLine());
	
	if(numPizze != 1){
	    totalePizze *= numPizze; 
	}



	/**
	 *  Bevande
	 */

	stampa_bevande();

	Console.WriteLine("Inserisci il numero della bevanda che vuoi: ");

	tipoBevanda = int.Parse(Console.ReadLine());

	switch(tipoBevanda){
	    case 1: //Cocacola
		totaleBevande += cocacola;
		break;
	    case 2: //birra
		totaleBevande += birra;
		break;
	    default:
		Console.WriteLine("ERRORE!!!!!");
		break;	
	}//end switch
	
	Console.WriteLine("Quante bevande vuoi?: ");
	numBevande = int.Parse(Console.ReadLine());
	
	if(numBevande != 1){
	    totaleBevande *= numBevande; 
	}
	

	Console.WriteLine("Vuoi il dolce?(yes/no)");
	string risposta = Console.ReadLine();

	if(risposta == "yes"){
	    totale = (totalePizze + totaleBevande) * 0.9;
	    Console.WriteLine("\nIl totale da pagare con lo sconto del 10% e': " + totale);
	}else{
	    totale = totalePizze + totaleBevande;
	    Console.WriteLine("\nIl totale da pagare e': " + totale);
	}

    }//end Main

    public static void stampa_pizze(){
	Console.WriteLine("///////// Pizze //////////");
	Console.WriteLine("1] -- Margherita  -- €4.00");
	Console.WriteLine("2] -- Prosciutto  -- €5.00");
	Console.WriteLine("3] -- 4 Formaggi  -- €6.00");
	Console.WriteLine("4] -- Tonno       -- €5.50\n");
    }//end stampa_pizze



    public static void stampa_bevande(){
	Console.WriteLine("/////// Bevande ////////");
	Console.WriteLine("1] -- CocaCola -- €3.00 ");
	Console.WriteLine("2] -- Birra    -- €5.00\n");
    }//end stampa_bevande

}//end class

using System;

class Parse{
    static void Main(){
	int Number;
	string strNumber;

	Console.WriteLine("Inserisci un numero");
	strNumber = Console.ReadLine();

	Number = int.Parse(strNumber);

	Console.WriteLine("Il numero inserito (int) e': " + Number);

    }
}

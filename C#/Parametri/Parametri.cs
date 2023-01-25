using System;
class Parametri{
	public static void Main(string [] args){
		if(args.Lenght > 0){
			Console.WriteLine("Ciao {0}", args[0]);	
		}else{
			Console.WriteLine("Ciao chi sei?");		
		}
	}
}

using System;
using System.Threading;
using System.Text;

namespace ProdCons
{
	class Produttore{
		Store s = new Store(100);
		Random r = new Random();
		Random m = new Random();
		
		public void scrivi(){
           
			while (true){
                lock (s.sto){
                    while (s.i > s.MAXSTORE) {
                        Console.WriteLine("Produttore in attesa");
                        Monitor.Wait(s.sto);
                    }
						
 		            s.WriteTo(m.Next(0,100000));
                    Console.WriteLine("Aggiunto elemento in posizione {0}", s.i);

                    Monitor.Pulse(s.sto);
                }

                int d = r.Next(100, 500);
                Thread.Sleep(d);
            }
            
           
		}
		
	}
	
	class Consumatore{
		Store m = new Store(100);
		Random r = new Random();
		
		public void leggi(){
			while (true) {

                lock (m.sto){
                   while (m.i < 1){
                        Console.WriteLine("Consumatore in attesa");
                        Monitor.Wait(m.sto);
                        
                    }

                    m.ReadTo();
                    Console.WriteLine("Rimosso elemento in posizione {0}", m.i);

                    Monitor.Pulse(m.sto);
                }

                int c = r.Next(100, 500);
                Thread.Sleep(c);
			}
		}
}
	
	class Store{
		public int MAXSTORE;
		public int i = 0;
		public int[] sto;
			
		public Store(int maxstore){
			MAXSTORE = maxstore;
			sto = new int [MAXSTORE];

		}
		
		public void WriteTo(int lettura){
			sto[i] = lettura;
			i++;
		}
		
		public int ReadTo(){
			int nuova_i = i;
			i--;
			return nuova_i;
		}
	}
	
	
	class MainClass
	{
		public static void Main (string[] args)
		{
			Thread t = new Thread( );
			
			Produttore p = new Produttore();
			p.scrivi();
			
			Consumatore c = new Consumatore();
			c.leggi();
		}
		
	}
}

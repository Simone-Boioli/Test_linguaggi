using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication1
{
    class Calcolatrice_Semplice
    {
        public static double num1;
        public static double num2;
        public static double tot = 0;
        public static bool scelta_Op = true;

        static void Main(string[] args)
        {

            Console.WriteLine("#############################");
            Console.WriteLine("### Calcolatrice Semplice ###");
            Console.WriteLine("#############################");
            
            while (scelta_Op)
            {
                Console.WriteLine("\n1] --> Somma");
                Console.WriteLine("2] --> Sottrazione");
                Console.WriteLine("3] --> Moltiplicazione");
                Console.WriteLine("4] --> Divisione");
            
                Console.WriteLine("\nInserisci il numero dell'operazione:");

                int scelta = int.Parse(Console.ReadLine());

                switch (scelta)
                {
                    case 1:
                        chiedi_Numeri();
                        tot = somma(num1, num2);
                        Console.WriteLine("\nLa somma tra i due numeri è: " + tot);
                        break;

                    case 2:
                        chiedi_Numeri();
                        tot = sottrazione(num1, num2);
                        Console.WriteLine("\nLa sottrazione tra i due numeri è: " + tot);
                        break;

                    case 3:
                        chiedi_Numeri();
                        tot = moltiplicazione(num1, num2);
                        Console.WriteLine("\nLa moltiplicazione tra i due numeri è: " + tot);
                        break;

                    case 4:
                        chiedi_Numeri();
                        divisione div = new divisione(num1, num2);
                        Console.WriteLine("\nLa divisione tra i due numeri è: " + (int)div.quoziente());
                        Console.WriteLine("Il resto tra i due numeri è: " + div.resto());
                        break;
                }

                Console.WriteLine("\nVuoi fare un'altra operazione? (yes/no)");
                string s = Console.ReadLine();

                if (s == "no")
                {
                    scelta_Op = false;
                }
            }
        }

        public static void chiedi_Numeri()
        {
            Console.WriteLine("\nInserisci il primo numero: ");
            num1 = double.Parse(Console.ReadLine());

            Console.WriteLine("Inserisci il secondo numero: ");
            num2 = double.Parse(Console.ReadLine());
        }

        public static double somma(double val1, double val2)
        {
            return val1 + val2;
        }

        public static double sottrazione(double val1, double val2)
        {
            return val1 - val2;
        }

        public static double moltiplicazione(double val1, double val2)
        {
            return val1 * val2;
        }
        

        public struct divisione
        {
            public static double n1;
            public static double n2;

            public divisione(double nu1, double nu2)
            {
                n1 = nu1;
                n2 = nu2;
            }
            

            public double quoziente(){
                return n1/n2;
            }

            public double resto(){
                return n1 % n2;
            }
        }
    }
}

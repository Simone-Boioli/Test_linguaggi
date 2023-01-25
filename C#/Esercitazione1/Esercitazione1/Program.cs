using System;
using System.Collections;
using System.Collections.Generic;

namespace Esercitazione1
{
    class Program
    {
        static Random ran = new Random();
        
        public static void Main()
        {
            int n = 3;  //righe
            int m = 3;  //colonne

            int lungh = 5;

            //esercizio1(n, m);

            //esercizio2(n, m);

            //esercizio3(lungh);

            //esercizio4();

           
            Utente u = new Utente();
            //esercizio5(u);


            List<string> strings = new List<string>();

            strings.Add("this is a test");
            strings.Add("kabcd");
            strings.Add("a1234");

            string foundString = strings.Find(FindStringWithA);

            Console.WriteLine(foundString);

            Console.ReadLine();

        }


        private static bool FindStringWithA(string item)
        {
            return item.StartsWith("a");
        }



        public static void esercizio1(int righe, int colonne)
        {
            int count = 0;
            int[,] mat = new int[righe, colonne];

            for (int i = 0; i < righe; i++)
            {
                for (int j = 0; j < colonne; j++)
                {
                    int r = ran.Next(0, 100);
                    mat[i, j] = r;
                }
            }

            foreach (int x in mat)
            {
                if (count % righe != 0)
                {
                    Console.Write(x + " ");
                    count++;
                }
                else
                {
                    if (count != 0)
                    {
                        Console.Write("\n");
                    }
                    Console.Write(x + " ");
                    count++;
                }
            }
            Console.Write("\n");
        }
        

        public static void esercizio2(int righe, int colonne){
			
            int[][] jagged = new int [righe][];
            jagged[0] = new int [1];//{1};  //la riga 1 ha 1 colonne
            jagged[1] = new int [2];//{2,3};  //la riga 2 ha 2 colonne
            jagged[2] = new int [3];//{4,5,6};  //la riga 3 ha 3 colonne


            for (int i = 0; i < jagged.Length; i++)
            {
                for (int j = 0; j < jagged[i].Length; j++)
                {
                    int r = ran.Next(0, 100);
                    jagged[i][j] = r;
                }
            }


            for (int x = 0; x < jagged.Length; ++x)
            {
                for (int y = 0; y < jagged[x].Length; ++y)
                {
                    Console.Write(jagged[x][y]);
                }
            }
        }
		
          
        public static void esercizio3(int l){
            ArrayList al = new ArrayList();

            string text = " ";
            
            Console.WriteLine("\n\nQuando vui terminare inserisci 0. ");

            while (!(text.Equals("0")))
            {    
                Console.WriteLine("Inserisci una Stringa: ");
                text = Console.ReadLine();

                if(!(text.Equals("0"))){
                    _helpStringa(text, l, al);
                }
            }

            Console.WriteLine("\n");

            foreach (object x in al)
            {
                Console.WriteLine(x);
            }

        }

        private static void _helpStringa(string text, int l, ArrayList a)
        {
            if(text.Length <= l){
                a.Add(text);
            }
        }


        public static void esercizio4()
        {
            Hashtable hash = new Hashtable();
            
            hash.Add("txt", "notepad.exe");
            hash.Add("bmp", "MSpaint.exe");
            hash.Add("rtf", "winword.exe, wordpad.exe");
            hash.Add("xls", "Excel");

            Console.WriteLine("\n");

            foreach (DictionaryEntry item in hash)
            {
                Console.WriteLine(item.Key + " " + item.Value);
            }
        }


        public static void esercizio5(Utente u)
        {
            Console.WriteLine("\nInserisci il nome: ");
            u.Nome = Console.ReadLine();
            
            Console.WriteLine("Inserisci il cognome: ");
            u.Cognome = Console.ReadLine();

            Console.WriteLine("Inserisci la password: ");
            u.Password = Console.ReadLine();

            Console.WriteLine("\nI tuoi valori sono: ");
            Console.WriteLine("Nome --> " + u.Nome);
            Console.WriteLine("Cognome --> " + u.Cognome);
            Console.WriteLine("Matricola --> " + u.Matricola);
            Console.WriteLine("Pass --> " + u.Password);
            Console.WriteLine("Livello Sicurezza --> " + u.Security);

        }
    }
}

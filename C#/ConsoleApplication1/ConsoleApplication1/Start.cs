using System;
using Person;

namespace ConsoleApplication1
{
    class Start
    {
        //Main
        public static void Main()
        {
            Persona x = new Persona();
            Persona y = new Persona("Riccardo", "Golia", 50);

            string s = x.GetFirstName();

            Console.WriteLine(s + "\n");

            Console.WriteLine(x.Name);
            Console.WriteLine(x.Age);
            Console.ReadLine();
        }
    }
}

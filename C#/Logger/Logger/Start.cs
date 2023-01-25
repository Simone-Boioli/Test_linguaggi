using System;


namespace ExampleLogger
{
    class Start
    {
        public static void Main()
        {
            Logger myLogger = new Logger(ConsoleWriter);
            myLogger.Log("Messaggio di esempio");

            Console.ReadLine();
        }

        private static void ConsoleWriter(DateTime timestamp, string message)
        {
            Console.WriteLine("{0} - {1}", timestamp, message);
        }
    }
}

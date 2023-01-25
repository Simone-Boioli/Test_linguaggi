using System;
using System.Data;

namespace ExampleLogger
{
    public delegate void StringLogWriter(DateTime timestamp, string message);
    
    class Logger
    {
        private StringLogWriter writer; //delegato

        public Logger(StringLogWriter writer)
        {
            this.writer = writer;
        }

        public void Log(string message)
        {
            if (this.writer != null)
            {
                this.writer(DateTime.Now, message);
            }
        }
    }
}

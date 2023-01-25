using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml;
using System.IO;

namespace ConsoleApplication2
{
    class Program
    {
        static void Main(string[] args)
        {
            /*var setting = new XmlReaderSettings();
            setting.IgnoreComments = true;
            setting.IgnoreWhitespace = true;

            using (var reader = XmlReader.Create("articolo.xml", setting))
            {
                while (reader.Read())
                {
                    Console.WriteLine("LocalName: {0} - NodeType: {1}", reader.LocalName, reader.NodeType);
                }
            }
             */

            var setting = new XmlWriterSettings();
            setting.Indent = true;
            setting.NewLineOnAttributes = true;

            StringWriter stringWriter = new StringWriter();

            using (XmlWriter writer = XmlWriter.Create("prova.xml", setting))
            {
                writer.WriteStartDocument();

                writer.WriteStartElement("acquisizione");

                int i = 0;
                int contatorei = 1;
                
                while (i != 1000)
                {
                    //int contatore = 0;

                    //if (contatore == 0 || contatore == 1000000)
                    //{
                        

                        DateTime time = System.DateTime.Now;

                        writer.WriteElementString("ora", time.Hour + ":" + time.Minute + ":" + time.Second + ":" + time.Millisecond);

                        if (contatorei % 2 == 0)
                        {
                            writer.WriteElementString("fenomeno", "cammina");
                        }
                        else if(contatorei % 3 == 0)
                        {
                            writer.WriteElementString("fenomeno", "corre");
                        }
                        else if (contatorei % 5 == 0)
                        {
                            writer.WriteElementString("fenomeno", "rotola");
                        }
                        else
                        {
                            writer.WriteElementString("fenomeno", "fermo");
                        }

                        //if (contatore == 0)
                        //{
                        //    contatore++;
                        //    i++;
                        //}
                        /*else
                        {
                            contatore = 0;
                            i++;
                        }
                        */
                        contatorei++;
                    //}
                    //contatore++;
                    i++;
                }

                writer.WriteEndDocument();
            }

        }
    }
}

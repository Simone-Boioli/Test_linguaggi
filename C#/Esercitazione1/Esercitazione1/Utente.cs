using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Esercitazione1
{
    class Utente
    {

        static Random r = new Random();
        
        private string _nome;
        private string _cognome;
        private int _matricola = r.Next(10000,11000);
        private string _password;

        private int _security = Friendship();

        
        
        public string Nome
        {
            get
            {
                return this._nome;
            }

            set
            {
                this._nome = value;
            }
        }

        public string Cognome
        {
            get
            {
                return this._cognome;
            }

            set
            {
                this._cognome = value;
            }
        }

        public int Matricola
        {
           get
            {
                return this._matricola;
            }
        }

        public string Password
        {
            get
            {
                return this._password;
            }

            set
            {
                this._password = value;
            }
        }

        public int Security
        {
            get
            {
                return this._security;
            }

        }


        static public int Friendship()
        { 
            return (r.Next(0, 6));
        }
    }
}

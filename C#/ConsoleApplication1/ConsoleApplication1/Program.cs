using System;


namespace Person
{
    class Persona
    {
        private string _Name;
        private string _Surname { get; set; }  //proprietà automatiche
        private int _age;


        //costruttore vuoto
        public Persona()
        {
            _Name = "Mario";
            _Surname = "Bianchi";
            _age = 44;
        }

        //costruttore con parametri
        public Persona(string nome, string cognome, int eta)
        {
            _Name = nome;
            _Surname = cognome;
            _age = eta;
        }

        public string Name
        {
              get {return _Name;}
              set {_Name = value;}
        }

        public int Age
        {
            get { return _age; }
            set { _age = value; }
        }

        public string GetFirstName()
        {
            return _Name.Split(' ')[0];  
        }

    }
}

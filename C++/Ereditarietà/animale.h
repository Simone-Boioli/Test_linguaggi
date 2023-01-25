class animale{
    public:
	    animale();  //costruttore
	    ~animale();  //distruttore

    protected:
	    char specie[20];
	    int eta;
	    char sesso;

	    void mangia();
	    void beve();

    public:
	    void ottieni_dati();
};

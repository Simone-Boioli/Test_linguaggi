#include "animale.h"

class cane : public animale{   //cane è figlia di animale
    public:
	    cane();
	    ~cane();

	    void esegui_azioni();
	    void stampa_dati();

    private:
	    void abbaia();
};

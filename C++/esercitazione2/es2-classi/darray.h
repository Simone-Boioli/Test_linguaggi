#ifndef DARRAY_H
#define DARRAY_H

class darray{

private:  // da qua in poi tutto è privato

    unsigned int size;  //privato
    int *buffer;    //privato    

    
public:

    darray();  //costruttore di default    DA INSERIRE SEMPRE 1

    explicit darray(unsigned int size);  //costruttore secondario (explixit va inserito nei costr. con 1 parametro)

    darray(unsigned int size, int value);  //costruttore secondario
    
    darray(const darray &other); //costruttore di copia DA INSERIRE SEMPRE 3

    ~darray(); //distruttore tilde = altgr+^   DA INSERIRE SEMPRE 2

    darray& operator = (const darray &other);  //operatore di assegnamento  DA INSERIRE SEMPRE 4


    void resize(unsigned int size);

    void resize(unsigned int size, int value);

    void print();

    //metodi d'accesso
    unsigned int getSize(); //legge size

    int getValue(unsigned int index);  //ritorna il contenuto della cella che gli passo

    void setValue(unsigned int index, int value); //scrivo nella cella index il valore value
};


#endif

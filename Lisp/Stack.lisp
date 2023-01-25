;;;; Definiamo 2 funzioni per gestire uno stack. Ricordiamo che lo stack è una struttura dati le cui modalità d'accesso seguono una politica
;;;; LIFO(Last In First Out), ovvero tale per cui i dati vengono estratti in ordine rigorosamente inverso rispetto a quello in cui sono stati inseriti.

;;;; La prima funzione da implementare si chiama mypush: il suo scopo è inserire un elemento in cima a una lista

;;;; Esempio:
;;;; > (mypush 5 (list 1 2 3 4))
;;;; (5 1 2 3 4)

 (defun mypush (a x)
        ;1. se la lista è vuota creo una lista con il solo elemento a
        (if (null x) (cons a ())
             ;2. altrimenti inserisco in testa a x l'elemento a
             (cons a x)
        ))

;;;; La seconda funzione da implementare si chiama mypop: il suo scopo è togliere l'elemento in cima a una lista

;;;; Esempio:
;;;; > (mypop (list 5 1 2 3 4))
;;;; (1 2 3 4)


(defun mypop (x)
        ;1. controllo che la lista sia vuota
        (if (null x) nil
               ;2. altrimenti ritorno la coda della lista senza il primo elemento
               (cdr x)  
         ))

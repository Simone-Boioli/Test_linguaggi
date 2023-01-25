;;;; Definiamo 2 funzioni per gestire uno queue. Ricordiamo che lo queue è una struttura dati le cui modalità d'accesso seguono una politica
;;;; FIFO(First In First Out), ovvero tale per cui i dati vengono estratti nel ordine inverso in cui sono stati inseriti.

;;;; La prima funzione da implementare si chiama enqueue: il suo scopo è inserire un elemento in cima a una lista

;;;; Esempio:
;;;; > (enqueue 5 (list 1 2 3 4))
;;;; (5 1 2 3 4)


(defun enqueue (a x)
           ;1. se la lista è vuota creo una lista con il solo elemento a
           (if (null x) (cons a ())
                 ;2. altrimenti inserisco in testa a x l'elemento a
                 (cons a x)
           ))

;;;; La seconda funzione da implementare si chiama dequeue: il suo scopo è togliere l'elemento in coda a una lista

;;;; Esempio:
;;;; > (dequeue (list 5 1 2 3 4))
;;;; (5 1 2 3)


(defun dequeue (x)
            ;1. controllo che la lista sia vuota
            (cond ((null x) nil)
                    ;2. se la lista ha un solo elemento ritorno la lista vuota
                    ((null (cdr x)) nil)
                         ;3. creo una lista uguale a x senza però l'ultimo elemento
                         (T (cons (car x) (dequeue (cdr x)))
            )))


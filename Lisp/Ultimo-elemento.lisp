;;;; Definiamo una funzione chiamata mylast che restituisca sempre l'ultimo elemento di una lista.

;;;; Esempio:
;;;; > (mylast (list 1 2 3 4))
;;;; 4

;;;; > (mylast (list 1 2 3 '(4 5)))
;;;; (4 5)


(defun mylast (x)
        ;1. controllo che la lista sia vuota
        (cond ((null x) nil)
                ;2. controllo che la lista sia composta da un solo elemento e quindi lo restituisco
                ((null (cdr x)) (car x))
                      ;3. definisco il passo ricorsivo
                      (T (mylast (cdr x))
                 )))
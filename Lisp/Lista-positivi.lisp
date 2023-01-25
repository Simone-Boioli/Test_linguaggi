;;;;Vogliamo scrivere una funzione lista-positivi che restituisce true se l'argomento è una lista di numeri positivi, false altrimenti.

(defun pos-list (x)
      (if (not (null x))
          (if (>= (car x) 0)
              (pos-list (cdr x))
              nil)
           T)) 
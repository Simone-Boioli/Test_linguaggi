;;;; Definiamo una funzione list-gt che, passati come argomenti una una lista di numeri e un numero, restituisca una lista contenente tutti gli elementi 
;;;; della lista passata come primo parametro maggiori del numero passato come secondo parametro.
;;;; Esempio:
;;;; > (list-gt (list 1 2 3 4) 1)
;;;; (2 3 4)

(defun list-gt (x n)
       (if (not (null x)) 
           (if (> (car x) n) (cons (car x) (list-gt (cdr x) n))
                  (list-gt (cdr x) n))))
;;;; Vogliamo definire una funzione list-average che calcoli la media di una lista di numeri. Per definire questa funzione ci serviremo di due funzioni 
;;;; list-count che data una lista restituisce il numero di elementi in essa contenuti e list-sum che data una lista restituisca la somma di tutti 
;;;; i numeri in essa contenuti.


;;;;list-count
(defun list-count (x)
        (if (not (null x)) (+ 1 (list-count (cdr x))) 0))


;;;;list-sum
(defun list-sum (x)
        (if (not (null x)) (+ (car x) (list-sum (cdr x))) 0))


;;;;list-average
(defun list-average (x)
(if (not (null x)) (/ (list-sum x) (list-count x)) 0)) 
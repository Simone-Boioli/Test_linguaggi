; Vogliamo definire una funzione list-average che calcoli la media di una lista di numeri. Per definire questa funzione 
; ci serviremo di due funzioni list-count che data una lista restituisce il numero di elementi in essa contenuti e 
; list-sum che data una lista restituisca la somma di tutti i numeri in essa contenuti.


;list-count
(defun list-count (x)
        (if (not (null x)) (+ 1 (list-count (cdr x))) 0))


;list-sum
(defun list-sum (x)
        (if (not (null x)) (+ (car x) (list-sum (cdr x))) 0))


;list-average
(defun list-average (x)
(if (not (null x)) (/ (list-sum x) (list-count x)) 0)) 




; Definiamo una funzione list-gt che, passati come argomenti una una lista di numeri e un numero, restituisca una 
; lista contenente tutti gli elementi della lista passata come primo parametro maggiori del numero passato come 
; secondo parametro.
;
; Esempio:
; > (list-gt (list 1 2 3 4) 1)
; (2 3 4)

(defun list-gt (x n)
       (if (not (null x)) 
           (if (> (car x) n) (cons (car x) (list-gt (cdr x) n))
                  (list-gt (cdr x) n))))


; Vogliamo scrivere una funzione lista-positivi che restituisce true se l'argomento è una lista di numeri positivi, 
; false altrimenti.

(defun pos-list (x)
      (if (not (null x))
          (if (>= (car x) 0)
              (pos-list (cdr x))
              nil)
           T)) 


; Definiamo una funzione chiamata mylast che restituisca sempre l'ultimo elemento di una lista.
;
; Esempio:
; > (mylast (list 1 2 3 4))
; 4

; > (mylast (list 1 2 3 '(4 5)))
; (4 5)


(defun mylast (x)
        ;1. controllo che la lista sia vuota
        (cond ((null x) nil)
                ;2. controllo che la lista sia composta da un solo elemento e quindi lo restituisco
                ((null (cdr x)) (car x))
                      ;3. definisco il passo ricorsivo
                      (T (mylast (cdr x))
                 )))





; Definiamo la funzione sum-list che somma tutti gli elementi contenuti in una lista a qualsiasi livello si trovino
;
; Esempio:
; > (sum-list '(101 2 (2 4) 2 ((6) 5) 4 (3 2 1)))
; 132


(defun sum-list (lista)
	(cond ((atom lista) lista)
	      ((null (cdr lista)) (sum-list (car lista)))
	      (T (+ (sum-list (car lista)) (sum-list (cdr lista))))))





; Definiamo la funzione count-element che restituisca il numero di volte che un elemento compare in una lista a qualsiasi 
; livello si trovi
;
; Esempio:
; > (count-element 2 '(1 2 (2 4) 2 ((6) 5) 4 (3 2 1)))
; 4

;(defun count-element (elemento lista)
;	(if ((null lista) nil) (count-element-helper elemento lista)))

;(defun count-element-helper (elemento lista)
;	(cond ((atom lista) (if (eq elemento lista) 1 0))
;	      ((null (cdr lista)) (count-element elemento (car lista)))
;	      (T (+ (count-element elemento (car lista)) (count-element elemento (cdr lista))))))








; Definiamo la funzione count-all-element che restituisca il numero di elementi contenuti in una lista a qualsiasi livello
; si trovino
;
; Esempio:
; > (count-all-element '(1 6 7 2 (3 4 (5) 7))
; 8

(defun count-all-element (x)
	(cond ((null x) nil)
	      ((atom x) nil)
	      ((listp (car x)) (+ (count-all-element (car x)) (count-all-element (cdr x))))
              (T (+ 1 (count-all-element (cdr x))))))










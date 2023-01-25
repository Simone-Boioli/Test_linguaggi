; Creare una funzione che riceva due parametri a e b e crei una
; funzione capace di controllare se l’unico parametro ricevuto sia
; compreso all’interno dell’intervallo [a,b)


(defun create-check-interval(a b)
	(lambda (num) (if (and (>= num a) (< num b)) T nil)))

; Esempio:
; > (apply-rpn '(4 5 +))
;   9

(defun apply-rpn (lista)
 	(lambda (;;;;;;;;;)
             (car lista)
	     (car (cdr lista))))


(defun rpn (rpn-exp)
	(eval-rpn rpn-exp '()))

(defun eval-rpn (rpn-exp stack)
	(if (null rpn-exp) (car stack)
		(let 

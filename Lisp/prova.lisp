(defun metodo-newton (x c)  ;; x ---> valore da calcolare   c ---> congettura
  (if (va-bene x c) c
      (metodo-newton x (migliora c x))))

(defun va-bene (x c)
  (< (valore-assoluto (- x (quadrato c))) 0.001))

(defun valore-assoluto (x)
  (cond ((> x 0) x)
        ((= x 0) 0)
        ((< x 0) (- x))))

(defun quadrato (x)
  (* x x))

(defun migliora (c x)
  (media c (/ x c)))

(defun media(x y)
  (/ (+ x y) 2))


(defun list-ref (n lista)
  (if (<= n 0) (car lista)
      (list-ref (- n 1) (cdr lista))))
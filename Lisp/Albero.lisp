;creazione di un nodo
(defun make-node (key lefts rights) 
     (list key lefts rights))     

;estrazione della chiave di un nodo
(defun node-key (node) 
     (car node))

;estrazione del figlio sinistro
(defun node-left (node) 
     (car (cdr node)))

;estrazione del figlio destro
(defun node-right (node) 
     (car (cdr (cdr node))))

;funzione di inserimento
(defun insert (key node)
	(cond ((null node) (list key nil nil))
	      ((atom node) (error "nodo non corretto"))
	      ((< key (car node)) (make-node (car node) (insert key (node-left node)) (node-right node)))
	      (T (make-node (car node) (node-left node) (insert key (node-right node))))))
		 	

;funzione inorder
(defun inorder (node)
	(cond ((null node) nil)
	      ((atom node) (error "nodo non corretto"))
	      (T (append (inorder (node-left node)) (list (node-key node)) (inorder (node-right node))))))

;funzione preorder
(defun preorder (node)
	(cond ((null node) nil)
	      ((atom node) (error "nodo non corretto"))
	      (T (append (list (node-key node)) (preorder (node-left node)) (preorder (node-right node))))))

;funzione postorder
(defun postorder (node)
	(cond ((null node) nil)
	      ((atom node) (error "nodo non corretto"))
	      (T (append (postorder (node-left node)) (postorder(node-right node)) (list (node-key node))))))



; Costruire una funzione subtree che, data una chiave ed un albero, restituisca il sotto albero che abbia come radice il
;  nodo contenente la chiave passata come parametro.

(defun subtree (key node)
	(cond ((null node) nil)
	      ((atom node) (error "nodo non corretto"))
	      ((eq key (car node)) node)
	      (T (if (< key (car node)) (subtree (node-left node)) (subtree (node-right node)))))) 


; Creiamo, a partire dalle funzioni che abbiamo visto per operare su un albero, una mappa che permetta di memorizzare 
; delle coppie chiave-valore, dove la chiave deve essere una stringa.
;
; Esempio:
; Vogliamo creare una mappa contenente le seguenti informazioni:
; Everest - 8848 Bianco - 4695 K2 - 8611 Olympus -2355
;
; > (map-put 'Everest 8848 (map-put 'Bianco 4695 (map-put 'K2 8611 (map-put 'Olympus 2355 nil)))))
; (OLYMPUS (K2 (BIANCO NIL (EVEREST NIL NIL 8848) 4695) NIL 8611) NIL 2355)
;
; Effettuiamo ora una ricerca nella mappa; cerchiamo l'altezza del K2:
;
; > (map-get 'K2 (map-put 'Everest 8848 (map-put 'Bianco 4695 (map-put 'K2 8611 (map-put 'Olympus 2355 nil)))))
; 8611
;
; Per prima cosa definiamo le funzioni make-entry che crea un node della mappa (chiamato entry) e node-value che 
; restituisce il valore contenuto in un nodo.

(defun make-entry (key lefts rights value)
	(list key lefts rights value))

(defun node-value (node)
	(car (cdr (cdr (cdr node)))))

; Definiamo ora le funzione map-put che aggiunge un elemento chiave,valore ad una mappa
 
(defun map-put (key value node)
	(cond ((null node) (make-entry key nil nil value)
	      ((atom node) (error "nodo non valido"))
	      ((eql key (key-node node)) (make-entry key (node-left node) (node-right node)) value)
	      ((string< key (node-key node)) (make-entry (car node) (map-put (key value (node-left node))) 
			(node-right node) (node-value node)))
	      (T (make-entry (node-key node) (node-left node) (map-put key value (node-right node)) (node-value node))))))

; Definiamo ora la funzione map-get che, data una chiave ed una mappa, restituisca il valore associato alla chiave.


(defun map-get (key node)
	(cond ((null node) nil)
	      ((atom node) (error "atomo non valido"))
              ((eq key (car node)) (node-value node))
	      (T (if (string< key (car node) (map-get key (node-left node)) (map-get key (node-right node)))))))











prefisso([], _).
prefisso([X|A], [X|B]) :- prefisso(A, B).

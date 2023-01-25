natural_number(0).
natural_number(s(X)) :- natural_number(X).

leq(0, X) :- natural_number(X).
leq(s(X), s(Y)) :- leq(X,Y).



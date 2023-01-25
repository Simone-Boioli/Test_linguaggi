natural_number(0).
natural_number(s(X)) :- natural_number(X).


plus(0, X, X) :- natural_number(X).
plus(s(X), Y, s(Z)) :- plus(X, Y, Z).
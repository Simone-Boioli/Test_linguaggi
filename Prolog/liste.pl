list([]).
list([X|Xs]) :- list(Xs).

member(X,[X]).
member(X,[X|H]).
member(X,[H|T]) :- member(X,T).

delete(X,[],[]).
delete(X,[X|H],H) :- !.
delete(X,[Z|R],[Z|H]) :- delete(X,R,H).



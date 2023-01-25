addition_table(A) :-
member(B, A),
member(C, A),
D is B + C,
assert(sum(B, C, D)),
fail.


member(X, [X|_]).
member(X, [_|Xs]) :- member(X, Xs).

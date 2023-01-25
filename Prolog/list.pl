% dico se X è contenuto nella lista
member(X, [X|Xs]).
member(X, [Y|Ys]) :- member(X,Ys).

%prefisso
prefix([ ], Ys).
prefix([X|Xs], [X|Ys]) :- prefix(Xs, Ys).

%suffisso
suffix(Xs, Ys) :- !.
suffix(Xs, [Y|Ys]) :- suffix(Xs, Ys).

%sublist
sublist(Xs, Ys) :- prefix(Ps, Ys), suffix(Xs, Ps),!.
sublist(Xs, Ys) :- prefix(Xs, Ss), suffix(Ss, Ys),!.
sublist(Xs, Ys) :- prefix(Xs, Ys),!.
sublist(Xs, [Y|Ys]) :- sublist(Xs, Ys).

%append
append([ ], Ys, Ys).
append([X|Xs], Ys, [X|Zs]) :- append(Xs, Ys, Zs). 

%reverse
reverse([ ], [ ]).
reverse([X|Xs], Zs) :- reverse(Xs,Ys), append(Ys, [X], Zs). 

%length
length_2([ ], 0).
length_2([X|Xs], s(N)) :- length_2(Xs,N).  

%delete
delete(X, [X|R], R).
delete(_, [ ], [ ]).
delete(X , [Y|R], [Y|NewR]) :- X\=Y, delete(X, R, NewR).
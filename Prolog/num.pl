%% numero naturale
natural_number(0).
natural_number(s(X)) :- natural_number(X).

%% x<=y
leq(0, X) :- natural_number(X).
leq(s(X), s(Y)) :- leq(X, Y).

%%	somma
plus(0, X, X) :- natural_number(X).
plus(s(X), Y, s(Z)) :- plus(X, Y, Z).

%%	motiplicazione
times(0, X, 0).
times(s(X), Y, Z) :- times(X, Y, XY), plus(XY, Y, Z).

%%	esponenziale
exp(s(X), 0, 0).
exp(0, s(X), s(0)).
exp(s(N), X, Y) :- exp(N, X, Z), times(Z, X, Y).

%%	fattoriale
factorial(0, s(0)).
factorial(s(N), F) :- factorial(N, F1), times(s(N), F1, F).

%%	minimo tra due numeri
minimum(N1, N2, N1) :- leq(N1, N2).
minimum(N1, N2, N2) :- leq(N2, N1).


%%%%%%%%%%%%%   liste   %%%%%%%%%%%%%%
%%	guarda se il primo argomento è contenuto nel secondo
member(X, [X|Xs]).
member(X, [Y|Ys]) :- member(X, Ys).

%%	prefisso
prefix([], Ys).
prefix([X|Xs], [Y|Ys]) :- prefix(Xs, Ys).

%%	suffisso
suffix(Xs, Ys).
suffix(Xs, [Y|Ys]) :- suffix(Xs, Ys).


%%	delete
delete(X, [X|R], R).
delete(_, [], []).
delete(X, [Y|R], [Y,NewR]) :- X\=Y, dalete(X, R, NewR).

%%	append , concatenazione di due liste
append([], Ys, Ys).
append([X|Xs], Ys, [X|Zs]) :- append(Xs, Ys, Zs).

%lunghezza
lenght([], 0).
lenght([_|Y], s(N)) :- lenght(Y, N).

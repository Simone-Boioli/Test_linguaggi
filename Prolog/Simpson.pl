padre(homer, bart).
padre(homer, lisa).
padre(homer, maggie).
padre(abrahm, homer).

madre(marge, bart).
madre(marge, lisa).
madre(marge, maggie).
madre(jacqueline, marge).
madre(jacqueline, patty).
madre(jacqueline, selma).

maschio(bart).
maschio(homer).

femmina(lisa).
femmina(maggie).
femmina(marge).
femmina(patty).
femmina(selma).
femmina(jacqueline).

genitore(X, Y) :- padre(X, Y).
genitore(X, Y) :- madre(X, Y).

figlio(X, Y) :- genitore(Y, X), maschio(X).

figlia(X, Y) :- genitore(Y, X), femmina(X).

antenato(X, Y) :- genitore(X, Y).
antenato(X, Y) :- genitore(Z, Y), antenato(X, Z).

fratello(X, Y) :- maschio(X), genitore(Z, X), !, genitore(Z, Y), X\=Y.

sorella(X, Y) :- femmina(X), genitore(Z, X), !, genitore(Z, Y), X\=Y.

zia(X, Y) :- sorella(X, Z), genitore(Z, Y).

nonno(X, Y) :- maschio(X), genitore(X, Z), genitore(Z, Y).

nonna(X, Y) :- femmina(X), genitore(X, Z), genitore(Z, Y).



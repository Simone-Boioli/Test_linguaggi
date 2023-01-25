maschio(simone).
maschio(omar).
maschio(nando).

femmina(nora).
femmina(luigia).

figlio(simone).
figlio(omar).

padre(nando, simone).
padre(nando, omar.

madre(nora, simone).
madre(nora, simone).

fratello(X,Y) :- maschio(X), padre(Z,X), padre(Z,Y).
fratello(X,Y) :- maschio(X), madre(Z,X), madre(Z,Y).




#
#commenti
#

# Questo è un commento

'''
Questo è 
un commento su più 
righe
'''

#
#funzione print
#
print('Hello World')

a = 12
b = 3
print(a, b, a-b)

c = 'Hello'
print(c, 'World')


#
#funzione input
#
nome = input('Inserisci il tuo nome: ')
print ('Il tuo nome è: ', nome)


#
#conversione in float
#
raggio = input('Inserisci il raggio: ')
r = float(raggio)
print(raggio, r)
print ('Area:', 3.14 * r**2)
print ('Circonferenza: ', 2*3.14*r)


#
#indentazione al posto delle parentesi
#
i = 4
print('stampo sempre prima')
if i == 3:
    print('eseguito se la condizione è vera')
print('stampo sempre dopo')


#
# Variabili
#
numero = 10
stringa = "Python"
lista = [1, 2, 3]

#
# Operatori
#
print("------------ OPERATORI -----------")
print(5 + 5) #somma
print(5 - 3) #sottrazione
print(5 * 2) #moltiplicazione
print(10 / 3) #divisione
print(10 // 3) #divisione intera
print(10 % 3) #modulo - resto
print(2**3) #elevamento a potenza

#
# Confronto
#
print("-------- CONFRONTO ----------")

print(8 == 8)
print(2 != 2)
print(3 < 4)
print(3 <= 3)


#
# Stringhe
#
print("----------- STRINGHE ------------")

s = 'Python'
print(s[0]) #primo carattere
print(s[-1]) #ultimo carattere
print(s[0:2]) #primi 2 caratteri
print(s[4: ]) #dal 4 carattere in poi

print('P' in s) #controlla se il carattere P è nella stringa
print("Py" not in s) #controlla se i caratteri non sono nella stringa

print(len(s)) #funzione che stampa la lunghezza della stringa
print(s.upper()) #metodo che stampa tutto in maiuscolo

area = 3.14 * r**2
circ = 2 * 3.14 * r
q = ("L'area è {}, la circonferenza è {}")
print(q.format(area, circ))


#
# Tupla
#
print("-------- TUPLE -------- ")

t = ('abc', 2, 2.5, "test")
print (t)
print(type(t))
print(len(t))
print(t[0]) #stampa il primo valore della tupla
print(t.count(2))


#
# Liste
#
print("--------- LISTE --------")

num = [0,1,2,3] #lista di 4 elementi
print(num)
print(type(num))
print(num[0]) #primo valore della lista
print(num[-1]) #ultimo valore della lista
print(len(num))
num.append(4) #aggiunge il valore alla fine della lista
print(num)
num.insert(2, 8) #aggiungo alla posizione 2 il valore 8
print(num)
num.sort() #ordino la lista
print(num)
num.reverse() #inverte i valori della lista
print(num)


#
# DIZIONARI
#
print("-------------- DIZIONARIO --------------- ")

d = {'a':1, 'b':2, 'c':3} #dizionario con chiave:valore
print(d)
print(type(d))
print(d['a']) #stampo il valore della chiave passata
print('x' in d) #controlla se è presente la chiave x nel dizionario
print('b' in d)
d['x'] = 123 #inserisco un nuovo valore
print(d)
del d['b'] #cancello va chiave passata
print(d)
print(len(d))
print(d.keys()) #stampa le chiavi
print(d.values()) #stampa i valoro


#
# SET - FROZENSET
#
print("--------------- SET - FRONZENSET --------------")
nums = {10,20,40,30} #set di elementi
print(nums)
print(type(nums))
fnums = frozenset(nums) #frozenset a partire da set
print(fnums)
print(type(fnums))

nums2 = {10,20,10,40,10,30} #set deve avere gli elementi unici 
print(nums2) #durante la stampa vengono tolti i duplicati

print(len(nums))
print(min(nums)) #stampa il valore minimo
print(max(nums)) #stampa il volore massimo
nums.add(50) #aggiunge l'elemento al set
print(nums)
nums.remove(10) #rimuove l'elemento
print(nums)


#
# ISTRUZIONI CONDIZIONALI
#
print("---------- ISTRUZIONI CONDIZIONALI ----------")
print("||||| Calcolo del numero intero |||||")
n = int(input("Inserisci un numero: "))
if (n < 0): #se il numero è negativo
    n = -n #rende il n positivo
print('Il valore assoluto è: ', n)

print("||||| Numero maggiore o minore di 10 |||||")
y = int(input("Inserisci un numero: "))
if(y < 10):
    print("il numero è minore di 10")
else:
    print("il numero è maggiore di 10")

print("||||| Calcolo del numero |||||")
j = int(input("Inserisci un numero: "))
if(j < 0):
    print(j, 'è negativo')
elif(j > 0):
    print(j, 'è positivo')
else:
    print(j, 'è zero')


print("----------- CICLO FOR -----------")
print("||||| Stampa il quadrato dei numeri |||||")
seq = [1, 2, 3, 4, 5]

for n in seq:
    print('Il quadrato di ', n, ' è ', n**2)


print("||||| Stampa se i numeri sono pari o dispari |||||")
seq2 = [1, 2, 3, 4, 5]
for n in seq2:
    print('il numero', n, 'è ', end= ' ') #end='' -> si toglie il ritorno a capo
    if n%2 == 0:
        print("pari")
    else:
        print("dispari")


print("||||| Stampa i numeri di un range |||||")
for n in range(1, 6):
    print(n)

print("|||| Stampare Python 3 volte ||||||")
for n in range(3):
    print ("Python")


print("---------- CICLO WHILE ---------")
print("stampa e rimuovi  i valori dal 10 fino al 4 lasciano 3-2-1")

seq3=[1,2,3,4,5,6,7,8,9,10]

while len(seq3) > 3:
    print(seq3.pop())


print("------- Comprehension -----------")
print ([x**2 for x in range(10)]) #crea una lista di quadrati
print({x**3 for x in range(10)}) #crea un set di cubi
print({k:k.upper() for k in 'abcde'}) # crea un dizionario
print([x for x in range(10) if x%2 == 0]) #crea un lista di solo n pari

print("------------- FUNZIONI -----------")
def is_even(n):
    """ Commento interno (docstring) per commentare una funzione"""
    if n%2 == 0:
        return True
    else:
        return False

print(is_even(8))

print("|||||||| Funzione senza parametri ||||||||||||")
def say_hello():
    print("Hello World")

say_hello()

print("||||||||| Funzione con parametro di default ||||||||||")
def say_hello2(name='World'):
    print("Hello {}!".format(name))

say_hello2()
say_hello2('Python')

print("|||||||| funzione con return |||||||||")

def print_twice(testo):
    if not testo:
        return #termina senza parametri
    print(testo)
    print(testo)

print_twice('ciao')


def quadrato(m):
    return m**2

quad = quadrato(3)
print("il quadrato è: ", quad)

print("----------- ECCEZIONI ---------------")
try:
    n = 8 / 0
except ZeroDivisionError as err:
    print("Invalid Operation ({})".format(err))


if size < 0:
    raise ValueError('Errore!!!') #solleva un'eccezione in caso size < 0


print("-------------- FILE ------------")
f = open('testo.txt', 'a');
print("Il nome del file è: ", f.name)
print("Il metodo di apertura è: ", f.mode)
f.write('sono la prima riga del testoi\n')
f.write(' seconda riga\n')
f.close()

#leggiamo il contenuto
f1 = open('testo.txt')
contenuto = f1.read()
print (contenuto)
prima = f1.readline()
print(prima)
f1.close()

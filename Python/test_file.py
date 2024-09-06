"""
File di test file su Python
"""
import os

##
## Lavorare su file
##
contenuto = "Questo è il primo testo"
directory = os.getcwd()
print(directory)

#apertura file in modalità write
file = open("file.txt", "w")

#scrittura
file.write(contenuto)

# chiusura del file
file.close()

##################################
#apertura file in modalità append
file1 = open("file.txt", "a")

#scrittura
file1.write("\nTesto aggiunto alla fine")

# chiusura del file
file1.close()

##################################
#apertura file in modalità read
var_lettura = open("file.txt","r").read()
print(var_lettura)

##################################
#apertura file in modalità readlines
var_lettura2 = open("file.txt","r").readlines()
print(var_lettura2)
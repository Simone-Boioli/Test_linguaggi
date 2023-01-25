'''
 Nome: 04_peso2.py
 Data: 29/01/2019
 Scopo: calcola il peso volumetrico di un pacco 12x10x8
 Autore: Simone Boioli
'''


#dimensioni pacco
lunghezza = 0
larghezza = 0
altezza = 0

#volume pacco
volume = 0

#peso volumetrico
peso = 0.0

#coefficente di calcolo
coefficente = 0


#######
#pacco#
#######
altezza = int(input("Inserisci l'altezza del pacco: ")) 
lunghezza = int(input("Inserisci la lunghezza del pacco: "))
larghezza = int(input("Inserisci la larghezza del pacco: "))

print("")

print("+------------------+")
print("|DHL       | 5000  |")
print("|Bartolini | 3000  |")
print("|SDA       | 3333  |")
print("|UPS       | 5000  |")
print("+------------------+")

coefficente = int(input("Inserisci il coefficente in base allo spedizioniere: "))

volume = altezza * lunghezza * larghezza
peso = volume / coefficente


print('Volume: ', volume, 'cm^3')
print('Peso volumetrico: ', peso, 'Kg')


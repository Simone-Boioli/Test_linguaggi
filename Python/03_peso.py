#
# Nome: 03_peso.py
# Data: 29/01/2019
# Scopo: calcola il peso volumetrico di un pacco 12x10x8
# Autore: Simone Boioli
#


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
altezza = 33
lunghezza = 40
larghezza = 45

coefficente = 5000   #DHL

volume = altezza * lunghezza * larghezza
peso = volume / coefficente


print('Volume: ', volume, 'cm^3')
print('Peso volumetrico: ', peso, 'Kg')


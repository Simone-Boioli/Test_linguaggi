'''
Nome: 05_Fahrenheit-Celsius
Data: 29/01/2019
Autore: Simone Boioli

'''

PUNTO_CONGELAMENTO = 32.0
FATTORE_SCALA = 5.0/9.0

fahr = int(input("Inserisci i gradi fahrenheit: "))

celsius = (fahr - PUNTO_CONGELAMENTO) * FATTORE_SCALA


print("I gradi Celsius sono: ", celsius)

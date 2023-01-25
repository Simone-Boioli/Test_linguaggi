import os
import platform

#VARIABILI
nome = ''
cognome = ''

cont = 0

lista =[]
dizionario = {}

scelta = -1
scelta_cancellazione = -1


print("########### RUBRICA #############\n")

while True:
	#MENU
	print("########### MENU ###############")
	print("1 - Inserisci nuovo utente")
	print("2 - Stampa la rubrica")
	print("3 - Cancella una voce della rubrica")
	print("4 - Cerca un utente")
	print("0 - Uscita")


	#SCELTA
	scelta = int(input("SCELTA: "))

	if (scelta == 1):
		with open('dati.txt', 'a') as file:

			print ("------ NUOVO UTENTE ------")
			nome = input("Inserisci il nome: ")
		#	lista.append(nome + "\n")
			file.write(nome + "\n")

			cognome = input("inserisci il cognome: ")
		#	lista.append(cognome + "\n\n")
			file.write(cognome + "\n\n")
			
		#	file.writelines(lista)

			clear_screen()

			print("\nHai inserito: ")
			print("NOME: ", nome)
			print("COGNOME: ", cognome)
			print("\n")

			cont = cont + 1

			dizionario = {}

	elif (scelta == 2):
		with open('dati.txt') as file:

			for line in file:
				print(line)
		

	#elif (scelta == 3):
	#	print ("------ CANCELLAZIONE ------")
	#	print ("1 - Cancella un utente")
	#	print ("2 - Cancella tutta la rubrica")
	#	scelta_cancellazione = int(input("SCELTA: "))

	#	file = open('dati.txt', 'a')

	#	if (scelta_cancellazione == 1):
	#		print("DA SVILUPPARE!!!!!!!")

	#	elif (scelta_cancellazione == 2):

	#	file.close()

	elif (scelta == 4):
		print ("------ CERCA UTENTE ------")

		with open('dati.txt') as file:
			cerca = input("Inserisci il nome da cercare: ")

			for line in file:
				if line is 'mario':
					print("TROVATO")
				#	print(line)


	elif (scelta == 0):
		exit("Stai uscendo dalla rubrica")



#file.close()


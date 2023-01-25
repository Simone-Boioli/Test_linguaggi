import os, platform

def clear_screen():
	platf = platform.system()
	if platf == 'Linux' or platf == 'Darwin':
		os.system('clear')
	if platf == 'Windows':
		os.system('cls')
	return 0

clear_screen()
print("#################################")
print("########### RUBRICA #############")
print("#################################\n")

lnomi = []  #inizializzo lista di nomi
ltel = []   # inzializzo lista di numeri



while True:
	#MENU
	
	print("########### MENU ###############")
	print("1 - Inserisci nuovo utente")
	print("2 - Stampa la rubrica")
	print("3 - Cerca un utente")
	print("0 - Uscita")


	#SCELTA
	scelta = int(input("SCELTA: "))

	if (scelta == 1):
		

		print ("------ NUOVO UTENTE ------")
		nome = input("Nome: ")

		if nome != '':
				lnomi.append(nome)
				tel = input ("Telefono: ")
				ltel.append(tel)
				print ("Inserimento riuscito")
				print (nome + " " + tel)
		else:
			print ("Nessun contatto inserito")

	elif (scelta == 2):
		
		
		print ("------ STAMPA RUBRICA ------")
		if len(lnomi) != 0: #non è una lista vuota
			print ("Rubrica: ")
			for i in range(0, len(lnomi)):
				print (lnomi[i] + " " + ltel[i])
		else:
			print("RUBRICA VUOTA")

	elif (scelta == 3):
		

		print ("------ CERCA UTENTE ------")
		
		if len(lnomi) != 0: #non è una lista vuota
			nome = input("Ricerca nome utente: ")
			i = 0
			while i < len(lnomi) and lnomi[i]!=nome:
				i+=1
			if i==len(lnomi):
				print (nome + " non trovato")

			else:
				print (lnomi[i] + " " + ltel[i])
				print("\n-----------------------------------------")
				print("============= MENU UTENTE ===========")
				print("1 - Modifica")
				print("2 - Cancella")

				scelta2 = int(input("SCELTA: "))

				if(scelta2 == 1): #MODIFICA
					nome = input("Inserisci nuovo nome: ")
					if nome != "":
						lnomi[i] = nome

					tel = input("Inserisci nuovo telefono: ")
					if tel != "":
						ltel[i] = tel

					print("Modifica riuscita")
					print(lnomi[i] + " " + ltel[i])

				elif(scelta2 == 2): #CANCELLAZIONE
					s = input(print("SEI SICURO DI VOLER CANCELLARE IL CONTATTO? (y/n)"))

					if s== "y":
						del lnomi[i]
						del ltel[i]
						print("cancellazione riuscita")
		else:
			print("RUBRICA VUOTA")


	elif (scelta == 0):
		break

clear_screen()
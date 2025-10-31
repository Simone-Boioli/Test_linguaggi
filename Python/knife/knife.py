import os

while(True):
    print ("##############################")
    print ("######### KNIFE v0.1 #########")
    print ("##############################")
    print ("== Comandi di sistema ==")
    print ("1a| cpu")
    print ("== Uscita ==")
    print ("0 | USCITA")

    scelta = int(input("Scegli: "))

    if (scelta == '0'): break
    elif (scelta == '1a'):
        os.system("top")
    else: 
        print("Comando Errato")



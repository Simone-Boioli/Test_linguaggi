CC=g++          #variabile che contiene g++
CFLAGS=-c -Wall #variabile che contiene le opzioni di compilazione
LFLAGS=-Wall -g
FILES= main.cpp factorial.cpp hello.cpp function.h Makefile hello

all:  hello

hello: main.o factorial.o hello.o
	$(CC) main.o hello.o factorial.o $(LFLAGS) -o hello

main.o: main.cpp
	$(CC) $(CFLAGS) main.cpp

factorial.o: factorial.cpp
	$(CC) $(CFLAGS) factorial.cpp

hello.o: hello.cpp
	$(CC) $(CFLAGS) -c hello.cpp

clean: 
	rm -rf *.o *.tar.gz

tar:
	tar cvzf 726281.tar.gz $(FILES)

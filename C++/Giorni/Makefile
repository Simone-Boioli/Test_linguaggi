CC=g++
CFLAGS=-c -Wall

GiorniTrascorsi: date.o test_date.o
	$(CC) date.o test_date.o -o GiorniTrascorsi

date.o: date.cpp date.h
	$(CC) $(CFLAGS) date.cpp

test_date.o: test_date.cpp date.h
	$(CC) $(CFLAGS) test_date.cpp

clean:
	rm -rf *.o

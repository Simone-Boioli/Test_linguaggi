roman: test_roman.o roman.o
	g++ test_roman.o roman.o -o roman

test_roman.o: test_roman.cpp roman.h
	g++ -c test_roman.cpp 

roman.o: roman.cpp roman.h
	g++ -c roman.cpp

clean:	
	rm -rf *.o

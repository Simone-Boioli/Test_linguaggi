test: nsqrt.o test_nsqrt.o
	g++ nsqrt.o test_nsqrt.o -o test

nsqrt.o: nsqrt.cpp nsqrt.h
	g++ -g -c nsqrt.cpp

test_nsqrt.o: nsqrt.h test_nsqrt.cpp
	g++ -g -c test_nsqrt.cpp

clean:
	rm -f *.o

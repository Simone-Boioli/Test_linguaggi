package Implementazioni;

import junit.framework.TestCase;

public class TestQueue extends TestCase {
	public void testqueue(){
		Queue coda = new Queue(3);
		
		coda.Enqueue(0);
		assertEquals(coda.head, 0);
		assertEquals(coda.tail, 1);
		
		coda.Enqueue(1);
		assertEquals(coda.head, 0);
		assertEquals(coda.tail, 2);
		
		coda.Enqueue(2);
		assertEquals(coda.head, 0);
		assertEquals(coda.tail, 0);
		
		coda.Enqueue(3);  //overflow
		assertEquals(coda.head, 0);
		assertEquals(coda.tail, 0);
		
		coda.Dequeue();
		assertEquals(coda.head, 1);
		assertEquals(coda.tail, 0);
		
		coda.Dequeue();
		assertEquals(coda.head, 2);
		assertEquals(coda.tail, 0);
		
		coda.Dequeue();
		assertEquals(coda.head, 0);
		assertEquals(coda.tail, 0);
		
		coda.Dequeue(); //underflow
		assertEquals(coda.head, 0);
		assertEquals(coda.tail, 1);
		
		coda.Enqueue(4);
		assertEquals(coda.head, 0);
		assertEquals(coda.tail, 1);
		
	}
}

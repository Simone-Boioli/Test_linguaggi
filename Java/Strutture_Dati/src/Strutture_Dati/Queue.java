/*
 * code con array
 */

package Strutture_Dati;

public class Queue {
	public Object [] queue;
	public int head;
	public int tail;
	
	public Queue(int capacita){
		this.queue = new Object[capacita];
		this.head = 0; 
		this.tail = 1;
	}
	
	public void Enqueue(Object o){

		if(tail == head){
			System.out.println("Overflow");
		}else{
			if(queue[head] == null){
				queue[head] = o;
			}else{
				if(tail == queue.length-1){
					queue[tail] = o;
					tail = 0;
				}else{
					queue[tail] = o;
					tail++;
				}
			}
		}
	}
	
	public Object Dequeue(){
		Object ritorno = null;
		if(head == tail && queue[head] == null){
			System.out.println("Underflow");
			tail++; // per non avere i puntatori uguali
		}else{
			if(head == queue.length-1){
				ritorno = queue[head];
				queue[head] = null;
				head = 0;
			}else{
				ritorno = queue[head];
				queue[head] = null;
				head ++;
			}
		}
		return ritorno;
	}
	
}
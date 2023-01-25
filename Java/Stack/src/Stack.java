
public class Stack {
	private Object[] stack;     // stack
	private int top;  //indica la prima posizione libera nel vettore
	
	public Stack(int capacita) {
		stack = new Object[capacita];
		top = -1;
	}
	
	public void push(Object o) {
		try{
		if (top==(stack.length)){
			System.out.println("OVERFLOW");
		}
		else{
			top++;
			stack[top] = o;
			System.out.println("elemento inserito");
		}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("OVERFLOW");
		}
	}
	
	public Object pop() {
		Object ritorno = null;
		if (top == -1){
			System.out.println("UNDERFLOW");
		}	
		else{
			ritorno = stack[top];
			stack[top] = null;
			top --;
			System.out.println("Elemento ritornato");
		}
		return ritorno;
	}
	
	public boolean stackEmpty() {
		if(top == -1)
			return true;
		else
			return false;
	}

}

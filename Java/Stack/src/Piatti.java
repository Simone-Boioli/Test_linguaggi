
public class Piatti {
	
	public static void main(String [] args){
		Stack stack = new Stack (5); // creo uno stack con 5 posizioni
		Piatti piatto1 = new Piatti();
		Piatti piatto2 = new Piatti();
		Piatti piatto3 = new Piatti();
		Piatti piatto4 = new Piatti();
		Piatti piatto5 = new Piatti();
		
		System.out.println(stack.stackEmpty());
		stack.push(piatto1);
		stack.push(piatto2);
		stack.push(piatto3);
		stack.push(piatto4);
		stack.pop();
		stack.push(piatto4);
		stack.push(piatto5);
		stack.push(piatto1);
		stack.pop();
		stack.pop();
		System.out.println(stack.stackEmpty());
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		
	}
}

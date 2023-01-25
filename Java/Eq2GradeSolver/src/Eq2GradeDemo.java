/**
    Classe test per il risolutore di equazioni di secondo grado
s8    (usa la classe Eq2GradeSolver).

    Usage: ExceptionDemo2 num1 num2 num3
	
    Gestisce le eccezioni:
	
    ArrayIndexOutOfBoundsException 
    NumberFormatException 
	
    NoEq2ndOrderException 
    ImNumberException
   
*/
public class Eq2GradeDemo {
	public static void main(String[] args) {
        Eq2GradeSolver solver = new Eq2GradeSolver(); 

        try {
            // Possono essere lanciate le eccezioni:
            // - ArrayIndexOutOfBoundsException (args[]) , se l'utente
            //   fornisce meno di 3 parametri
            // - NumberFormatException (.doubleValue()), se l'utente
            //   non fornisce stringhe di numeri
            double a = new Double(args[0]);
            double b = new Double(args[1]);
            double c = new Double(args[2]);
      
            // Possono essere lanciate le eccezioni
            // NoEq2ndOrderException e
            // ImNumberException
            solver.computeSolutions(a,b,c);
      
            System.out.println("The solutions are " + solver.getSol1() + " and " + solver.getSol2());
        }catch (NumberFormatException e) {
            System.err.println("Be sure to enter a number.");
	}catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Enter 3 numbers as parameters.");
	}catch (NoEq2ndOrderException e) {
            System.err.println("\"a\" should be non zero.");	
	}catch (ImNumberException e) {
            System.err.println("The result will be an imaginary solution.");
        }
    }

}

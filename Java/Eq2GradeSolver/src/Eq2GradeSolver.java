/**
    Classe per risolvere le equazioni di secondo grado 
    ax2+bx+c
   
    La classe lancia le eccezioni controllate:
	
    NoEq2ndOrderException	se l'equazione non è di secondo grado
    ImNumberException		se ci sono soluzioni immaginarie
*/

public class Eq2GradeSolver {

	private double sol1;
	private double sol2;
	  public void computeSolutions(double a, double b, double c) throws ImNumberException, NoEq2ndOrderException {
	        if (a == 0) throw new NoEq2ndOrderException();
	 
	        double r = b * b - 4 * a * c;

	        if (r < 0) throw new ImNumberException();

	        r = Math.sqrt(r);
	        sol1 = (-b + r) / (2.0 * a);
	        sol2 = (-b - r) / (2.0 * a);
	    }

	    public double getSol1() {
	        return sol1;
	    }  
	  
	    public double getSol2() {
	        return sol2;
	    }
	
	
}

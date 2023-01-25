import java.awt.*;

public class FinestraAwt1 extends Frame{	
	
	public FinestraAwt1(){
		super("Nuova Finestra");
		setLocation(100,100);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new FinestraAwt1();
		System.out.println("ho creato una finestra");
		
	}	
}
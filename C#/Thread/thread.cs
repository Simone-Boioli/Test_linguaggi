using System;
using System.Threading;

public class Class1 {
    public static void Main (){
        Class2 cl1 = new Class2("Primo");
        Class2 cl2 = new Class2("Secondo");
					    
        ThreadStart ts1 = new ThreadStart(cl1.ThreadCode);
        ThreadStart ts2 = new ThreadStart(cl2.ThreadCode);
							    
        Thread t1 = new Thread(cl1);
        t1.Start();
									    
	Thread t2 = new Thread(cl2);
	t2.Start();
    }
}


public class Class2{
        public string par;
		
	public Class2(string text){
		this.par = text;
        }
		    
        public void ThreadCode(){
	    while(true){
	    			
	    }
	}
}


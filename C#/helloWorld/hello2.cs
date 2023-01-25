using System;
    
public class Echo{
    
	string myString;

    public Echo(string aString){
	this.myString = aString;
    }

    public void Tell(){
	Console.WriteLine(myString);
    }
}

public class Hello{
    public static void Main(){
	Echo h = new Echo("Hello my 1st C# object");
	h.Tell();
    }
}

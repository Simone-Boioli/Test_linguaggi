using System;

namespace HelloUtil{
    public class Echo{
	string myString;

	public Echo(string s){
	    this.myString = s;
	}

	public void Tell(){
	    Console.WriteLine(myString);
	}
    }
}

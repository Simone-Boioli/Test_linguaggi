
public class Descrizione {
	private String d;
	public Descrizione(){
		d="";
	}
	public void append(Object obj){
		d=d+":"+obj.toString();
	}
}

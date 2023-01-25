
public class ConfezioneRegalo {
	private Object o;
	public ConfezioneRegalo(Object o){
		this.o=o;
	}
	public Object scartaRegalo(){
		System.out.println(o.toString());
		return o;
	}
}

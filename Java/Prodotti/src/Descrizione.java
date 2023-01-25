
public class Descrizione {
		private String desc;
		
		public Descrizione(){
			desc = "";
		}
		
		public void append(Object o){
			desc = desc + o.toString();
		}
		
		public String toString(){
			return desc;
		}
}

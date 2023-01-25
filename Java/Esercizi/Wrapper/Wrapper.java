public class Wrapper{
	public static void main(String argv[]){
			int val=6;
			Integer inte=val; //boxing
			Integer inte2=new Integer(val);//boxing
			int un=inte;	//unboxing
			
			System.out.println(val+" "+inte+" "+inte2+" "+un);
		
	}
}
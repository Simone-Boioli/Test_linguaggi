public class Minimo{
	public static void main(String args[]){
		int a[]={5,2,3,4,5,2};
		System.out.println(cerca(a.length-1,a));
	}

	public static int cerca(int punta,int a[]){
		if(punta==0){
			return a[0];
		}
		else{
			int minresto=Minimo.cerca(punta-1,a);
			if(a[punta]<minresto)
				return a[punta];
			else
				return minresto;
			
		}
	}
}
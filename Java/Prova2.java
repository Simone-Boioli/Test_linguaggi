public class Prova2{
	public static void main(String[]a){
		int area1=area(3,2,1);  
		int area2=area(7,4);
		
		stampaArea(area1);
		stampaArea(area2);
	}
	public static int area(int a,int b,int c){  //overloding
		return 100000;
	}		
	
	
	
	public static int area (int base, int altezza) {      
		int areaaa= (base*altezza)/2;
		return areaaa;
	}	

		public static void stampaArea(int area){     
			System.out.println("L'area è:"+area); 
		}
}
import java.util.*;

public class Start{
	public static void main(String argv[]){
		
		String str="ciao sono simone";
		StringTokenizer token=new StringTokenizer(str," ");
		
		while(token.hasMoreTokens()){
			System.out.println(token.nextToken());
		}
	}
}
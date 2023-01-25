import java.io.*;
import java.util.*;

public class Story{
		public static void main(String[] args){
			try{
				BufferedReader inputStream = new BufferedReader(new FileReader("story.txt"));
				PrintWriter outputStream = new PrintWriter(new FileOutputStream("newStory.txt"));
				
				int count = 0;
				String line = inputStream.readLine();
				
				while(line != null){
					count++;
					outputStream.println(count + " " + line);
					line = inputStream.readLine();
				}
				inputStream.close();
				outputStream.close();
			}catch(FileNotFoundException e){
				
			}catch(IOException e){
				
			}
		}
}
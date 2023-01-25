import java.io.*;

public class TextFileInputDemo {

    public static void main(String[] args) {
        try {
            BufferedReader inputStream = new BufferedReader(new FileReader("data.txt")); 
               
            String line = null;
            line = inputStream.readLine( );
            System.out.println("The first line in data.txt is:"); 
           
            System.out.println(line);
            line = inputStream.readLine( );
            System.out.println("The second line in data.txt is:");
            System.out.println(line); 
            inputStream.close( );
        }catch(FileNotFoundException e) {
            System.out.println("File data.txt was not found");
            System.out.println("or could not be opened.");
        }catch(IOException e) {
            System.out.println("Error reading from file data.txt.");
        }
    }

}

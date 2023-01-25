import java.io.*;
import java.util.*;

public class TextFileInputDemo2 {

    public static void main(String[] args) {
        System.out.println("Enter file name:");
        Scanner keyboard = new Scanner(System.in);
        String fileName = keyboard.next( );

        try {
            BufferedReader inputStream = new BufferedReader(new FileReader(fileName));
            String line = null;
            line = inputStream.readLine( );
            System.out.println("The first line in " + fileName + " is:");
            System.out.println(line);
            line = inputStream.readLine( );
            System.out.println("The second line in " + fileName + " is:");
            System.out.println(line);
            inputStream.close( );
        }catch(FileNotFoundException e) {
            System.out.println("File " + fileName + " not found.");
        }catch(IOException e) {
            System.out.println("Error reading from file " + fileName);
        }
    }

}


/**
    Demonstrates use of the class File with text files.
*/

import java.io.*;
import java.util.*;

public class FileClassDemo {

    public static void main(String[] args) {
        String name = null;
        
        System.out.println("I will show you the first line");
        System.out.println("in a text file you name.");
        System.out.println("The file must contain one or more lines.");
        System.out.println("Enter file name:");
        
        Scanner keyboard = new Scanner(System.in);

        name = keyboard.next( );
        File fileObject = new File(name);

        while (( ! fileObject.exists( )) || ( ! fileObject.canRead( ))) {
            if ( ! fileObject.exists( ))
                System.out.println("No such file");
            else // ! fileObject.canRead( )
                System.out.println("That file is not readable.");
            System.out.println("Enter file name again:");
            name = keyboard.next( );
            fileObject = new File(name);
        }

        try {
            BufferedReader fileInput = new BufferedReader(new FileReader(name));
            System.out.println("The first line in the file is:");
            String firstLine = fileInput.readLine( );
            System.out.println(firstLine);
            fileInput.close( );
        }catch(IOException e) {
            System.out.println("Problem reading from file.");
        }
    }

}

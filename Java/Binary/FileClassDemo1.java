/************************************************
 *Demonstrates use of the class File with binary files.
 ************************************************/

import java.io.*;
import java.util.*;

public class FileClassDemo1 {

    public static void main(String[] args) {
        String name = null;
        File fileObject = null;
     
        System.out.println("I will show you the first string");
        System.out.println("in a binary file you name.");
        System.out.println("The first data item in the file");
        System.out.println("must be a string.");
    
        System.out.println("Enter file name:");
	Scanner keyboard = new Scanner(System.in);
        name = keyboard.next(); 
        fileObject = new File(name);

        while (( ! fileObject.exists()) || ( ! fileObject.canRead())) {
            if ( ! fileObject.exists()) 
                System.out.println("No such file");
            else if ( ! fileObject.canRead())
                System.out.println("That file is not readable.");
            System.out.println("Enter file name again:");
            name = keyboard.next(); 
            fileObject = new File(name);
        }

        try {
           System.out.println("The path name of the file is:" + fileObject.getPath());
           System.out.println("The name of the file is:" + fileObject.getName());

           DataInputStream fileInput = new DataInputStream(new FileInputStream(name));
           String firstString = fileInput.readUTF();
           System.out.println("The first string in the file is:");
           System.out.println(firstString);

           fileInput.close();
        }catch(IOException e) {
            System.out.println("Problem reading from file.");
        }
    }

}

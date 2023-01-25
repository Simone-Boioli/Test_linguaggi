import java.io.*;
import java.util.*;

public class FileNameDemo {

    public static void main(String[] args) {
        String fileName = null;
        Scanner keyboard = new Scanner(System.in);

        try {
            System.out.println("Enter file name:");
            fileName = keyboard.next();
            DataInputStream inputStream = new DataInputStream(new FileInputStream(fileName));
            int n;
            System.out.println("Reading the nonnegative integers");
            System.out.println("in the file " + fileName);
            n = inputStream.readInt();
            while (n >= 0) {
                System.out.println(n);
                n = inputStream.readInt();
            }
            System.out.println("End of reading from file.");
            inputStream.close();         
        }catch(IOException e) {
            System.out.println("Problem with input from file " + fileName);
        }
    }

}

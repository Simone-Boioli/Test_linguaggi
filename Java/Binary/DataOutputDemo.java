import java.io.*;
import java.util.*;

public class DataOutputDemo {

    public static void main(String[] args) {
        try {
            DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("numbers.txt"));
            int n;

            System.out.println("Enter nonnegative integers, one per line.");
            System.out.println("Place a negative number at the end.");
       
            do {
                Scanner keyboard = new Scanner(System.in);

                n = keyboard.nextInt();
                outputStream.writeInt(n);
            }while (n >= 0);
        
            System.out.println("Numbers and sentinel value");
            System.out.println("written to the file numbers.dat.");

            outputStream.close();
        }catch(IOException e) {
            System.out.println("Problem with output to file numbers.dat.");
        }
    }

}

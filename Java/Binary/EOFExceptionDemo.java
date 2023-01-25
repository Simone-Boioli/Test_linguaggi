import java.io.*;

public class EOFExceptionDemo {
    
    public static void main(String[] args) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("numbers.txt"));
            int n;

            System.out.println("Reading ALL the integers");
            System.out.println("in the file numbers.dat.");

            try {
                while (true) {
                    n = inputStream.readInt( );
                    System.out.println(n);
                }
            }catch(EOFException e) {
                System.out.println("End of reading from file.");
            }

            inputStream.close( );
        }catch(FileNotFoundException e) {
            System.out.println("Cannot find file numbers.dat.");
        }
        catch(IOException e) {
            System.out.println("Problem with input from file numbers.dat.");
        }
    }

}

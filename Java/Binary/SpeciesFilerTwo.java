import java.util.*;
import java.io.*;

/*********************************************************
 *A class to build files of species records and to display
 *the file contents on the screen. Uses the class Species.
 *********************************************************/
public class SpeciesFilerTwo {

    private String fileName = null;
    private DataInputStream inputStream = null;
    private DataOutputStream outputStream = null;

    /**************************************************************************
     *	Obtains a file name from the user and fills the file with species records.
     *	Se append == true se il file esiste gia' aggiungera' records
     *	altrimenti creera' un file vuoto.
     **************************************************************************/
    public void buildAFile(boolean append) {
        try {
            outputStream = new DataOutputStream(new FileOutputStream(fileName, append));

            Species oneSpecies = new Species();
            System.out.println("Ready to start entering?(y/n)");

            Scanner keyboard = new Scanner(System.in);
            char ans = (keyboard.next()).charAt(0);

            while ((ans == 'y') || (ans == 'Y')) {
                oneSpecies.readInput();
                oneSpecies.writeOutput(outputStream);
                System.out.println("Enter another species?(y/n)");
             	ans = (keyboard.next()).charAt(0);
            }
            
            outputStream.close();
            System.out.println("Species records written to the file " + fileName);
        }catch(FileNotFoundException e) {
            System.out.println("Error opening file " + fileName);
        }catch(IOException e) {
            System.out.println("Error writing to file " + fileName);
        }
    }

    //Throws a FileNotFoundException if there is no file with the given name.
    private void viewAFileNoProblems() throws IOException {
        inputStream = new DataInputStream(new FileInputStream(fileName));
        Species oneSpecies = new Species();
        System.out.println("\nRecords from the file " + fileName + ":");
        try {
            Scanner keyboard = new Scanner(System.in);

            while (true) {
                oneSpecies.readInput(inputStream);
                oneSpecies.writeOutput();
                System.out.println("Press Enter to see more.");
                keyboard.nextLine();
            }
        }catch(EOFException e) {
         System.out.println("No more records in the file " + fileName);
        }
  
        inputStream.close();
        System.out.println("File " + fileName + " put away.\n");
    }

    /**************************************************
     *Obtains a file name from the user and displays the
     *file contents to the screen.
     *Precondition: The file must be a binary file of
     *the kind created by buildAFile.
     **************************************************/
    public void viewAFile() {

        try {
            viewAFileNoProblems();
        }catch(FileNotFoundException e) {
            System.out.println("Cannot find a file named " + fileName);
        }catch(IOException e) {
            System.out.println("Error reading from file " + fileName);
        }
 
    }

    public void askAndSetFileName(String prompt) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(prompt);
        fileName = keyboard.next(); 
    }

}

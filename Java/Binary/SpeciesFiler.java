import java.io.*;

/*********************************************************
 *A class to build files of species records and to display
 *the file contents on the screen. Uses the class Species.
 *********************************************************/
public class SpeciesFiler {

    private String fileName = null;
    private DataInputStream inputStream = null;
    private DataOutputStream outputStream = null;

    /**************************************************************************
     *Obtains a file name from the user and fills the file with species records.
     **************************************************************************/
    public void buildAFile() {
        System.out.println("This program will record the species records");
        System.out.println("you enter and store them in a file.");
        fileName = getFileName("Enter name of file to hold records:");
        System.out.println("If there already exists a file");
        System.out.println("with that name, the data will be lost.");
        System.out.println("OK to continue with the file " + fileName + "? (y/n)");
        char ans = SavitchIn.readLineNonwhiteChar();

        if ((ans == 'n') && (ans == 'N'))
            System.out.println("File " + fileName + " not changed.");
        else {
            try {
                outputStream = new DataOutputStream(new FileOutputStream(fileName));

                Species oneSpecies = new Species();
                System.out.println("Ready to start entering?(y/n)");
                ans = SavitchIn.readLineNonwhiteChar();
                while ((ans == 'y') || (ans == 'Y')) {
                    oneSpecies.readInput();
                    oneSpecies.writeOutput(outputStream);
                    System.out.println("Enter another species?(y/n)");
                    ans = SavitchIn.readLineNonwhiteChar();
                }
                outputStream.close();
                System.out.println("Species records written to the file "
                                                         + fileName);
            }catch(FileNotFoundException e) {
                System.out.println("Error opening file " + fileName);
            }catch(IOException e) {
                System.out.println("Error writing to file " + fileName);
            }
        }
    }

    //Throws a FileNotFoundException if there is no file with the given name.
    private void viewAFileNoProblems() throws IOException {
        System.out.println("This program will display all the species");
        System.out.println("records contained in the file you specify.");
        fileName = getFileName("Enter name of file with records:");
        inputStream = new DataInputStream(new FileInputStream(fileName));
        Species oneSpecies = new Species();
        System.out.println("Records from the file " + fileName + ":");

        try {
            while (true) {
                oneSpecies.readInput(inputStream);
                oneSpecies.writeOutput();
                System.out.println("Press Enter to see more.");
                String junk = SavitchIn.readLine();
            }
        }catch(EOFException e) {
            System.out.println("No more records in the file " + fileName);
        }

        inputStream.close();
        System.out.println("File " + fileName + " put away.");
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

    private String getFileName(String prompt) {
        String nameString = null;
        System.out.println(prompt);
        nameString = SavitchIn.readLineWord();
        return nameString;
    }

}

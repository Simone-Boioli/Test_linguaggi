import java.io.*;
import java.util.*;

/*************************************************************************
 *Class for data on endangered species. This is a new, improved definition
 *of the class Species, which replaces the definition in Chapter 4.
 *************************************************************************/
public class Species {

    private String name;
    private int population;
    private double growthRate;

    public Species() {
        name = null;
        population = 0;
        growthRate = 0;
    }

    public Species(String initialName, int initialPopulation, double initialGrowthRate) {
        name = initialName;
        if (initialPopulation >= 0)
            population = initialPopulation;
        else {
            System.out.println("ERROR: Negative population.");
            System.exit(0);
        }
        growthRate = initialGrowthRate;
    }

    public void set(String newName, int newPopulation, double newGrowthRate) {
        name = newName;
        if (newPopulation >= 0)
            population = newPopulation;
        else {
            System.out.println("ERROR: Negative population.");
            System.exit(0);
        }
        growthRate = newGrowthRate;
    }

    /*******************************************************
     *Precondition: years is a nonnegative number.
     *Returns the projected population of the calling object
     *after the specified number of years.
     *******************************************************/
    public int projectedPopulation(int years) {
        double populationAmount = population;
        int count = years;

        while ((count > 0) && (populationAmount > 0)) {
            populationAmount = (populationAmount + (growthRate/100) * populationAmount);
            count--;
        }
        if (populationAmount > 0)
            return (int)populationAmount;
        else
            return 0;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public double getGrowthRate() {
        return growthRate;
    }

    public boolean equals(Species otherObject) {
        return ((name.equalsIgnoreCase(otherObject.name)) && (population == otherObject.population) && (growthRate == otherObject.growthRate));
    }

    /***************************
     *Sends output to the screen.
     ***************************/
    public void writeOutput() {
        System.out.println("Name = " + name);
        System.out.println("Population = " + population);
        System.out.println("Growth rate = " + growthRate + "%");
    }

    /*********************************************************
     *Precondition: The stream outputStream has been connected
     *to a file.
     *Action: A record of the species is written to the file
     *that is connected to outputStream. The record is written
     *as three items, IN THIS ORDER: a String for the name, an
     *int for the population, and a double for the growth rate.
     *********************************************************/
    public void writeOutput(DataOutputStream outputStream) throws IOException {
        outputStream.writeUTF(name);
        outputStream.writeInt(population);
        outputStream.writeDouble(growthRate);
    }


     /*******************************
      *Takes input from the keyboard.
      *******************************/
    public void readInput( ) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the species' name?");
        name = keyboard.nextLine( );

        System.out.println("What is the population of the species?");
        population = keyboard.nextInt( );
        while (population < 0) {
            System.out.println("Population cannot be negative.");
            System.out.println("Reenter population:");
            population = keyboard.nextInt( );
        }

        System.out.println("Enter growth rate (percent increase per year):");
        growthRate = keyboard.nextDouble( );
    }

    /*************************************************************
     *Precondition: The stream inputStream is connected to a file.
     *Each species record appears in the file as three items,
     *IN THIS ORDER: a String for the name, an int for the
     *population, and a double for the growth rate.
     *Action: Reads a record from the stream and resets the data
     *for the calling object. An attempt to read past the end
     *of the file will throw an EOFException.
     ************************************************************/
    public void readInput(DataInputStream inputStream) throws IOException {
        name = inputStream.readUTF();
        population = inputStream.readInt();
        growthRate = inputStream.readDouble();
    }

}
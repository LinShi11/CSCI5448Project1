import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * The Creator class runs the program. It continues to ask the user for input and calculate the different math operations
 * to the different random arrays.
 *
 * The class creates three different random double arrays of the size the user inputs.
 * Then it calls the mean, standard deviation, min, and max function in the Analyzer class.
 * Finally, it prints out the output in a nice format
 */
public class Creator {
    public Creator(){

    }

    /**
     * Assumption: I only saw the requirement for null input, but it does not state anything for invalid inputs; thus, I did a small try catch.
     *
     * The while loop that asks for user input on the size of arrays.
     * Exit when blank input (just enter) is pressed.
     */
    public void input(){
        Scanner scanner = new Scanner(System.in);
        String temp;
        int numRands;

        // the while loop that will exist on "enter"
        while(true) {
            System.out.println("Enter a random value");

            temp = scanner.nextLine();
            if (temp.isEmpty()) {
                break;
            }

            // try catch to ensure the user inputs a integer
            try {
                numRands = Integer.parseInt(temp);
                createArray(numRands);
            } catch (Exception e) {
                System.out.println("Please enter a value (integer)");
            }

        }
    }

    /**
     * This function is used to create the three different double arrays according to user input.
     * Then it will create three objects of Analyzer, one for each array.
     * Lastly, it will calculate and print the results.
     *
     * @param numRands: user input on the size of array
     */
    public void createArray(int numRands){

        // variables for each double array
        double[] utilRandom = new double[numRands];
        double[] mathRandom = new double[numRands];
        double[] threadRandom = new double[numRands];

        // populate the arrays
        Random random = new Random();
        for (int i = 0; i < numRands; i++) {
            utilRandom[i] = random.nextDouble();
            mathRandom[i] = Math.random();
            threadRandom[i] = ThreadLocalRandom.current().nextDouble();
        }

        // create three objects, one for each array
        Analyzer utilRandomAnalyze = new Analyzer(utilRandom, "Java.util.Random");
        Analyzer mathRandomAnalyze = new Analyzer(mathRandom, "Math.random");
        Analyzer threadRandomAnalyze = new Analyzer(threadRandom, "Java.util.concurrent.ThreadLocalRandom");

        // use String.format to format the header of the table
        System.out.println(String.format("%45s %10s %15s %15s %15s %15s", "Name of Function", "numRands", "mean", "std. dev.", "min", "max"));

        // pass in each object and print each row out
        printFormat(utilRandomAnalyze, numRands);
        printFormat(mathRandomAnalyze, numRands);
        printFormat(threadRandomAnalyze, numRands);
    }

    /**
     * This function is created to format the print statement and make it more readable
     *
     * @param object: the object for each array, where we can call the respective function for results.
     * @param numRands: the user input, one of the required items for output
     */
    public void printFormat(Analyzer object, int numRands){
        System.out.println(String.format("%45s %10d %15f %15f %15f %15f", object.getName(), numRands, object.mean(), object.standardDeviation(), object.minValue(), object.maxValue()));
    }
}

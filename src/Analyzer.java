/**
 * Analyzer computes the mean, the min value, the max value, and standard deviation.
 * Given that all methods must be performed, I decided to store the array in the class and not request the array for every method.
 */
public class Analyzer {

    /**
     * array stores the double random array used for calculation
     * name stores the function name, which is needed for final output
     */
    private double[] array;
    private String name;

    /**
     * Constructor for the class
     * @param temp: the double array passed in
     * @param nameTemp: the name of the function
     */
    public Analyzer(double[] temp, String nameTemp){
        this.array = temp;
        this.name = nameTemp;
    }
    public Analyzer(){
        this.array = null;
        this.name = null;
    }

    /**
     * The function calculates the mean of the array
     * @return the mean of array
     */
    public double mean(){
        double total = 0;
        for(int i = 0; i < array.length; i++){
            total += array[i];
        }
        return(total/array.length);

    }

    /**
     * The function finds the minimum value in the array
     * @return the smallest value in the array
     */
    public double minValue(){
        double min = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    /**
     * The function finds the maximum value in the array
     * @return the largest value in the array
     */
    public double maxValue(){
        double max = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    /**
     * The function calculates the standard deviation.
     * I looked at https://www.geeksforgeeks.org/java-program-to-calculate-standard-deviation/ for implementation.
     * Given that it is just an equation, it may look very similar
     * @return the standard deviation of the array
     */
    public double standardDeviation(){
        // since mean is calculated, I just called the function to obtain the value
        double mean = mean();
        double sd = 0;
        for (int i = 0; i < array.length; i++){
            sd += Math.pow((array[i] - mean), 2);
        }
        sd = sd/array.length;
        sd = Math.sqrt(sd);
        return sd;
    }

    /**
     * Getter for function name. Required as part of output
     * @return the name of the random function used
     */
    public String getName(){
        return this.name;
    }
}

/**
 * @author Lin Shi
 * This is program 1 of Project 1 for CSCI 5448 OOAD
 *
 * The main function simply starts the program and since the while loop is implemented in creator,
 * we will not come back to main at all.
 * The program asks the user for an integer input, where that determines the size of arrays.
 * Then we generate 3 random arrays of double values using 3 different random value generators from java libraries.
 * Then we compute the mean, min, max, and standard deviation for the 3 arrays.
 */
public class Program1 {
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.input();

    }
}


import java.util.ArrayList;

/**
 * The class is used to print the information in a nice manner.
 * We will access answer and clues from Reader; tokens from Tokenizer.
 */
public class PuzzlePrint {

    public PuzzlePrint(){

    }

    /**
     * Print the output in a nice manner. We will print the tokens first, followed by the clues, and answer.
     *
     * @param answer: arraylist consist of the words
     * @param clues: arraylist consist of the clues
     * @param tokens: arraylist consist of the tokens
     */
    public void printPuzzle(ArrayList<String> answer, ArrayList<String> clues, ArrayList<String> tokens){
        System.out.println("Tokens----------------------------------");
        for(int i = 0; i < tokens.size(); i++){
            // make sure we start a new line every 4 tokens, expect at i = 0
            if(i%4 == 0 && i != 0){
                System.out.println();
            }
            // use print, not println to make sure we are on the same line
            System.out.print(tokens.get(i)+ "\t");
        }

        //print the clues in order, I decided to list them for better readability
        System.out.println("\n\nClues------------------------------------");
        for(int i =0; i< clues.size(); i++){
            System.out.println(i+1 + "). " + clues.get(i));
        }

        // print the words in order, once again, listed.
        System.out.println("\nAnswer Key----------------------------------");
        for(int i = 0; i < answer.size(); i++){
            System.out.println(i+1 + "). " + answer.get(i));
        }
    }

}

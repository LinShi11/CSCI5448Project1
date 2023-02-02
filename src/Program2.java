/**
 * @author Lin Shi
 * This is Program 2 of Project 1 for CSCI 5448 OOAD
 *
 * The main function creates instances of the Reader, Tokenizer, and PuzzlePrint class.
 * Then the appropriate functions are called.
 * We read in 6 different words, parse them into 2 letter tokens, and display the tokens in random order.
 * Lastly, we will display the tokens, the clues, and the answer.
 */
public class Program2 {

    public static void main(String[] args){
        // instances of the classes we need
        Reader reader = new Reader();
        Tokenizer tokenizer = new Tokenizer();
        PuzzlePrint puzzlePrint = new PuzzlePrint();

        // creates the list
        reader.createLists();

        // parse them into tokens
        tokenizer.createTokens(reader.getAnswer());

        //print everything out
        puzzlePrint.printPuzzle(reader.getAnswer(), reader.getClues(), tokenizer.getTokens());

    }

}

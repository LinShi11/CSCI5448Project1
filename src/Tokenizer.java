import java.util.ArrayList;
import java.util.Collections;

/**
 * The class splits each word into 2 letter tokens and store the tokens in an arraylist.
 *
 */
public class Tokenizer {
    private ArrayList<String> tokens;
    public Tokenizer(){
        this.tokens = new ArrayList<>();
    }

    /**
     * Assumption: I did not see that we cannot use build-in for shuffles. So I assume that it could be used.
     *
     * The function parse the words into 2 letter tokens and store them in an arraylist.
     * Lastly, the order is mixed using shuffle.
     * The shuffle portion is taken from https://www.geeksforgeeks.org/collections-shuffle-method-in-java-with-examples/.
     *
     * @param answer: An arraylist of words to parse
     */
    public void createTokens(ArrayList<String> answer){
        // iterate through each word
        for(int i = 0; i < answer.size(); i++){
            // for each word break them into tokens size of 2
            for(int j = 0; j < answer.get(i).length()/2; j++){
                tokens.add(answer.get(i).substring(j*2, j*2+2));
            }
            // if the word is odd, then the last token will have 3 letters
            if(answer.get(i).length() %2 == 1){
                // set the last token (so far) to be itself AND the last char from the word
                tokens.set(tokens.size()-1, tokens.get(tokens.size()-1) + (answer.get(i).charAt(answer.get(i).length()-1)));
            }
        }
        // shuffle the arraylist
        Collections.shuffle(tokens);
    }

    /**
     * Getter for the token
     * @return an arraylist of all the tokens.
     */
    public ArrayList<String> getTokens(){
        return tokens;
    }


}

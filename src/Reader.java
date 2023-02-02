import java.util.ArrayList;

/**
 * The reader class reads in 6 string and their clues.
 * We make all 6 string uppercase.
 * Additionally, we store all string and clue information in arraylists.
 */
public class Reader {

    private String[] wordBank;
    private String[] clueBank;
    private ArrayList<String> answer;
    private ArrayList<String> clues;

    /**
     * Blank constructor. Given that requirement said the words "can be read from a constant array of the 6 strings", I
     * simply populated the string array with the words I want to use. Same for clues.
     */
    public Reader(){
        this.wordBank = new String[]{"printer", "candle", "monitors", "keyboard", "glasses", "textbook"};
        this.clueBank = new String[]{"Device made to waste ink and paper", "Provides a small source of light and heat",
        "Device used to see the internet", "Device used to finish the coding assigment", "Device used to help people see the world",
        "Item that stores knowledge"};
        this.answer = new ArrayList<>();
        this.clues = new ArrayList<>();

    }

    /**
     * Assumption: The requirement did not state that adding the 6 words into ArrayList and make them uppercase must be
     * done separately. Thus, I combine the two. If such is required, uncomment the for loop in this function and delete
     * the toUpperCase in the first for loop.
     *
     * The function populates the arraylist by adding the elements in from the string array
     */
    public void createLists(){
        // iterate through all 6 items
        for(int i = 0; i < wordBank.length; i++){
            this.answer.add(wordBank[i].toUpperCase());
            this.clues.add(clueBank[i]);
        }
//        for(int i = 0; i < answer.size(); i++){
//            this.answer.set(i, answer.get(i).toUpperCase());
//        }
    }

    /**
     * Getter for answers
     * @return arraylist of answer
     */
    public ArrayList<String> getAnswer(){
        return this.answer;
    }

    /**
     * Getter for clues
     * @return arraylist of clues
     */
    public ArrayList<String> getClues(){
        return this.clues;
    }
}


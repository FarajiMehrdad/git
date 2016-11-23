/**
 * Created by Mehrdad on 11/23/16.
 */
public class Game {


    private String mAnswer;
    private String mMiss;
    private String mHit;

    public Game(String mAnswer) {
        this.mAnswer = mAnswer;
    }


    /**
     * if guess be correct add to mHts else add to mMiss
     *
     * @param letter
     * @return boolean that shows guess letter is accepted or not
     */
    public boolean applyGuess(char letter) {

        if (mAnswer.indexOf(letter) >= 0) {
            mHit += letter;
            return true;
        } else {
            mMiss += letter;
            return false;
        }

    }

    
    
      /**
     * @return the progress of the word
     * for first time it shoud be --------
     */
    public String getCurrentPorgress() {


        String progress = "";

        for (char letter : mAnswer.toCharArray()) {
            char display = '-';
            if (mHit.indexOf(letter) > 0) {
                display = letter;
            }
            progress += display;
        }

        return progress;

    }
    
    
       /**
     * @return number of try user has
     */
    public int getRemainTries() {
        return mMaxMisses - mHit.length();
    }


    //TODO check game is solve?!
    public boolean isSolved(){

        return true;
    }
    
    
    
}

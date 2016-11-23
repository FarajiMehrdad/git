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

}

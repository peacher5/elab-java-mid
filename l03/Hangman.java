package l03;

// elab-source: Hangman.java

public class Hangman implements GuessingGame {

    private String target;
    private char[] guessed;
    private int lives = 6;
    private String outputMessage;

    @Override
    public void setAnswer(String ans) {
        target = ans.toLowerCase();
        guessed = new char[target.length()];
        for (int i = 0; i < guessed.length; i++)
            guessed[i] = '_';
    }

    @Override
    public void guess(String s) {
        if (s.length() > 1)
            outputMessage = "One character only";
        else {
            boolean isCorrect = false;
            for (int i = 0; i < guessed.length; i++) {
                if (target.charAt(i) == s.charAt(0)) {
                    isCorrect = true;
                    guessed[i] = target.charAt(i);
                }
            }
            if (!isCorrect)
                lives--;
            outputMessage = "";
        }
    }

    @Override
    public String getOutput() {
        if (outputMessage.isEmpty()) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < guessed.length; i++) {
                if (i > 0)
                    result.append(" ");
                result.append(guessed[i]);
            }
            return result.toString();
        } else
            return outputMessage;
    }

    @Override
    public boolean isWon() {
        return !String.valueOf(guessed).contains("_");
    }

    @Override
    public boolean isLost() {
        return lives == 0;
    }
}

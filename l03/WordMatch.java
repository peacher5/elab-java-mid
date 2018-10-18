package l03;

// elab-source: WordMatch.java

public class WordMatch implements GuessingGame {

    private String target;
    private int correctPositions;

    @Override
    public void setAnswer(String ans) {
        target = ans.toLowerCase();
    }

    @Override
    public void guess(String s) {
        if (target.length() != s.length())
            correctPositions = -1;
        else {
            s = s.toLowerCase();
            correctPositions = 0;
            for (int i = 0; i < target.length(); i++)
                if (target.charAt(i) == s.charAt(i))
                    correctPositions++;
        }
    }

    @Override
    public String getOutput() {
        if (correctPositions == -1)
            return "Length not match";
        else if (correctPositions == target.length())
            return "";
        return "Match " + correctPositions;
    }

    @Override
    public boolean isWon() {
        return correctPositions == target.length();
    }

    @Override
    public boolean isLost() {
        return false;
    }
}

package l02.second;

// elab-source: Exam.java

public class Exam {
    private int[] answers;
    private int[][] studentAnswers;

    public Exam(String answers, int studentAmount) {
        this.answers = new int[answers.length()];
        studentAnswers = new int[studentAmount][answers.length()];
        for (int i = 0; i < answers.length(); i++)
            this.answers[i] = Integer.parseInt(answers.charAt(i) + "");
    }

    public void addScore(int studentNo, String studentAnswers) {
        for (int i = 0; i < answers.length; i++)
            this.studentAnswers[studentNo - 1][i] = Integer.parseInt(studentAnswers.charAt(i) + "");
    }

    public int getCorrectStudentAmount(int examNo) {
        int amount = 0;
        for (int[] studentAnswer : studentAnswers)
            if (answers[examNo - 1] == studentAnswer[examNo - 1])
                amount++;
        return amount;
    }

    public int getMaxScore() {
        return answers.length;
    }

    public int getStudentAmount() {
        return studentAnswers.length;
    }
}

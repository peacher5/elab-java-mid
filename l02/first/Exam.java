package l02.first;

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

    public int getScores(int studentNo) {
        int score = 0;
        for (int i = 0; i < answers.length; i++)
            if (answers[i] == studentAnswers[studentNo - 1][i])
                score++;
        return score;
    }

    public int getMaxScore() {
        return answers.length;
    }

    public double getAverage() {
        double sum = 0;
        for (int studentNo = 1; studentNo <= getStudentAmount(); studentNo++)
            sum += getScores(studentNo);
        return sum / getStudentAmount();
    }

    public int getStudentAmount() {
        return studentAnswers.length;
    }
}

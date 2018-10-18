package l02.second;

// elab-source: Main.java
// elab-mainclass: Main

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Exam exam = new Exam(sc.next(), sc.nextInt());
        for (int studentNo = 1; studentNo <= exam.getStudentAmount(); studentNo++)
            exam.addScore(studentNo, sc.next());

        for (int i = 1; i <= exam.getMaxScore(); i++)
            System.out.println(i + ": " + exam.getCorrectStudentAmount(i));
    }
}

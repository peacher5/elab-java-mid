package l02.first;

// elab-source: Main.java
// elab-mainclass: Main

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exam exam = new Exam(sc.next(), sc.nextInt());
        for (int studentNo = 1; studentNo <= exam.getStudentAmount(); studentNo++) {
            exam.addScore(studentNo, sc.next());
            System.out.println(studentNo + ": " + exam.getScores(studentNo) + "/" + exam.getMaxScore());
        }
        System.out.println("Average: " + exam.getAverage());
    }
}

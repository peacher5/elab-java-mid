package l04;

// elab-source: Main.java
// elab-mainclass: Main

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiniFileSystem fileSystem = new MiniFileSystem();
        while (true) {
            String command = sc.nextLine();
            if (command.equals("exit"))
                break;

            String output = fileSystem.doCommand(command);
            if (!output.isEmpty())
                System.out.println(output);
        }
    }
}

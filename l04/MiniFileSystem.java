package l04;

// elab-source: MiniFileSystem.java

import java.util.HashMap;

public class MiniFileSystem {
    private HashMap<String, String> files = new HashMap<>();

    public String doCommand(String command) {
        try {
            String[] spaceSplit = command.split(" ");
            if (command.startsWith("touch")) {
                touch(spaceSplit[1]);
            } else if (command.startsWith("echo")) {
                String text, operator;
                if (command.contains("\"")) {
                    String[] slashSplit = command.split("\"");
                    text = slashSplit[1];
                    operator = slashSplit[2].substring(1, 3);
                } else {
                    text = spaceSplit[1];
                    operator = spaceSplit[2];
                }

                if (operator.contains(">>"))
                    append(spaceSplit[spaceSplit.length - 1], text);
                else
                    override(spaceSplit[spaceSplit.length - 1], text);

            } else if (command.startsWith("cat")) {
                return cat(spaceSplit[1]);
            }
        } catch (IllegalArgumentException e) {
            return e.getMessage();
        }
        return "";
    }

    public void touch(String fileName) {
        if (files.containsKey(fileName))
            throw new IllegalArgumentException("File " + fileName + " Already Exist");
        files.put(fileName, "");
    }

    public void override(String fileName, String text) {
        if (!files.containsKey(fileName))
            throw new IllegalArgumentException("File " + fileName + " Not Found");
        files.replace(fileName, text);
    }

    public void append(String fileName, String text) {
        if (!files.containsKey(fileName))
            throw new IllegalArgumentException("File " + fileName + " Not Found");
        files.merge(fileName, text, (oldText, newText) -> oldText + newText);
    }

    public String cat(String fileName) {
        if (!files.containsKey(fileName))
            throw new IllegalArgumentException("File " + fileName + " Not Found");
        return files.get(fileName);
    }
}

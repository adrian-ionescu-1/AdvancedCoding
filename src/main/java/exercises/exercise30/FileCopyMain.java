package exercises.exercise30;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileCopyMain {
    public static void main(String[] args) {
        Path initialFilePath = Paths.get("C:\\Users\\adria\\IdeaProjects\\AdvencedCoding\\src\\main\\java\\exercises\\exercise30\\initial_file.txt");
        FileWriter wordsFile = null;
        List<String> lines = null;
        try {
            lines = Files.readAllLines(initialFilePath);
            wordsFile = new FileWriter("C:\\Users\\adria\\IdeaProjects\\AdvencedCoding\\src\\main\\java\\exercises\\exercise30\\words_file.txt");
            createTableWithWords(countWordApparances(lines), wordsFile);
        } catch (IOException exception) {
            System.out.println("File not found");
        } finally {
            try {
                if (wordsFile != null) {
                    wordsFile.close();
                }
            } catch (IOException exception) {
                System.out.println("File connection doesn't exist");
            }
        }

        countWordApparances(lines);
    }

    public static Map<String, Integer> countWordApparances(List<String> lineList) {
        List<String> words = new ArrayList<>();
//        String line = "What are text files?";
//        String[] wordsArray = line.split("[\\p{Punct}\\s]+");
//        System.out.println(Arrays.toString(wordsArray));

        for (String line : lineList) {
            String[] wordsArray = line.split("[\\p{Punct}\\s]+");
            words.addAll(List.of(wordsArray));
        }
        Map<String, Integer> occurance = new LinkedHashMap<>();
        for (String word : words) {
            if (!(occurance.containsKey(word))) {
                occurance.put(word, 1);
            } else {
                occurance.put(word, occurance.get(word) + 1);
            }
        }
        return occurance;
    }

    public static void createTableWithWords(Map<String, Integer> occurances, FileWriter wordsFile) {
        String line = "What->1";
        try {
            for (Map.Entry<String, Integer> entryLine : occurances.entrySet()) {
                wordsFile.append(entryLine.getKey()).append("->").append(String.valueOf(entryLine.getValue())).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Exception caught!");
        }
    }
}

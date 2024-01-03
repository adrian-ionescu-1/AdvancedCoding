package exercises.exercise3;

import java.util.*;

public class Exercise3 {
    public static void main(String[] args) {

        Map<String, Integer> programingMap = new LinkedHashMap<>();
        programingMap.put("Java", 18);
        programingMap.put("PHP", 1);
        programingMap.put("PHP", 5);
        programingMap.put("Python", 23);
        programingMap.put("C++", 5);

        mapFormating(programingMap);
        System.out.println(programingMap);
        mapFormattingWithStreams(programingMap);
    }

    public static void mapFormating(Map<String, Integer> programingMap) {
        int count = 1;

        for (Map.Entry<String, Integer> entry : programingMap.entrySet()) {
            if (count++ == programingMap.size()) {
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue() + ".");
            } else {
                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue() + ",");
            }
        }
    }

    public static void mapFormattingWithStreams(Map<String, Integer> programingMap) {
        programingMap.entrySet().stream().map(programingLanguage -> programingLanguage.getKey() + " , " + programingLanguage.getValue()).forEach(System.out :: println);
    }
}


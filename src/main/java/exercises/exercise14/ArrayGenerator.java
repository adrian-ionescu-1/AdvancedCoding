package exercises.exercise14;

import java.util.*;

public class ArrayGenerator {
    public static void main(String[] args) {
        int[] arr1 = arrayGenerator(11);
        int[] arr2 = arrayGenerator(20);
        int[] arr3 = arrayGenerator(50);
        Integer[] integerArr = {1, 2, 2, 4, 2, 3, 6};

//       System.out.println(Arrays.toString(arr2));
//       System.out.println(getUniqueElements(arr2));
//       System.out.println(getUniqueElementsWithSet(arr2));
//       System.out.println(getUniqueElementsWithSet2(integerArr));
//       System.out.println(getUniqueElementsWithSet3(integerArr));
//      System.out.println(getRepeatedElements(arr1));
//       System.out.println(getMostRepeatedElements(arr2, 3));

        System.out.println(uniqueElementsGenerator(5));
        System.out.println(uniqueElementsGenerator(10));
        System.out.println(uniqueElementsGenerator(20));

    }

    public static List<Integer> uniqueElementsGenerator(int dimension) {
        Set<Integer> uniqueElementsSet = new HashSet<>();
        Random random = new Random();
        while (uniqueElementsSet.size() < dimension) {
            int randomElement = random.nextInt(dimension + 1);
            uniqueElementsSet.add(randomElement);
        }
        return new ArrayList<>(uniqueElementsSet);
    }


    public static int[] arrayGenerator(int dimension) {
        int[] generatedArr = new int[dimension];
        Random random = new Random();
        for (int i = 0; i < generatedArr.length; i++) {
            generatedArr[i] = random.nextInt(dimension - 10);
        }
        return generatedArr;
    }

    public static List<Integer> getUniqueElements(int[] intArr) {
        List<Integer> uniqueElementsList = new ArrayList<>();
        for (int i = 0; i < intArr.length; i++) {
            if (!uniqueElementsList.contains(intArr[i])) {
                uniqueElementsList.add(intArr[i]);
            }
        }
        return uniqueElementsList;
    }

    public static List<Integer> getUniqueElementsWithSet(int[] intArr) {
        Set<Integer> uniqueElementsWithSet = new HashSet<>();
        for (int i = 0; i < intArr.length; i++) {
            if (!uniqueElementsWithSet.contains(intArr[i])) {
                uniqueElementsWithSet.add(intArr[i]);
            }
        }
        return new ArrayList<>(uniqueElementsWithSet);
    }

    public static List<Integer> getUniqueElementsWithSet2(Integer[] intArr) {
        return new ArrayList<>(new HashSet<>(Arrays.asList(intArr)));
    }

    public static List<Integer> getUniqueElementsWithSet3(Integer[] intArr) {
        List<Integer> integersWithDuplicatesFromArray = Arrays.asList(intArr);
        Set<Integer> integersWithoutDuplicatesFromList = new HashSet<>(integersWithDuplicatesFromArray);
        List<Integer> listOfIntegersWithoutDuplicatesFromSet = new ArrayList<>(integersWithoutDuplicatesFromList);
        return listOfIntegersWithoutDuplicatesFromSet;
    }

    public static List<Integer> getRepeatedElements(int[] intArr) {
        Map<Integer, Boolean> integersMap = new HashMap<>();
        List<Integer> repetedElementsList = new ArrayList<>();
        for (int i = 0; i < intArr.length; i++) {
            if (integersMap.containsKey(intArr[i])) {
                integersMap.put(intArr[i], true);
            } else {
                integersMap.put(intArr[i], false);
            }
        }
        for (Map.Entry<Integer, Boolean> element : integersMap.entrySet()) {
            if (element.getValue()) {
                repetedElementsList.add(element.getKey());
            }
        }
        return repetedElementsList;
    }


    public static List<Integer> getMostRepeatedElements(int[] intArr, int number) {
        Map<Integer, Integer> integersMap = new HashMap<>();
        List<Integer> repetedElementsList = new ArrayList<>();
        for (int i = 0; i < intArr.length; i++) {

            if (!integersMap.containsKey(intArr[i])) {
                integersMap.put(intArr[i], 1);
            } else {
                int currentValue = integersMap.get(intArr[i]);
                int nextValue = currentValue + 1;
                integersMap.put(intArr[i], nextValue);
            }
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(integersMap.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        Collections.reverse(entryList);
        for (int i = 0; i < number; i++) {
            Map.Entry<Integer, Integer> element = entryList.get(i);
            repetedElementsList.add(element.getKey());
        }
        System.out.println(entryList);
        return repetedElementsList;
    }
}

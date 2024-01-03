package exercises.exercise4;

import java.util.HashMap;
import java.util.Map;

public class Storage {

    private Map<String, String> storageMap = new HashMap<>();
    public void addToStorage(String key, String value) {
        storageMap.put(key, value);
    }

    public void printValue(String key) {
//      String value = storageMap.get(key);
        System.out.println(storageMap.get(key));
    }

    public void findValues(String value) {
        for (Map.Entry<String, String> element : storageMap.entrySet()) {
            if (element.getValue().equals(value)) {
                System.out.println(element.getKey());
            }
        }
    }
}

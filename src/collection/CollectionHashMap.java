package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CollectionHashMap {
    public static void main(String[] args) {

        //** HashMap - no order
        //** LinkedHashMap - has order
        //** TreeMap - sort the key it on natural order.Cannot store duplicate(overwrite value)
        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("Brave", "ready to face danger or pain");
        dictionary.put("Brilliant", "clever or talented");
        dictionary.put("Joy", "great pleasure and happiness");
        dictionary.put("Confidence", "feeling something about truth of something");

        // to print the key
        for (String word : dictionary.keySet()) {
            System.out.println(word);
        }

        // to print the value
        for (String word : dictionary.keySet()) {
            System.out.println(dictionary.get(word));
        }

        System.out.println("========");

        // to get both key and va;ue to be printed
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.print(entry.getKey());
            System.out.print(" : ");
            System.out.println(entry.getValue());
        }
    }
}

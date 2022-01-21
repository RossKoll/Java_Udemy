package collection;

import java.util.ArrayList;
import java.util.LinkedList;

import static java.nio.file.Files.size;

public class Application {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        words.add("there");
        words.add("10");
//        words.remove(0);

        String item1 = words.get(2);
        for (String word: words) {
            System.out.println(word);
        }

        System.out.println(item1);
        System.out.println(words.size());


        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        int removedItemFromNumbers = numbers.removeFirst();

        for (int number : numbers) {
            System.out.println(number);
        }

        System.out.println(removedItemFromNumbers);

        for (int i = 0; i < numbers.size()-1; i++){
            System.out.println(i);
        }

    }
}

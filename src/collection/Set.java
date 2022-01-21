package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set {
    public static void main(String[] args) {

        // HashSet prevents duplicates to put in

        HashSet<Integer> values = new HashSet<Integer>();// is not ordered
        values.add(12);
        values.add(23);
        values.add(45);
        values.add(67);
        values.add(45);

        for (Integer value: values) {
            System.out.println(value);
        }

        LinkedHashSet<String> words = new LinkedHashSet<>(); // ordered
        words.add("One");
        words.add("Two");
        words.add("Three");
        words.add("Two");

        for (String word : words){
            System.out.println(word);
        }

        HashSet<Animal> animals = new HashSet<>();
        Animal animal1 = new Animal("Dog", 5);
        Animal animal2 = new Animal("Cat",7);
        Animal animal3 = new Animal("Dog", 5);
        Animal animal4 = new Animal("Kangaroo", 24);
        Animal animal5 = new Animal("Dog",7);

        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);
        animals.add(animal4);
        animals.add(animal5);

        System.out.println(animal1.equals(animal3));

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        System.out.println(animal1.hashCode());
        System.out.println(animal3.hashCode());

//        int x = 10;
//        int y = ++x;
//        System.out.println(y);
//        System.out.println(x);

         int x = 10;
         int y = x++;
        System.out.println(y);
        System.out.println(x);

        int numbInt = 257;
        byte numByte = (byte) numbInt;
        System.out.println(numByte);

        char chl = 'а', ch2 = 'Ь';
        chl = (char) (chl + ch2);
        System.out.println(chl);
    }
}

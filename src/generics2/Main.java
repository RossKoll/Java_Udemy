package generics2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");

        String myValue = arrayList.get(0);

        System.out.println(myValue);

        Container<Integer,String> container = new Container<>(12,"hello2");
        System.out.println(container.getItem1());
        System.out.println(container.getItem2());
        container.pintItems();

    }
}

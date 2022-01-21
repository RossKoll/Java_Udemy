package collection2;

import java.util.ArrayList;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {


        // ArrayList is like wrapper for Array
        // - easy adding
        // - easy removing
        //Array : can hold any data type : primitive or object
        //[0][1][2][3]
        String [] myfriend = new String[4];
        myfriend[0] = "Jonny";
        myfriend[1] = "Molly";
        //new array - another wat to create array
        String[] myFriend2 = {"Ana", "Bob", "Marly", "Shark", "Bob"};
        System.out.println(myfriend[0]);

        //ArrayList : can only hold Objects
        ArrayList<String> friendArrayList = new ArrayList();
        friendArrayList.add("Sonny");
        // another way to create ArrayList from Array
        ArrayList<String> friendArrayList2 = new ArrayList<>(Arrays.asList(myFriend2));
        System.out.println(friendArrayList2.size());

        //retrieve data \ get element
        System.out.println(myFriend2[1]);
        System.out.println(friendArrayList2.get(1));

        // how log is it
        System.out.println(myFriend2.length);
        System.out.println(friendArrayList2.size());

        //add new value
        //cannot do it with Array as it has fixed size
        friendArrayList2.add("New friend");

        // Set an element
        myFriend2[0] = "Carl";
        friendArrayList2.set(0, "Carl");

        //Remove element
        //cannot do it for array
        friendArrayList2.remove("Bob");

        //Print all
        System.out.println(myFriend2);
        System.out.println(friendArrayList2);
    }
}

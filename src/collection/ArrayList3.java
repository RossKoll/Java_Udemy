package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class ArrayList3 {
    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(12);
        list1.add(43);
        list1.add(15);
        list1.add(67);
        list1.add(43);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(43);

        list1.addAll(newList);
        System.out.println(list1);

        // remove data from list1 - parameter 'newList'
        list1.removeAll(newList);
        System.out.println(list1);

        // check if particular value exist in ArrayList
        boolean hasValueInList = list1.contains(67);
        System.out.println(hasValueInList);

        // check if array is empty
        list1.isEmpty();

        //remove all except value which was set as parameter
        list1.retainAll(newList);
        System.out.println(list1);


        //** remove all data from arrayList
//        list1.clear();
//        System.out.println(list1);
        System.out.println("============");

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(55);
        hashSet.add(44);
        hashSet.add(87);
        hashSet.add(61);

        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        System.out.println("============");

        HashSet<Employee> employees = new HashSet<>();
        employees.add(new Employee("Mike", 5000, "sales"));
        employees.add(new Employee("Bob", 4000, "manager"));
        employees.add(new Employee("Lily", 8000, "CEO"));

        ArrayList<Employee> arrayList1 = new ArrayList<>(employees);
        Collections.sort(arrayList1);
        System.out.println(arrayList1);

        System.out.println("==========");

        ArrayList<PracticeComparable> users = new ArrayList<>();
        users.add(new PracticeComparable("Sanny", 25));
        users.add(new PracticeComparable("Dolly", 31));
        users.add(new PracticeComparable("Max", 29));
        users.add(new PracticeComparable("Bob", 22));
        System.out.println(users);

        Collections.sort(users);
        System.out.println(users);

    }
}

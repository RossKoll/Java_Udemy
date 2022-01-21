package generics2;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {

        // Does not work
        ArrayList<Employee> employees1 = new ArrayList<>();
        ArrayList<Accountent> accountents1 = new ArrayList<>();
        //employees1 = accountents1;

        employees1.add(new Employee());
        accountents1.add(new Accountent());

        ArrayList<?> employees2 = new ArrayList<>();
        ArrayList<Accountent> accountents2 = new ArrayList<>();
        employees2 = accountents2;

        //Upper bound | all Employee child is allowed
        ArrayList<? extends Employee> employees3 = new ArrayList<>();
        ArrayList<Accountent> accountents3 = new ArrayList<>();
        employees3 = accountents3;

        //Lower bound | allowed Employee and parent
        ArrayList<? super Employee> employees4 = new ArrayList<>();
        ArrayList<Accountent> accountents4 = new ArrayList<>();
        //employees4 = accountents4;

        makeEmployeeWork(employees1);
        makeEmployeeWork(accountents1);
    }

    public static void makeEmployeeWork(List<? extends Employee> employees){
        for (Employee emp : employees){
            emp.work();
        }
    }
}

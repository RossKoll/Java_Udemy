package car_dealership;

public class Dealership {
    public static void main(String[] args) {

        Customer customer1 = new Customer("Jon", "new York", 11500);
        Employee employee1 = new Employee("Mimi");
        Vehicle vehicle1 = new Vehicle("BMW", 10000);
        Vehicle car1 = new Vehicle("BMW", 10000);

        boolean compare = car1.equals(vehicle1);
        System.out.println(compare);

        employee1.handleCustomer(customer1,false,vehicle1);
        customer1.purchaseCar(vehicle1,employee1,false);
    }
}

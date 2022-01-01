package car_dealership;

public class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double doubleAmount(Customer customer,Vehicle vehicle){
        return customer.getCashOnHand() - vehicle.getPrice();
    }


    public void runCreditHistory(Customer customer, double doubleAmount){
        System.out.println("the customer " + customer.getName() + " is approved and has credit ");

    }

    public void processTransaction(Customer customer, Vehicle vehicle){
        System.out.println("Customer "+ customer.getName() +
                " is able to by "+ vehicle + " for the price " + vehicle.getPrice());
    }

    public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle){
        if (finance == true){
            double loanAmount = vehicle.getPrice() - customer.getCashOnHand();
            runCreditHistory(customer , loanAmount);
        }else if (vehicle.getPrice() <= customer.getCashOnHand()){
            processTransaction(customer, vehicle);
        }else {
            System.out.println("Please come back you you have enough money");
        }
    }
}

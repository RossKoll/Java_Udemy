package inheritance;

public class Chicken extends Bird implements Flyable{

    public Chicken(int age, String gender, int weightInLabs) {
        super(age, gender, weightInLabs);
    }

    public void fly(){
        System.out.println("Chicken cannot fly ...");
    }

}

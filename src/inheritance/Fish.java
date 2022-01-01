package inheritance;

public class Fish extends Animals {

    public Fish(int age, String name, int weightInLabs){
        super(age, name, weightInLabs);
    }

    @Override
    public void move() {
        System.out.println("Move : fish is Swimming ...");
    }

    public void swim(){
        System.out.println("Swimming ...");
    }
}

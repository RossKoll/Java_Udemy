package inheritance;

public class Sparrow extends Bird implements Flyable{


    public Sparrow(int age, String gender, int weightInLabs) {
        super(age, gender, weightInLabs);
    }

    public void fly() {
        System.out.println("Sparrow can fly ...");
    }

    public void move(){
        System.out.println("Move: Sparrow can fly");
    }
}

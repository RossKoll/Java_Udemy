package inheritance;

public class Bird extends Animals{

    public Bird(int age, String gender, int weightInLabs) {
        super(age, gender, weightInLabs);
    }

    @Override
    public void move() {
        System.out.println("Move : Birds are Flapping wings ...");
    }

}

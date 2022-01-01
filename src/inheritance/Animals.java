package inheritance;

public abstract class Animals {

    int age;
    String gender;
    int weightInLabs;


    public Animals(int age, String gender, int weightInLabs){
        this.age = age;
        this.gender = gender;
        this.weightInLabs = weightInLabs;
    }

    public void eat(){
        System.out.println("Eating ...");
    }

    public void sleep(){
        System.out.println("Sleep ...");
    }

    public abstract void move();
}

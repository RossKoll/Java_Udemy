package OOP;

public class Earth {
    public static void main(String[] args) {
        Human human = new Human();

        human.age = 5;
        human.eyeColor = "green";
        human.name = "Tom Bom";
        human.speak();
        Human human2 = new Human("Mike",23 , 55, "blue");
        human2.speak();

        human = new Human();

        System.out.println(human == human);
        human.speak();
    }

}

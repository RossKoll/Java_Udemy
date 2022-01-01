package inheritance;

public class Zoo {
    public static void main(String[] args) {

//        Bird bird = new Bird(33, "M", 44);
//        bird.eat();
//        bird.sleep();
//
//        Chicken chicken = new Chicken(2, "M", 3);
//        chicken.fly();
//
//        Sparrow sparrow = new Sparrow(4, "F", 5);
//        sparrow.fly();
//
       Animals sparrow2 = new Sparrow(2, "F", 3);
//        Animals chicken2 = new Chicken(2, "M", 6);
        Animals fish2 = new Fish(1, "F", 1);
//
//        moveAnimal(chicken2);
//        moveAnimal(fish2);
        moveAnimal(sparrow2);
//        moveAnimal(chicken);
        Flyable flyable = new Sparrow(1, "M", 2);
        flyable.fly();

        moveAnimal(fish2);


    }

    public static void moveAnimal(Animals animals){
        animals.move();
    }
}

package lambda_practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car("Honda", "Accord", "Red", 22300),
                new Car("Honda", "Civic", "Blue", 17700),
                new Car("Toyota", "Land Cruiser", "White", 48500),
                new Car("Toyota", "Corolla", "Black", 16200),
                new Car("Toyota", "Camry", "Blue", 24000),
                new Car("Nissan", "Sentra", "White", 17300),
                new Car("Mitsubishi", "Lancer", "White", 20000),
                new Car("Jeep", "Wrangler", "Red", 24500)
        );

//        printCar(cars, new CarCondition() {
//            @Override
//            public boolean test(Car car) {
//                return car.getPrice() >= 18000 && car.getPrice() <= 22000;
//            }
//        });

        printCar(cars, (car) -> car.getPrice() >= 18000 && car.getPrice() <= 22000);
        printCar(cars, (car)->car.getColor().equals("Blue"));

        Function<Car, String> priceAndColor = (car) -> "price "+ car.getPrice() + " color "+ car.getColor();
        String stringCar = priceAndColor.apply(cars.get(0));
        System.out.println(stringCar);
    }

    public static void printCar(List<Car> cars, Predicate<Car> predicate){
        for (Car c : cars){
            if (predicate.test(c)){
                c.printCar();
            }
        }
    }
}

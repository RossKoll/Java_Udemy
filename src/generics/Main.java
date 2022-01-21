package generics;

public class Main {
    public static void main(String[] args) {

        Printed<String> stringItemToPrint = new Printed<>("Hello world");
        Printed<Integer> intItemToPrint = new Printed<>(22);
        Printed<Double> doubleItemToPrint = new Printed<>(33.5);

        stringItemToPrint.print();
        intItemToPrint.print();
        doubleItemToPrint.print();
    }
}

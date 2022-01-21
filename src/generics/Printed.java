package generics;

public class Printed <T>{

    T itemToPrint;

    public Printed(T itemToPrint){
        this.itemToPrint = itemToPrint;
    }

    public void print(){
        System.out.println(itemToPrint);
    }
}

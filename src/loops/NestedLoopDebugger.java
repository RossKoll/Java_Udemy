package loops;

public class NestedLoopDebugger {
    public static void main(String[] args) {

        // debugger
        int counter = 0;
        for (int i = 0; i <=100; i++){
            System.out.println(i);
            int temp = counter +1;
            counter = temp;
        }

        // nested loops
        int count = 0;
        for (int idx = 0; idx <100; idx++){
            for (int j = 0; j <100; j++){
                System.out.println("value of idx : "+ idx + "------" +j);
                count++;
            }
        }
        System.out.println("Counter is : " + count);
    }
}

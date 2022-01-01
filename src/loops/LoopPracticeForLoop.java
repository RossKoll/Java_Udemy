package loops;

public class LoopPracticeForLoop {

    public static void main(String[] args) {
        String name = "dsfckkfnsdlv";

        for (int i=name.length()-1; i >=0; i--){
            System.out.println("char : " + name.charAt(i));
        }

        for (int i = 0; i<=100; i+=2){
            System.out.println(i);
        }
    }

}

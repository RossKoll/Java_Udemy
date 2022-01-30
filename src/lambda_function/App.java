package lambda_function;

public class App {

    public static void main(String[] args) {

        Human tom = new Human();
        tom.walk();

        Rodots rodots = new Rodots();
        rodots.walk();

        Walkable lambdaBlocOfCode = () -> {
            System.out.println("Custom object walking");
            System.out.println("Another line in Lambda");
        };

        walker(lambdaBlocOfCode);

         LambdaInterface helloVar = () -> System.out.println("hello hello - print by Some Method");
         helloVar.someMethod();

        CalculateInterface sunLumbda= (a,b) -> a + b;
        System.out.println(sunLumbda.sum(4,6));

        CalculateInterface nonZeroDivider = (a,b) -> {
            if (a == 0) return 0;
            return a/b;
        };

       InterfaceGeneric<String> reversed = (s) -> {
            String result = "";
            for (int i = s.length()-1; i >= 0; i--){
                result = result + s.charAt(i);
            }
            return result;
        };

        System.out.println(nonZeroDivider.sum(10,5));
        System.out.println(reversed.work("Vehicle"));

    }

    //revers string ------->
    public String reverse(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--){
            result = result + str.charAt(i);
        }
        return result;
    }

    public static void walker(Walkable walkable){
        walkable.walk();
    }

    public void sayHello(){
        System.out.println("hello hello");
    }

    public int sum(int arg1, int arg2){
        return arg1 + arg2;

    }

    public int nonZeroDivide(int num1, int num2){
        if (num1 == 0) return 0;
        return num1/num2;
    }


}

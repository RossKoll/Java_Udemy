package ProcessingFiles2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
//        for (int i = 0; i <=3; i++) {
//            Scanner input = new Scanner(System.in);
//            System.out.println("Enter some text");
//            String enteredText = input.nextLine();
//            System.out.println(enteredText);
//        }
//        try {
//            File file = new File("fiee.txt");
//            Scanner input = new Scanner(file);
//            while (input.hasNextLine()) {
//                String line = input.nextLine();
//                System.out.println(line);
//            }
//            input.close();
//        }catch (FileNotFoundException e){
//            e.printStackTrace();
//            System.out.println("File not found");
//        }

        NewException newException = new NewException();
        newException.substruct10FromLargeNumber(1);

    }
}

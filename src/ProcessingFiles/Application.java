package ProcessingFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {

//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter some text");
//        String enteredText = input.nextLine();
//        System.out.println(enteredText);


        //** Read from file
//        File file = new File("my2file.txt");
//        Scanner input = new Scanner(file);
//        while (input.hasNextLine()){
//            String line = input.nextLine();
//            System.out.println(line);
//        }
//        input.close();

        MyFIleUtils myFIleUtils = new MyFIleUtils();
        System.out.println(myFIleUtils.subtract10FromLargerNumber(101));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println("hello "+ name);

    }



}

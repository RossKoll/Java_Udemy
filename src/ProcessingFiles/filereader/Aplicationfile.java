package ProcessingFiles.filereader;

import java.io.*;

public class Aplicationfile {
    public static void main(String[] args) {
        File file = new File("my2file.txt");
        //BufferedReader bufferedReader = null;
        //FileReader fileReader = null;
        try(FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);) {

            String line = bufferedReader.readLine();

            while ( line != null){
                System.out.println(line);
                line = bufferedReader.readLine();
            }

        } catch (FileNotFoundException e) {
            System.out.println("file does not found");;
        } catch (IOException e) {
            System.out.println("Problem reading file "+ file.getName());
            }
        //finally
//        {
//            try {
//                bufferedReader.close();
//                fileReader.close();
//            } catch (IOException e) {
//                System.out.println("Unable to close file "+ file.getName());
//            } catch (NullPointerException ex){
//                System.out.println("file was never opened " + ex);
//            }
        //}
    }
}

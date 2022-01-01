package loops;

public class LoopsPracticeWhile {
    public static void main(String[] args) {

    // while loop syntheses
        int count = 0;
        while (count <= 10){
            System.out.println("hello "+ count);
            count ++;

            if (count > 3){
                break;
            }
        }

        String str = " We have a largei nventory og things in our warehouse falling in " + " the category:appeeral and the slightly "
                + "more in demand category:makeup along with the category:furniture and ...";

        printCategories(str);

    }

    public static void printCategories(String string){
        int i = 0;
        while (true){
            int found = string.indexOf("category:", i );
            if (found == -1) break;
            int start = found + 9; // start of actual category
            int end = string.indexOf(" ", start);
            System.out.println(string.substring(start, end));
            i = end + 1;
        }
    }
}

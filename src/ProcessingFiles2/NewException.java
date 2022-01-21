package ProcessingFiles2;

public class NewException{

    public int substruct10FromLargeNumber(int number) throws Exception{
        if(number < 10){
            throw new Exception("O Ooo something went wrong");
        }
        return number - 10;
    }

    public class SomeException extends Exception {
        public SomeException(String message) {
            super(message);
        }
    }
}

package ProcessingFiles;

public class MyFIleUtils {

    public int subtract10FromLargerNumber(int number) throws FooRuntimeException {
        if (number <10){
            throw new FooRuntimeException("Number is less then 10");
        }
        return number - 10;
    }

    public class FooRuntimeException extends Exception{

        public FooRuntimeException(String text) {
            super(text);
        }
    }
}

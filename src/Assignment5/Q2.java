package Assignment5;

class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message) {
        super(message);
    }
}
public class Q2 {
    public static void main(String[] args) {
        Q2 obj = new Q2();

        try {
            obj.test();  // no throws needed
        } catch (MyUncheckedException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
    }

    // No throws needed for unchecked exception
    void test() {
        throw new MyUncheckedException("This is an unchecked exception.");
    }
}




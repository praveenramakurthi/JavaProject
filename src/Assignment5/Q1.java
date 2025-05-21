package Assignment5;

import java.io.IOException;

public class Q1 {

    // handlingInTheSameMethod
    public void handlingInTheSameMethod(){
        try{
            throw  new IOException("Handled in the same method");
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    //handlingInCallingMethod
    public static void handlingInCallingMethod() throws IOException{
        throw new IOException("This exception called at Calling method");
    }

    //IOException
//    void noHandling() {
//        throw new IOException("No handling or throws"); // Compile-time error
//    }

    public static void main(String[] args) {
        Q1 obj=new Q1();
        obj.handlingInTheSameMethod();

        try {
            handlingInCallingMethod();
        } catch (IOException e) {
            System.out.println("Exception caught in main method: " + e.getMessage());
        }

//        obj.noHandling();
    }
}

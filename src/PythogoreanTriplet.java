import java.util.Scanner;
public class PythogoreanTriplet {
    public static void main(String[] args) {
        for(int side1=1;side1<=500;side1++){
            for(int side2=side1;side2<=500;side2++){
                int hypotenuseSquare=side1*side1+side2*side2;
                int hypotenuse=(int)Math.sqrt(hypotenuseSquare);
                if(hypotenuse*hypotenuse==hypotenuseSquare && hypotenuse<=500){
                    System.out.printf("%-10d %-10d %-10d%n", side1,side2,hypotenuse);  //(%-10d)--   left-aligned decimal number in a 10-character-wide field
                }
            }
        }
    }
}
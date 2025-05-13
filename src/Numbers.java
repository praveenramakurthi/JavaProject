import java.util.Scanner;
public class Numbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num1=scanner.nextInt();

        System.out.println("Enter the Number2: ");
        int num2=scanner.nextInt();

        if(num1>num2){
            System.out.println("Num1 is Greater than Num2");
        }
        else if(num2>num1){
            System.out.println("Num2 is Greater than num1");
        }
        else{
            System.out.println("Both are equal");
        }
        scanner.close();
    }
}

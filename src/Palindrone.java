import java.util.Scanner;
public class Palindrone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input;

        while(true){
            System.out.println("Enter the number: ");
            input= sc.nextInt();

            if(input>=10000 && input <=99999){
                int temp=input;
                int reversed=0;
                while(temp!=0){
                    int digit =temp % 10;  //extract last num
                    reversed=reversed*10+digit; //add digit to reversed
                    temp/=10;
                }
                if(input==reversed){
                    System.out.println("Palindrone");
                }
                else{
                    System.out.println("Not a Palindrone");
                }
                break;
            }
            else{
                System.out.println("Invalid Number! enter a five digit number ");
            }
        }
        sc.close();
    }
}

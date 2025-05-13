import java.util.Scanner;
public class GrossPayCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        for(int i=1;i<=3;i++){
            System.out.print("enter the hours worked for employee "+i+": ");
            int hours= sc.nextInt();

            System.out.print("enter the rate: ");
            int rate=sc.nextInt();

            double grossPay;

            if(hours<=40){
                grossPay=rate*hours;
            }
            else {
                double extraHours=hours-40;
                grossPay=(40*rate)+(1.5*extraHours*rate);
            }
            System.out.println("Grosspay for the Employee is: "+grossPay);
        }
        sc.close();
    }
}

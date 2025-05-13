import java.util.Scanner;
public class NumberCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int zeroCounter=0;
        int negativeCounter=0;
        int positiveCounter=0;
        System.out.println("Enter the Numbers");
        for(int i=1;i<=5;i++){
            System.out.println("Enter num "+i);
            int num=sc.nextInt();
            if(num>0){
                positiveCounter++;
            }
            else if(num<0){
                negativeCounter++;
            }
            else{
                zeroCounter++;
            }
        }
        System.out.println("Number of Zeros are: "+ zeroCounter);
        System.out.println("Positives are: "+ positiveCounter);
        System.out.println("Negatives are: "+ negativeCounter);
        sc.close();
    }
}

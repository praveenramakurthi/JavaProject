import java.util.Scanner;
public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size=sc.nextInt();

        if(size>=1 && size<=20){
            for(int i=1;i<=size;i++){
                for(int j=1;j<=size;j++){
                    if(i==1 || i== size ||j==1 || j==size ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

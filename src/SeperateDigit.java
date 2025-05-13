import java.util.Scanner;
public class SeperateDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 5 digit number: ");
        String input=sc.nextLine();

        //input should be equal to 5 and contains only digits
        if(input.length()==5 && input.matches("\\d+")){
            //METHOD-1
//            for(int i=0;i<input.length();i++){
//                System.out.print(input.charAt(i));
//                if(i<input.length()-1){
//                    System.out.print(" ");
//                }
//            }
            //METHOD-2
            String[] digits=input.split("");
            String result=String.join(" ",digits);
            System.out.println(result);
        }
        else{
            System.out.println("Invalid input!! The input should Only contains 5 digits::");
        }
        sc.close();
    }
}

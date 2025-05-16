package Assignment3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=sc.nextLine();

        StringBuilder stringbuilder=new StringBuilder();
        for(char ch:str.toCharArray()){      //converts to ascii value
            System.out.println("Ascii values for "+ch+" is :"+(int)ch);
//            System.out.print(Integer.toHexString((int)ch));
            stringbuilder.append(Integer.toHexString((int) ch));
        }
        System.out.println(stringbuilder);
    }
}

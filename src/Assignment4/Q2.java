package Assignment4;

import java.util.Scanner;
import java.util.Stack;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        boolean isPalindrone=true;
        for(int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=stack.pop()){
                isPalindrone=false;
            }
        }
        if(isPalindrone){
            System.out.println("The string is a Palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
}

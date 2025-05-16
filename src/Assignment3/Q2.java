package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input=sc.nextLine();
        String words[]=input.split(" ");
        if(words.length<=2){
            System.out.println(words);
        }
        else {
            ArrayList<String> finalResult=new ArrayList<>();

            finalResult.add(words[words.length-1]);
            for(int i= words.length-2;i>0;i--) {
                StringBuilder reversed=new StringBuilder(words[i]);
                finalResult.add(reversed.reverse().toString());
            }
            finalResult.add(words[0]);

            for(String word:finalResult){
                System.out.print(word+" ");
            }
        }
        sc.close();
    }
}
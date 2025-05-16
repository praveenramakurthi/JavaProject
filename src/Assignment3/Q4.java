package Assignment3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public  class Q4 {
    private static String filterStr(String string){
        return string.replaceAll("[^a-zA-z]","").toLowerCase();
    }
    public static boolean checkAnagram(String string1,String string2){
        String Cleaned1=filterStr(string1);
        String Cleaned2=filterStr(string2);

        if(Cleaned1.length()!=Cleaned2.length()){
            return false;
        }
        char char1[]=Cleaned1.toCharArray();
        char char2[]=Cleaned2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1,char2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String1: ");
        String string1 = sc.nextLine();

        System.out.println("Enter String2: ");
        String string2 = sc.nextLine();

        if(checkAnagram(string1,string2)){
            System.out.println("The Strings are Anagram");
        }
        else{
            System.out.println("The strings are Not Anagram");
        }
    }
}
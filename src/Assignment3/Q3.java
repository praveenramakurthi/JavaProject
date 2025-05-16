package Assignment3;

import java.util.Scanner;

public  class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] words=input.split(" ");
        String firstWord=words[0];
        int length=firstWord.length();
        String res="";
        for (int i=0;i<length;i++){
            for(int j=i+1;j<=length;j++){
                String stem= firstWord.substring(i,j);
                System.out.println(stem);
                int k;
                for(k=1;k<words.length;k++){
                    if(!words[k].contains(stem)){
                        System.out.println("words[k]: "+ words[k]);
                        System.out.println("stem: "+stem);
                        break;
                    }
                }
                if(k== words.length && res.length()<stem.length()){
                    res=stem;
                }
            }
        }
        System.out.println("Longest common substring is: "+res);
    }
}
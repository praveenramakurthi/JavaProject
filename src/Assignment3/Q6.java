package Assignment3;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        ArrayList<Integer> lubic = new ArrayList<>();
        lubic.add(1);

        ArrayList<Integer> numbers =new ArrayList<>();
        for(int i=2;i<n;i++){
            numbers.add(i);
        }
        int i=0;
        while(i<numbers.size()){
            int current= numbers.get(i);
            lubic.add(current);


        }
    }
}

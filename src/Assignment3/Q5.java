package Assignment3;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i;k++){
                System.out.print("-  ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=n;j>i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i;k++){
                System.out.print("-  ");
            }
            System.out.println();
        }
    }
}



//	        - -                                 (1,5)(1,6)
//        - - - -                          (2,4)(2,5)(2,6)(2,7)
//      - - - - - -                    (3,3)(3,4)(3,5)(3,6)(3,7)(3,8)
//    - - - - - - - -                (4,2)(4,4)(4,5)(4,6)(4,7)(4,8)(4,9)
//  - - - - - - - - - -      (5,1)(5,2)(5,3)(5,4)(5,5)(5,6)(5,7)(5,8)(5,9)(5,10)
//    - - - - - - - -
//      - - - - - -
//        - - - -
//          - -

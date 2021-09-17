package com.company.pattern;

import java.util.Scanner;

public class RightPascal {
    public static void printRightPascal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

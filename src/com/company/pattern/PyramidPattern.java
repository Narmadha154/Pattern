package com.company.pattern;

import java.util.Scanner;

public class PyramidPattern {
    public static void printPyramid(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-i;j>1;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

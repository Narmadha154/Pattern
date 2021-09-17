package com.company.pattern;

import java.util.Scanner;

public class ZPattern {
    public static void printZPattern() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows:");
        int row = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<row;j++){
                if(i==0||i==row-1||j==row-i-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

package com.company.pattern;

import java.util.Scanner;

public class DiamondPat {
    public static void printDia() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int row= sc.nextInt();
        int x=row;
        int y=row;
        for(int i=1;i<row;i++){
            for(int j=1;j<row*2;j++) {
                if (j == x || j == y ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            x--;
            y++;
            System.out.println();
        }
        for(int i=row;i>=1;i--){
            for(int j=1;j<row*2;j++) {
                if (j == x || j == y ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            x++;
            y--;
            System.out.println();
        }
    }
}

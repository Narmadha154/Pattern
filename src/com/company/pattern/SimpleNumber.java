package com.company.pattern;

import java.util.Scanner;

public class SimpleNumber {
    public static void printSimpleNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

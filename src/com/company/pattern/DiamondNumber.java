package com.company.pattern;

import java.util.Scanner;

public class DiamondNumber {
    public static void printDiamondNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:");
        int n= sc.nextInt();
        int c=1;
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=c;k>=1;k--){
                System.out.print(Math.abs(k-i)+1);
            }
            c+=2;
            System.out.println();
        }
        c-=3;
        for(int i=n;i>=1;i--){
            for(int j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(int k=c;k>1;k--){
                System.out.print(Math.abs(k-i)+1);
            }
            c-=2;
            System.out.println();
        }
     /*   for(int i=n-2;i>=0;i--){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }*/
       /* for(int i=1;i<=n;i++){
            int row=n*2;
            for(int j=1;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int l=2;l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            int row=(n*2)+2;
            for(int j=0;j<=row-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int l=2;l<=i;l++){
                System.out.print(l);
            }
            System.out.println();
        }*/
    }
}

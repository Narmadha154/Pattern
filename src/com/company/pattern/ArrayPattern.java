package com.company.pattern;

import java.util.Scanner;

public class ArrayPattern {
    public static void printArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        char [] ch=new char[size];
        System.out.println("Enter the elements:");
        for(int i=0;i<size;i++){
            ch[i]=sc.next().charAt(0);
        }
        for(int i=0,j=size-1;i<=j;i++,j--){
            if(i!=j){
                System.out.print(ch[i]+" "+ch[j]);
            }
            else{
                System.out.print(ch[i]+" ");
            }
            System.out.println();
        }
        int k=size/2;
        for(int i=k-1,j=k+1;j<size&&i>=0;i--,j++){
            System.out.print(ch[i]+" "+ch[j]);
            System.out.println();
        }
    }
}

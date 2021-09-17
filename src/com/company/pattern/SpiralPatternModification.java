package com.company.pattern;

import java.util.Scanner;

public class SpiralPatternModification {
    public static void printSpiralModify(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the no. of col:");
        int col = sc.nextInt();
        int [][] matrix=new int[row][col];
        int top=0;
        int down=row-1;
        int left=0;
        int right=col-1;
        int c=1;
        while(true){
            for(int i=left;i<=right;i++){
                matrix[top][i]=c;
                c++;
            }
            top++;
            if(top>down||left>right){
                break;
            }
            for(int i=top;i<=down;i++){
                matrix[i][right]=c;
                c++;
            }
            right--;
            if(top>down||left>right){
                break;
            }
            for(int i=right;i>=left;i--){
                matrix[down][i]=c;
                c++;
            }
            down--;
            if(top>down||left>right){
                break;
            }
            for(int i=down;i>=top;i--){
                matrix[i][left]=c;
                c++;
            }
            left++;
            if(top>down||left>right){
                break;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

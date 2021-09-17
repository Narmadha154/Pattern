package com.company.pattern;

import java.util.Scanner;

public class PrintXO {
    public static void printXOPattern(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int row = sc.nextInt();
        System.out.println("Enter the no. of col:");
        int col = sc.nextInt();
        char [][] matrix=new char[row][col];
        int top=0;
        int down=row-1;
        int left=0;
        int right=col-1;
        char c;
        while(true){
            if(top%2==0){
                c='X';
            }
            else{
                c='O';
            }
            for(int i=left;i<=right;i++){
                matrix[top][i]=c;
            }
            top++;
            if(top>down||left>right){
                break;
            }
            for(int i=top;i<=down;i++){
                matrix[i][right]=c;
            }
            right--;
            if(top>down||left>right){
                break;
            }
            for(int i=right;i>=left;i--){
                matrix[down][i]=c;
            }
            down--;
            if(top>down||left>right){
                break;
            }
            for(int i=down;i>=top;i--){
                matrix[i][left]=c;
            }
            left++;
            if(top>down||left>right){
                break;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

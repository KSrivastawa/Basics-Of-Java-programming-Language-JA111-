package com.sprint3.assignment1.Q2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row,column;
		int c=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no. of rows: ");
		row=sc.nextInt();
		
		System.out.println("Enter no. of columns: ");
		column=sc.nextInt();
		
		int[][] mat = new int[row][column];
		
		System.out.println("Enter "+row*column+" elements for the matrix: ");
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				mat[i][j]=sc.nextInt();
			}
			
		}
		
		System.out.println("Matrix of "+ row +" X "+column +" :");
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
			System.out.print(mat[i][j]+" ");
			}
			System.out.println("\n");
		}
		
		
		for(int i=0; i<column; i++) {
			int sum =0;
			for(int j=row-1; j>=0; j--) {
				if(mat[j][i]%2==0) {
					sum+= mat[j][i];
				}
			
			}
			System.out.println("Sum of all even elements of "+ ++c +" column: " +sum);
		}
		
		
	}

}

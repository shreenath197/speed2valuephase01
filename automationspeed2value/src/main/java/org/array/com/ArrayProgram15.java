package org.array.com;

import java.util.Scanner;

public class ArrayProgram15 {

	public static void main(String[] args) {
		
		int arr[][]=new int[3][2];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
			System.out.print("Please enter no.");
			arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
			System.out.print(arr[i][j]+" ");
			
			}
			
			System.out.println();
		
		}
		
	}}


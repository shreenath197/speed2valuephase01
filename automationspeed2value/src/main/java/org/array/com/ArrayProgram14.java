package org.array.com;

import java.util.Scanner;

public class ArrayProgram14 {

	public static void main(String[] args) {
		
		int arr[]=new int[2];
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Please enter no.");
			arr[i]=sc.nextInt();
			sum=sum+arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println(sum);
		
		}
		
	}


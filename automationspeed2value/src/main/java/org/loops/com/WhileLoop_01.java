package org.loops.com;

import java.util.Scanner;

public class WhileLoop_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		while(input!=0)
			
		{
			sum=sum+input;
			input=sc.nextInt();
		}
		
		System.out.println(sum);

	}

}

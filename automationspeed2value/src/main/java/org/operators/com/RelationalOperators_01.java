package org.operators.com;

import java.util.Scanner;

public class RelationalOperators_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter Shreenath's age");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("Shreenath is eligible for vote");
		}
		else
		{
			System.out.println("Shreenath is not eligible for vote");
		}
			
			

	}

}

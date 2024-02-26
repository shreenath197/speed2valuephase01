package org.javacontrolstatements.com;

import java.util.Scanner;

public class IfElseStatements_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter year");
		int year=sc.nextInt();
		if(year%4==0 && year%100==0 || year%400==0)
		{
			System.out.println("This is leap year");
		}
		else
		{
			System.out.println("This is not leap year");
		}

	}

}

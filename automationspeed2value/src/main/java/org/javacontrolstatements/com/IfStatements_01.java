package org.javacontrolstatements.com;

import java.util.Scanner;

public class IfStatements_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter Shreenath's age");
		int age=sc.nextInt();
		if(age>18)
		{
			System.out.println("Shreenath is eligible for vote");
		}
		

	}

}

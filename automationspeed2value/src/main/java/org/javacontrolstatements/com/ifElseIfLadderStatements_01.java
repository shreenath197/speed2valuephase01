package org.javacontrolstatements.com;

import java.util.Scanner;

public class ifElseIfLadderStatements_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter day");
		int dayofWeek=sc.nextInt();
		if (dayofWeek==0)
			
		{
			System.out.println("Sunday");
		}
		
		else if (dayofWeek==1) 
		{
			
			System.out.println("Monday");
		}
		else if (dayofWeek==2) 
		{
			
			System.out.println("Tueasday");
		}
		
		else if (dayofWeek==3) 
		{
			
			System.out.println("Wednesday");
		}
		
		else if (dayofWeek==4) 
		{
			
			System.out.println("Thursday");
		}
		
		else if (dayofWeek==5) 
		{
			
			System.out.println("Friday");
		}
		else if (dayofWeek==6) 
		{
			
			System.out.println("Saturday");
		}
		
		else
		{
			System.out.println("Please enter correct no.");
		}
	}

}

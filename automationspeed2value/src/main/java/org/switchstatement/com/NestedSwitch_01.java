package org.switchstatement.com;

import java.util.Scanner;

public class NestedSwitch_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter day");
		int day=sc.nextInt();
		System.out.print("Please enter city");
		String city=sc.next();
		
		switch (day) {
		case 1:
			switch (city) {
			case "Pune":
				
				System.out.println("Monday"+" "+city);
				break;
			}
			
			break;
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
			
			default:
				
				System.out.println("Please enter correct day");
			
		}
		

	}

}

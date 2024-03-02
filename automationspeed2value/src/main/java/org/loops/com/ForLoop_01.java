package org.loops.com;

import java.util.Scanner;

public class ForLoop_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter table no.");
		int no=sc.nextInt();
		for (int i=1;i<=10;i++)
		{
			System.out.println(no+"*"+i+"="+no*i);
		}

	}

}

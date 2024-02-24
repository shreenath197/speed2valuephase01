package org.javacontrolstatements.com;

public class NestedIfStatement_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		int b=20;
		int c=30;
		if(a>b)
		{
			if (a>c)
				
			{
				System.out.println("Correct");
			}
			else
			{
				System.out.println("NotCorrect");
			}
		}
		
		else
		{
			System.out.println("Change your condition");
		}

	}

}

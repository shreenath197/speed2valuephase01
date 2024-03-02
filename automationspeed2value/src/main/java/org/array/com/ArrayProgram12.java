package org.array.com;

public class ArrayProgram12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[3][4];
		int counter=1;
		for (int i=0;i<a.length;i++)
		{
			//System.out.println(i);
			for (int j=0;j<a[i].length;j++)
			{
				a[i][j]=counter;
				System.out.print(counter);
				counter++;
			}
			System.out.println();
			
		}

	}

}

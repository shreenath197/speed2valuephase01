package org.array.com;

public class ArrayProgram13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{10,20},{30,40},{50,60}};
		int b[][]={{10,20},{30,40},{50,60}};
		int c[][]=new int[3][2];
		for (int i=0;i<3;i++)
		{
			for (int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

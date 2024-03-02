package org.loops.com;

public class NestedForLoop_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] ammount={{10,2,3},{10,2,3},{10,2,3},{10,2,3},{10,2,3}};
		for (int i=0; i<5;i++)
		{
			for (int j=0;j<3;j++)
			{
				System.out.print(ammount[i][j]+"\t");
			}
			 System.out.println();
		}
		
           
	}

}

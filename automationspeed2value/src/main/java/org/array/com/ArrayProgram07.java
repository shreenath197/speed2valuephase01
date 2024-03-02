package org.array.com;

public class ArrayProgram07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]=new int[5];
		int y[]=new int[10];
		int z[]=new int[5];
		x=y;//only memory assigned not value
		x=z;
		x[4]=10;
		System.out.println(x[4]);
		
	}

}

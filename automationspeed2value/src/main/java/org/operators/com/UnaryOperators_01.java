package org.operators.com;

public class UnaryOperators_01 {

	static int i=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(i);
		System.out.println(i);	
		
	}

	private static  int test(int i) {
		// TODO Auto-generated method stub
	    i=20;
		System.out.println(i);
		return i++;
	}

}

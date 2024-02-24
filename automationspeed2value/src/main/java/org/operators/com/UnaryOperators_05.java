package org.operators.com;

public class UnaryOperators_05 {

	
	public static void main(String[] args) {
		int i=1;
		int j=i++ + test1(i++) + ++i +test2 (i++);//1+2+4+5
		System.out.println(i);
		//System.out.println(j);
		    
			}

	private static int test2(int i) {
		// TODO Auto-generated method stub
		return i++;
	}

	private static int test1(int i) {
		// TODO Auto-generated method stub
		return ++i;
	}
	}



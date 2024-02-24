package org.operators.com;

public class AndBitOperators_01 {

	public static void main(String[] args) {
		int a=10;  
		int b=5;  
		int c=20;  
		System.out.println(a>b||a<c);//true || true = true  
		System.out.println(a>b|a<c);//true | true = true  
		//|| vs |  
		System.out.println(a>b||a++<c);//true || true = true  
		System.out.println(a);//10 because second condition is not checked    

	}

}

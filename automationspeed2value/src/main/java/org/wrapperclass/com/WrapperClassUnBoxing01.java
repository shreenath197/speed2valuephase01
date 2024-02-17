package org.wrapperclass.com;

public class WrapperClassUnBoxing01 {

	public static void main(String[] args) {
	  //Case:01-UnBoxing <Conversion from object to primitive>
		Integer i=100;
		int j=i.intValue();
		System.out.println(j);
		int k=j+10;
		System.out.println(k);
	  //Case:02-UnBoxing <Conversion from object to primitive>
		Float f=200f;
		float l=f.floatValue();
		System.out.println(l);
	  //Case:03-UnBoxing <Conversion from object to primitive>
		String s="12345";
		Integer h=Integer.parseInt(s);
		System.out.println(h+1);
		int w=h.intValue();
		System.out.println(w+2);
		
		
		
	}

}

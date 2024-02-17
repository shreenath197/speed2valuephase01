package org.wrapperclass.com;

public class WrapperClassBoxing01 {

	public static void main(String[] args) {
	  //Case:01-Boxing <Conversion from primitive to object>
		int i=10;
		Integer integer01=new Integer(i);
		System.out.println(integer01);
		Integer integer02=new Integer(100);
		System.out.println(integer02);
	  //Case:02-Boxing <Conversion from primitive to object>
		Integer integer03=Integer.valueOf(i);
		System.out.println(integer03);
	  //Case:03-Boxing <Conversion from primitive to object>
		String s="12345";
		int g=Integer.parseInt(s);
		Integer q=Integer.valueOf(g);
		System.out.println(q+1);

	}

}

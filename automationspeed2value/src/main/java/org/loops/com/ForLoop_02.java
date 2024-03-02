package org.loops.com;

public class ForLoop_02 {
	
	public static void main(String[] args) {
		int sum=0;
		int[] arr= {100,87,101,89,276};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i+"------>"+arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println("Total Sun"+"="+sum);
		
	}

}

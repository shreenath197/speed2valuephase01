package org.dateclass.com;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(date));
	

	}}



package org.dateclass.com;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat04 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		String s="29-03-2024";
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.parse(s));
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf1.format(date));
	

	}}



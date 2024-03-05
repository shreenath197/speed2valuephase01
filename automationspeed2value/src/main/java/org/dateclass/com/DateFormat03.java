package org.dateclass.com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date=new Date();
		Calendar calender=Calendar.getInstance();
		calender.setTime(date);
		calender.add(Calendar.DAY_OF_YEAR, -90);
		Date dateAfter90=calender.getTime();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.println(sdf.format(dateAfter90));
		System.out.println("hello");

	}

}

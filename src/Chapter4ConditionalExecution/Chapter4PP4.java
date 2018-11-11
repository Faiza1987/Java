package Chapter4ConditionalExecution;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*Write a program that prompts for a date (month, day, year) and reports the day of the week
for that date. It might be helpful to know that January 1st, 1601 was a Monday. */

public class Chapter4PP4 {
	public static void main(String[] args) throws ParseException {
		
		String input_date = "06/02/1985";
		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		Date dt1 = format1.parse(input_date);
		SimpleDateFormat format2 = new SimpleDateFormat("EEEE");
		String finalDay = format2.format(dt1);
		
		System.out.println(finalDay);
		
	}
}

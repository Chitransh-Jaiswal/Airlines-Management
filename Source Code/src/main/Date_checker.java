package main;

public class Date_checker {
	public boolean date_checker(String dob) {
		System.out.println(dob);
		
		if (dob.charAt(4) != '-' || dob.charAt(7) != '-')return false;
//		System.out.println(dob);
		String year_string = dob.substring(0 , 4);
		int year = Integer.parseInt(year_string);
		String month_string = dob.substring(5 , 7);
		int month = Integer.parseInt(month_string);
		String date_string = dob.substring(8 , 10);
		int date = Integer.parseInt(date_string);
		System.out.printf("\n%d %d %d \n" , year , month , date);
//		System.out.println("YEET");
		if (date > 0 && date <= 31 && month > 0 && month <= 12 && year >= 0)
		return true;
//		System.out.println("False");
		return false;
	}
}

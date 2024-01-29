package main;

public class time_check {
	public Boolean time_check(String time) {
		System.out.println(time);
		
		if (time.charAt(2) != ':' || time.charAt(5) != ':')return false;
		int hours = Integer.parseInt(time.substring(0 , 2));
		int mins = Integer.parseInt(time.substring(3 , 5));
		int secs = Integer.parseInt(time.substring( 6 , 8));
//		System.out.println("yeet");
		if (hours >= 0 && hours < 24 && mins >= 0 && mins < 60 && secs >= 0 && secs < 60 )return true;
//		System.out.println("false");
		return false;
	}
}

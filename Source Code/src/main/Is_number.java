package main;

public class Is_number {
	public Boolean is_num(String a) {
		
		int i = 0;
			
		for ( ; i < a.length() ; i++) {
			
			if (a.charAt(i) < '0' || a.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}
}

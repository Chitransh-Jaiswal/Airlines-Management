package TableClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Airport {
	
	public String name;
	public int Airport_num;
	public String Location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
        public void setAirport_num(int num) {
		Airport_num = num;
	}
        public int getAirport_num() {
		return Airport_num;
	}
        static int toInt(String a) {
		int num = 0;
		for (int i = 0 ; i < a.length() ; i++) {
			num = num*10 + a.charAt(i)-'0';
		}
		return num;
	}
	public int get_airportnum_byName(String a ) {				
		
		try {

			ConnectionManager cm= new ConnectionManager();
                        Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
			
			Statement stmt = mycon.createStatement();
			
			ResultSet myrs = stmt.executeQuery(String.format("SELECT * FROM AIRPORT WHERE name = '%s'" , a));
			if (myrs.next()){
                            return toInt(myrs.getString("Airport_num"));
                        }
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return -1;
	}
        public String get_airportLoc_byNum(int a ) {				
		
		try {

			ConnectionManager cm= new ConnectionManager();
                        Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
			
			Statement stmt = mycon.createStatement();
			
			ResultSet myrs = stmt.executeQuery(String.format("SELECT * FROM AIRPORT WHERE Airport_num = %d" , a));
			if (myrs.next())
			{
				return myrs.getString("Name");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
        
}

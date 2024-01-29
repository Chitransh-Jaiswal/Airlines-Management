package TableClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Flight_leg {
	public int flightNumber;
	public int leg_num;
	public int departure;
	public int arrival; 
	public int distance; 
	public String arrival_time;
	public String departure_time;
	public String Flight_status;
        int cost;
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
        public int getcost() {
		return cost;
	}
	public void setcost(int cc) {
		this.cost = cc;
	}
	public int getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}
	public int getleg_num() {
		return leg_num;
	}
	public void setleg_num(int leg_num) {
		this.leg_num = leg_num;
	}
	public int getDeparture() {
		return departure;
	}
	public void setDeparture(int departure) {
		this.departure = departure;
	}
	public int getArrival() {
		return arrival;
	}
	public void setArrival(int arrival) {
		this.arrival = arrival;
	}
	public String getArrival_time() {
		return arrival_time;
	}
	public void setArrival_time(String arrival_time) {
		this.arrival_time = arrival_time;
	}
	public String getDeparture_time() {
		return departure_time;
	}
	public void setDeparture_time(String departure_time) {
		this.departure_time = departure_time;
	}
	public String getFlight_status() {
		return Flight_status;
	}
	public void setFlight_status(String flight_status) {
		Flight_status = flight_status;
	}
        public boolean check(int leg_num) {
		
		try {
			
			ConnectionManager cm= new ConnectionManager();
                        Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
			
			Statement stmt = mycon.createStatement();
			
			ResultSet myrs;
			
			myrs = stmt.executeQuery(String.format("SELECT * FROM Flight_legs WHERE leg_num = %d " , leg_num));
			
			if (!myrs.next()) {
				return false;
			}
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
        public void getBy_legnum(int lnum) {
		
		try {
			
			ConnectionManager cm= new ConnectionManager();
                        Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
			
			Statement stmt = mycon.createStatement();
			
			ResultSet myrs;
			
			myrs = stmt.executeQuery(String.format("SELECT * FROM Flight_legs WHERE leg_num = %d " , lnum));
			
			if (!myrs.next()) {
				return;
			}
                        this.arrival=myrs.getInt("arrival_airport");;
                        this.arrival_time=myrs.getString("arrival_time");;
                        this.departure=myrs.getInt("departure_airport");;
                        this.departure_time=myrs.getString("departure_time");;
			return;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}
        public void increment(int lnum,int seats_taken) {
		
		try {
			
			ConnectionManager cm= new ConnectionManager();
                        Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
			
			Statement stmt = mycon.createStatement();
			
			ResultSet myrs;
			
			myrs = stmt.executeQuery(String.format("SELECT * FROM Flight_legs WHERE leg_num = %d " , lnum));
                        while(myrs.next()){
                        int seats = myrs.getInt("avail_seats")+seats_taken;
                        stmt.executeUpdate(String.format("update Flight_legs set avail_seats='%s' WHERE leg_num = '%s' " , seats,lnum));
                        
			return;
                        }
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}
        public int decrement(int lnum,int seats_req) {
		
		try {
			
			ConnectionManager cm= new ConnectionManager();
                        Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
			
			Statement stmt = mycon.createStatement();
			
			ResultSet myrs;
			
			myrs = stmt.executeQuery(String.format("SELECT * FROM Flight_legs WHERE leg_num = '%s' " , lnum));
			
			if (!myrs.next()) {
				return 0;
			}
                        int seats =myrs.getInt("avail_seats");
                        seats=seats-seats_req;
                        if(seats<0){
                            return 0;
                        }
                        
                        stmt.executeUpdate(String.format("update Flight_legs set avail_seats='%s' WHERE leg_num = '%s' " , seats,lnum));
                        
			return 1;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}
}

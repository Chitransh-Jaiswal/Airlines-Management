package TableClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Airplane {
	private int Flight_num;
	private String model;
	private String Airline;
	private int maximum_occupancy;

    /**
     * @return the Flight_num
     */
    public int getFlight_num() {
        return Flight_num;
    }

    /**
     * @param Flight_num the Flight_num to set
     */
    public void setFlight_num(int Flight_num) {
        this.Flight_num = Flight_num;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the Airline
     */
    public String getAirline() {
        return Airline;
    }

    /**
     * @param Airline the Airline to set
     */
    public void setAirline(String Airline) {
        this.Airline = Airline;
    }

    /**
     * @return the maximum_occupancy
     */
    public int getMaximum_occupancy() {
        return maximum_occupancy;
    }

    /**
     * @param maximum_occupancy the maximum_occupancy to set
     */
    public void setMaximum_occupancy(int maximum_occupancy) {
        this.maximum_occupancy = maximum_occupancy;
    }
    
    public boolean check_by_num(int number) {
		
		
		try {

			ConnectionManager cm= new ConnectionManager();
                        Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
			Statement stmt = mycon.createStatement();			
			ResultSet myrs = stmt.executeQuery(String.format("SELECT * FROM Airplane WHERE Flight_num = %d" , number));
			
			if (myrs.next()) {
                                this.Flight_num=Integer.parseInt(myrs.getString("flight_num"));
                                this.Airline=myrs.getString("company");
                                this.maximum_occupancy=Integer.parseInt(myrs.getString("num_seats"));
                                this.model=myrs.getString("model");
				return true;
			}
			return false;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

    
}

package TableClasses;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class Person {
        int cust_num;
        private String username;
	private String name; 
	private String address;
	private String email; 
	private String phone; 
	private String Gender;
	private String Date_of_Birth;
	private Account account;
	private String passportNumber;
	 
    public Person(){
        username=null;
        name=null;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }
    public int getCustNum() {
        return cust_num;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return Gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the Date_of_Birth
     */
    public String getDate_of_Birth() {
        return Date_of_Birth;
    }

    /**
     * @param Date_of_Birth the Date_of_Birth to set
     */
    public void setDate_of_Birth(String Date_of_Birth) {
        this.Date_of_Birth = Date_of_Birth;
    }

    /**
     * @return the account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * @return the passportNumber
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * @param passportNumber the passportNumber to set
     */
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public void get_by_uname(String uname) {
		
		
		try {

			ConnectionManager cm= new ConnectionManager();
                        Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
			Statement stmt = mycon.createStatement();			
			ResultSet myrs = stmt.executeQuery(String.format("SELECT * FROM customer WHERE username = '%s'" , uname));
			
			if (myrs.next()) {
                                this.username=myrs.getString("username");
                                this.name=myrs.getString("name");
                                this.cust_num=myrs.getInt("cust_num");
                                this.Gender=myrs.getString("gender");
                                this.email=myrs.getString("email");
                                return;
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return;
	}

}

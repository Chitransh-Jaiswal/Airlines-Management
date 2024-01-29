/**Varad Nandanwankar - 20ucs221
 * Himanshi Sharma - 21ucc052
 * Sumedha Singh - 21ucs212
 */


package TableClasses;

public class Account {
	
	private String Username;
	private String password;
        private String type;
        
        public Account(String u,String p){
            Username=u;
            password=p;
           
        }
        public Account(){
            Username="";
            password="";
           
        }

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
        
}

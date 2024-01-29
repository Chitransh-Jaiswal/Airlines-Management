/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableClasses;

/**
 *
 * @author user
 */
public class ConnectionManager {
    private String u;
    private String p;
    private String url;
    public ConnectionManager(){
        u="root";
        p="varad2002";
        url="jdbc:mysql://localhost:3306/flight_management";
    }

    /**
     * @return the u
     */
    public String getU() {
        return u;
    }

    /**
     * @return the p
     */
    public String getP() {
        return p;
    }
    
    public String getUrl() {
        return url;
    }
    
}

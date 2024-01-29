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
public class Ticket {
    private int ticket_num;
    private int cust_num;
    private String status;
    private int leg_num;
    private int seats;

    /**
     * @return the ticket_num
     */
    public int getTicket_num() {
        return ticket_num;
    }

    /**
     * @param ticket_num the ticket_num to set
     */
    public void setTicket_num(int ticket_num) {
        this.ticket_num = ticket_num;
    }
    
    public int getnum_seats() {
        return seats;
    }

    public void setseats(int s) {
        this.seats = s;
    }

    /**
     * @return the cust_num
     */
    public int getCust_num() {
        return cust_num;
    }

    /**
     * @param cust_num the cust_num to set
     */
    public void setCust_num(int cust_num) {
        this.cust_num = cust_num;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the leg_num
     */
    public int getLeg_num() {
        return leg_num;
    }

    /**
     * @param leg_num the leg_num to set
     */
    public void setLeg_num(int leg_num) {
        this.leg_num = leg_num;
    }
}

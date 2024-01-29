
package main;

import TableClasses.Account;
import TableClasses.Airplane;
import TableClasses.Airport;
import TableClasses.ConnectionManager;
import TableClasses.Flight_leg;
import TableClasses.Person;
import TableClasses.Ticket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TicketCan extends javax.swing.JFrame {

    Account ac;
    public TicketCan() {
        initComponents();
    }
    public TicketCan(Account nac) {
        initComponents();
        ac=nac;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_tk = new javax.swing.JTable();
        Bcancel = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        TFticknum = new javax.swing.JTextField();
        Bshow = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tickets");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 24, 99, -1));

        table_tk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ticket Number", "Departure", "Arrival", "Departure Time", "Arrival Time", "Seats", "Status"
            }
        ));
        jScrollPane2.setViewportView(table_tk);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 96, 748, 233));

        Bcancel.setText("Cancel Ticket");
        Bcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BcancelActionPerformed(evt);
            }
        });
        getContentPane().add(Bcancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 347, 151, -1));

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 108, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Ticket Num");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 104, -1));
        getContentPane().add(TFticknum, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 348, 97, -1));

        Bshow.setText("Show All");
        Bshow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BshowActionPerformed(evt);
            }
        });
        getContentPane().add(Bshow, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 62, 151, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/gettyimages-1302813215_wide-6c48e5a6aff547d2703693450c4805978de47435-s1100-c50.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-330, 0, 1100, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private synchronized void BcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BcancelActionPerformed
        Ticket tk= new Ticket();
        Flight_leg fl= new Flight_leg();
        tk.setTicket_num(Integer.parseInt(TFticknum.getText()));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();               
            ResultSet myrs=stmt.executeQuery(String.format("select * from ticket where ticket_num='%s'" ,tk.getTicket_num()));
            while(myrs.next()){                
                fl.increment(myrs.getInt("leg_num"), myrs.getInt("seats"));
                stmt.executeUpdate(String.format("update ticket set status='cancelled' where ticket_num='%s'" ,tk.getTicket_num()));
                JOptionPane.showMessageDialog(TicketCan.this, "Cancelled");
                return;
            }
            JOptionPane.showMessageDialog(TicketCan.this, "No Ticket Found");
            return;                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BcancelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        
        CustDash CustDash= new CustDash(ac);
        CustDash.setVisible(true);
        return;
    }//GEN-LAST:event_jButton2ActionPerformed

    private synchronized void BshowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BshowActionPerformed
        Ticket tk= new Ticket();
        Person p= new Person();
        Airplane aplane = new Airplane();
        Airport aport = new Airport();
        Flight_leg fl= new Flight_leg();
        p.get_by_uname(ac.getUsername());
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();
            DefaultTableModel mod= (DefaultTableModel)table_tk.getModel();
            ResultSet myrs = stmt.executeQuery(String.format("Select * from ticket where cust_num='%s'",p.getCustNum()));
            mod.setRowCount(0);
            while(myrs.next()){
                
                tk.setTicket_num(myrs.getInt("ticket_num"));
                tk.setCust_num(myrs.getInt("cust_num"));
                tk.setLeg_num(myrs.getInt("leg_num"));
                tk.setStatus(myrs.getString("status"));
                tk.setseats(myrs.getInt("seats"));
                fl.getBy_legnum(tk.getLeg_num());
                
                Object[] row= new Object[7];
                row[0]=tk.getTicket_num();
                row[1]=aport.get_airportLoc_byNum(fl.getDeparture());
                row[2]=aport.get_airportLoc_byNum(fl.getArrival());
                row[3]=fl.getDeparture_time();
                row[4]=fl.getArrival_time();
                row[5]=tk.getnum_seats();
                row[6]=tk.getStatus();
                               
                mod.addRow(row);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BshowActionPerformed

 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicketCan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bcancel;
    private javax.swing.JButton Bshow;
    private javax.swing.JTextField TFticknum;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_tk;
    // End of variables declaration//GEN-END:variables
}

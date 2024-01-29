
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

public class Book extends javax.swing.JFrame {

    
    Account ac;
    public Book() {
        initComponents();
    }
    public Book(Account nac) {
        initComponents();
        ac=nac;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();            
            ResultSet myrs = stmt.executeQuery(String.format("Select name from Airport"));            
            while(myrs.next()){
                CBdair.addItem(myrs.getString("name"));
                CBaair.addItem(myrs.getString("name"));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bsearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        TFlegnum = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TFseatsReq = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_fl = new javax.swing.JTable();
        CBdair = new javax.swing.JComboBox<>();
        CBaair = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Find Flights");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 26, 144, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Departure Airport");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 90, 95, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Arrival Airport");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 90, -1));

        bsearch.setText("Search");
        bsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsearchActionPerformed(evt);
            }
        });
        getContentPane().add(bsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(623, 86, 95, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter Leg Num");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 390, 104, -1));

        jButton1.setText("Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 404, 161, -1));
        getContentPane().add(TFlegnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 387, 97, -1));

        jButton2.setText("Go Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 11, 95, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Number Seats Required");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 436, 113, -1));
        getContentPane().add(TFseatsReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 433, 97, -1));

        table_fl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Leg Number", "Departure Time", "Arrival Time", "Available Seats", "Status", "Cost"
            }
        ));
        jScrollPane2.setViewportView(table_fl);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 131, 815, 233));

        getContentPane().add(CBdair, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 86, 114, -1));

        getContentPane().add(CBaair, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 86, 108, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/gettyimages-1302813215_wide-6c48e5a6aff547d2703693450c4805978de47435-s1100-c50.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, 0, 1100, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        
        CustDash CustDash= new CustDash(ac);
        CustDash.setVisible(true);
        return;
    }//GEN-LAST:event_jButton2ActionPerformed

    private synchronized void bsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsearchActionPerformed
        Flight_leg fl= new Flight_leg();
        Airplane aplane = new Airplane();
        Airport aport = new Airport();
        Airport dport = new Airport();
        aport.setName(CBaair.getSelectedItem().toString());
        dport.setName(CBdair.getSelectedItem().toString());
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();
            DefaultTableModel mod= (DefaultTableModel)table_fl.getModel();
            ResultSet myrs = stmt.executeQuery(String.format("Select * from flight_legs where arrival_airport='%s' and departure_airport='%s'",aport.get_airportnum_byName(aport.getName()),dport.get_airportnum_byName(dport.getName())));
            mod.setRowCount(0);
            while(myrs.next()){
               aplane.check_by_num(Integer.parseInt(myrs.getString("flight_num")));
                Object[] row= new Object[6];
                row[0]=myrs.getString("leg_num");
                row[1]=myrs.getString("departure_time");
                row[2]=myrs.getString("arrival_time");
                row[3]=myrs.getString("avail_seats");
                row[4]=myrs.getString("flight_status");
                row[5]=myrs.getString("cost");
                mod.addRow(row);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bsearchActionPerformed

    private synchronized void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Ticket tk = new Ticket();
       Person p= new Person();
       Flight_leg fl= new Flight_leg();
       p.get_by_uname(ac.getUsername());
       tk.setCust_num(p.getCustNum());
       tk.setLeg_num(Integer.parseInt(TFlegnum.getText()));
       tk.setseats(Integer.parseInt(TFseatsReq.getText()));
       if(fl.decrement(tk.getLeg_num(), tk.getnum_seats())==0){
           tk.setStatus("pending");
       }
       else {
           tk.setStatus("confirmed");
       }
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();               
            stmt.executeUpdate(String.format("insert into ticket(cust_num, status , leg_num, seats) values('%s','%s','%s','%s')" ,tk.getCust_num(),tk.getStatus(),tk.getLeg_num(),tk.getnum_seats()));
            JOptionPane.showMessageDialog(Book.this, "Booked");
            return;                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBaair;
    private javax.swing.JComboBox<String> CBdair;
    private javax.swing.JTextField TFlegnum;
    private javax.swing.JTextField TFseatsReq;
    private javax.swing.JButton bsearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_fl;
    // End of variables declaration//GEN-END:variables
}

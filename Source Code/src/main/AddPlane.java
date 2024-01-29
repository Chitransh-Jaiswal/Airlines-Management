
package main;

import TableClasses.Account;
import TableClasses.Airplane;
import TableClasses.ConnectionManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddPlane extends javax.swing.JFrame {

    public AddPlane() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bView = new javax.swing.JButton();
        bGet = new javax.swing.JButton();
        bUpdate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TFflightnum = new javax.swing.JTextField();
        bAdd = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TFmodel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFseats = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TFcompany = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ap = new javax.swing.JTable();
        bDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setText("AIRPLANE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 11, 105, 28));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Add");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 164, 28));

        bView.setText("View All");
        bView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bViewActionPerformed(evt);
            }
        });
        getContentPane().add(bView, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 111, -1));

        bGet.setText("Get Details");
        bGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGetActionPerformed(evt);
            }
        });
        getContentPane().add(bGet, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 99, -1));

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(bUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 393, 73, -1));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setText("Enter Flight Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 120, -1));

        TFflightnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFflightnumActionPerformed(evt);
            }
        });
        getContentPane().add(TFflightnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 98, -1));

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });
        getContentPane().add(bAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 393, 73, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setText("Update and Delete");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 164, 28));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setText("Model");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 34, -1));
        getContentPane().add(TFmodel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 128, -1));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setText("Number of Seats");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 120, -1));
        getContentPane().add(TFseats, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 128, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel7.setText("Airlines");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 65, -1));
        getContentPane().add(TFcompany, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 128, -1));

        table_ap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Number", "Model", "Company", "Number of Seats"
            }
        ));
        jScrollPane1.setViewportView(table_ap);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 84, -1, 329));

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(bDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 73, -1));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 17, 73, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plane-uk.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, 0, 1050, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TFflightnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFflightnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFflightnumActionPerformed

    private synchronized void bViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bViewActionPerformed
        Airplane ap= new Airplane();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();
            DefaultTableModel mod= (DefaultTableModel)table_ap.getModel();
            ResultSet myrs = stmt.executeQuery(String.format("Select * from airplane"));
            mod.setRowCount(0);
                while(myrs.next()){
                    ap.setFlight_num(myrs.getInt("flight_num"));
                    ap.setAirline(myrs.getString("company"));
                    ap.setMaximum_occupancy(myrs.getInt("num_seats"));
                    ap.setModel(myrs.getString("model"));                   
                    Object[] row= new Object[4];
                    row[0]=ap.getFlight_num();
                    row[1]=ap.getModel();
                    row[2]=ap.getAirline();
                    row[3]=ap.getMaximum_occupancy();
                    mod.addRow(row);                    
                }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bViewActionPerformed

    private synchronized void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        Airplane ap= new Airplane();
        ap.setAirline(TFcompany.getText());
        ap.setMaximum_occupancy(Integer.parseInt(TFseats.getText()));
        ap.setModel(TFmodel.getText());
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();            
            stmt.executeUpdate(String.format("Insert INTO Airplane(num_seats,model,company) Values ('%s' , '%s','%s') " , ap.getMaximum_occupancy() ,ap.getModel(),ap.getAirline()));
            JOptionPane.showMessageDialog(AddPlane.this, "Inserted");
            return;                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bAddActionPerformed

    private synchronized void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        Airplane ap= new Airplane();
        String flight_num = TFflightnum.getText();
        if (flight_num.length() == 0) {
        	JOptionPane.showMessageDialog(AddPlane.this, "Enter flight number to update");
        	return;
        }
        Is_number chk = new Is_number();
        if (!chk.is_num(flight_num)) {
        	JOptionPane.showMessageDialog(AddPlane.this, "Leg Number not valid");
            return;
        }
        ap.setFlight_num(Integer.parseInt(flight_num));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();               
            ap.setAirline(TFcompany.getText());
            ap.setMaximum_occupancy(Integer.parseInt(TFseats.getText()));
            ap.setModel(TFmodel.getText());
            stmt.executeUpdate(String.format("Update airplane set num_seats='%s',company='%s', model='%s' where flight_num='%s'" , ap.getMaximum_occupancy() ,ap.getAirline(),ap.getModel(),ap.getFlight_num()));
            JOptionPane.showMessageDialog(AddPlane.this, "Updated "+ap.getFlight_num() + " with the given details");
            return;                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private synchronized void bGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGetActionPerformed
        Airplane ap= new Airplane();
        Is_number chk = new Is_number();
        String flight_num = TFflightnum.getText();
        if (!chk.is_num(flight_num)) {
        	JOptionPane.showMessageDialog(AddPlane.this, "Flight Number not valid");
            return;
        }
        ap.setFlight_num(Integer.parseInt(flight_num));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();               
            ResultSet myrs = stmt.executeQuery(String.format("Select * from airplane where flight_num='%s'",ap.getFlight_num()));
            if(myrs.next()){
                ap.setAirline(myrs.getString("company"));
                ap.setMaximum_occupancy(myrs.getInt("num_seats"));
                ap.setModel(myrs.getString("model"));
                TFcompany.setText(ap.getAirline());
                TFmodel.setText(ap.getModel());
                TFseats.setText(Integer.toString(ap.getMaximum_occupancy()));
                    
                return; 
                
            }
            JOptionPane.showMessageDialog(AddPlane.this, "Enter Valid Number");
                return;
                
           
                                   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bGetActionPerformed

    private synchronized void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        Airplane ap= new Airplane();
        String flight_num = TFflightnum.getText();
        Is_number chk = new Is_number();
        if (!chk.is_num(flight_num)) {
        	JOptionPane.showMessageDialog(AddPlane.this, "Flight Number not valid");
            return;
        }
        ap.setFlight_num(Integer.parseInt(flight_num));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();               
            stmt.executeUpdate(String.format("delete from airplane where flight_num='%s'" ,ap.getFlight_num()));
            JOptionPane.showMessageDialog(AddPlane.this, "Deleted "+ap.getFlight_num());
            return;                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();       
        AdminDash ad= new AdminDash();
        ad.setVisible(true);
        return;
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddPlane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFcompany;
    private javax.swing.JTextField TFflightnum;
    private javax.swing.JTextField TFmodel;
    private javax.swing.JTextField TFseats;
    private javax.swing.JButton bAdd;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bGet;
    private javax.swing.JButton bUpdate;
    private javax.swing.JButton bView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_ap;
    // End of variables declaration//GEN-END:variables
}


package main;

import TableClasses.Account;
import TableClasses.ConnectionManager;
import TableClasses.Person;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.awt.event.*;
import java.awt.*;


public class Details extends javax.swing.JFrame {

    Account ac;
    Person per= new Person();
    public Details() {
        initComponents();
    }
    public Details(Account nac) {
        initComponents();
        ac=nac;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TFusername = new javax.swing.JTextField();
        TFemail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFdob = new javax.swing.JTextField();
        TFname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TFpassport = new javax.swing.JTextField();
        bget = new javax.swing.JButton();
        RBmale = new javax.swing.JRadioButton();
        RBfemale = new javax.swing.JRadioButton();
        bSave = new javax.swing.JButton();
        Bback = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 55, 107, -1));

        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 86, 107, -1));

        TFusername.setEditable(false);
        TFusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFusernameActionPerformed(evt);
            }
        });
        getContentPane().add(TFusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 52, 144, -1));
        getContentPane().add(TFemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 114, 144, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("Details");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 11, 80, 39));
        getContentPane().add(TFdob, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 182, 144, -1));
        getContentPane().add(TFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 83, 144, -1));

        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Email");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 114, 107, -1));

        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 145, 107, -1));

        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("DOB");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 185, 107, -1));

        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("Passport Number");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 223, 107, -1));
        getContentPane().add(TFpassport, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 220, 144, -1));

        bget.setText("GET DETAILS");
        bget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bgetActionPerformed(evt);
            }
        });
        getContentPane().add(bget, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 268, 125, -1));

        buttonGroup1.add(RBmale);
        RBmale.setText("Male");
        RBmale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBmaleActionPerformed(evt);
            }
        });
        getContentPane().add(RBmale, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 141, 64, -1));

        buttonGroup1.add(RBfemale);
        RBfemale.setText("Female");
        getContentPane().add(RBfemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(281, 141, 76, -1));

        bSave.setText("SAVE");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        getContentPane().add(bSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 268, 125, -1));

        Bback.setText("Go Back");
        Bback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbackActionPerformed(evt);
            }
        });
        getContentPane().add(Bback, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 90, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/clientservice.jpg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-490, 0, 930, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TFusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFusernameActionPerformed

    }//GEN-LAST:event_TFusernameActionPerformed

    private void bgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bgetActionPerformed
        TFusername.setText(ac.getUsername());
        Person per= new Person();
        per.setUsername(ac.getUsername());
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();			
            ResultSet myrs = stmt.executeQuery(String.format("SELECT * FROM Customer where username = '%s' " , per.getUsername() ));
			
            if (myrs.next())
            {
				per.setName(myrs.getString("name"));
				per.setEmail(myrs.getString("email"));
				per.setGender(myrs.getString("gender"));
				per.setPassportNumber(myrs.getString("passport_number"));
				per.setDate_of_Birth(myrs.getString("Date_of_birth"));
                TFdob.setText(per.getDate_of_Birth());
                TFname.setText(per.getName());
                TFemail.setText(per.getEmail());
                TFpassport.setText(per.getPassportNumber());
                if(per.getGender()!=null){
                    if(per.getGender().equals("M")){
                        RBmale.setSelected(true);
                    }
                    if(per.getGender().equals("F")){
                        RBfemale.setSelected(true);
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(Details.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Details.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_bgetActionPerformed

    private void RBmaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBmaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBmaleActionPerformed

    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        
        per.setUsername(TFusername.getText().trim());
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();
            
            per.setName(TFname.getText().trim());
            per.setEmail(TFemail.getText().trim());
            per.setDate_of_Birth(TFdob.getText().trim());
            
            per.setPassportNumber(TFpassport.getText().trim());
            if(RBfemale.isSelected()){
                per.setGender("F");
            }
            else if(RBmale.isSelected()){
                per.setGender("M");
            }
            else{
                JOptionPane.showMessageDialog(Details.this, "Please Select Gender");
                return;
            }

            if (per.getName().length() == 0 ) {
            	JOptionPane.showMessageDialog(Details.this, "Name field cannot be empty");
            	return;
            }
            if (per.getEmail().length() == 0 ) {
            	JOptionPane.showMessageDialog(Details.this, "Email field cannot be empty");
            	return;
            }
            String dob = per.getDate_of_Birth();
            

            Date_checker check = new Date_checker();
            if (check.date_checker(dob) == false) {
            	JOptionPane.showMessageDialog(Details.this, "Enter date in the valid format (yyyy-mm-dd)");
            	return;
            }
            
            stmt.executeUpdate(String.format("UPDATE Customer SET Name = '%s', Email = '%s', Gender = '%s', Date_of_birth = '%s', passport_number = '%s' WHERE Username= '%s' " , per.getName() , per.getEmail() , per.getGender() , per.getDate_of_Birth() , per.getPassportNumber() , per.getUsername()));
            JOptionPane.showMessageDialog(Details.this, "Details saved");
            return;
            
        } catch (SQLException ex) {
            Logger.getLogger(Details.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Details.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }//GEN-LAST:event_bSaveActionPerformed

    private void BbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbackActionPerformed
        dispose();
        
        CustDash CustDash= new CustDash(ac);
        CustDash.setVisible(true);
        return;
    }//GEN-LAST:event_BbackActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bback;
    private javax.swing.JRadioButton RBfemale;
    private javax.swing.JRadioButton RBmale;
    private javax.swing.JTextField TFdob;
    private javax.swing.JTextField TFemail;
    private javax.swing.JTextField TFname;
    private javax.swing.JTextField TFpassport;
    private javax.swing.JTextField TFusername;
    private javax.swing.JButton bSave;
    private javax.swing.JButton bget;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}

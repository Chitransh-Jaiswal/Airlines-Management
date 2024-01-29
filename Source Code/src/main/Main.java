package main;


import TableClasses.Account;
import TableClasses.ConnectionManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.awt.event.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main extends javax.swing.JFrame {

    
    public Main() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bLogin = new javax.swing.JButton();
        TFusername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFpassword = new javax.swing.JPasswordField();
        bRegister = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 98, 107, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 161, 107, -1));

        bLogin.setText("LOGIN");
        bLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLoginActionPerformed(evt);
            }
        });
        getContentPane().add(bLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 125, -1));

        TFusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFusernameActionPerformed(evt);
            }
        });
        getContentPane().add(TFusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 95, 144, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 153));
        jLabel3.setText("LOGIN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 80, 39));

        TFpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(TFpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 158, 144, -1));

        bRegister.setText("REGISTER");
        bRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(bRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, 125, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/gettyimages-1302813215_wide-6c48e5a6aff547d2703693450c4805978de47435-s1100-c50.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-670, -40, 1100, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TFusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFusernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFusernameActionPerformed

    
    private void bLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLoginActionPerformed
        if(TFusername.getText().trim().isEmpty() ||TFpassword.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(Main.this, "Please Fill all Fields");
            return;
        }
        Account hooman= new Account();
        hooman.setUsername(TFusername.getText().trim());
        hooman.setPassword(TFpassword.getText().trim());
        
        try {
            Connection mycon = null;
            Statement stmt = null;
            ResultSet myrs = null;           
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            stmt = mycon.createStatement();
            myrs = stmt.executeQuery(String.format("Select * from Logins WHERE Username = '%s' AND Password = '%s' " , hooman.getUsername() ,hooman.getPassword()));
            if (myrs.next()) {
                hooman.setType(myrs.getString("type"));
                if(hooman.getType().equals("cust")){
                    CustDash CustDash= new CustDash(hooman);
                    CustDash.setVisible(true);
                    dispose();
                    return;
                }
                else if(hooman.getType().equals("admin")){
                    AdminDash dash= new AdminDash(hooman);
                    dash.setVisible(true);
                    dispose();
                    return;
                }
            }
            myrs = stmt.executeQuery(String.format("Select * from Logins WHERE Username = '%s'" , hooman.getUsername()));
            if (myrs.next()) {
                JOptionPane.showMessageDialog(Main.this, "Incorrect Password");
                return;
            }
            else {
                JOptionPane.showMessageDialog(Main.this, "No user exists");
                return;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_bLoginActionPerformed

    private void TFpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFpasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFpasswordActionPerformed

    private void bRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegisterActionPerformed
        if(TFusername.getText().trim().isEmpty() ||TFpassword.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(Main.this, "Please Fill all Fields");
            return;
        }
        Account hooman= new Account();
        hooman.setUsername(TFusername.getText().trim());
        hooman.setPassword(TFpassword.getText().trim());
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();
            
            ResultSet myrs = stmt.executeQuery(String.format("Select * from Logins WHERE Username = '%s'" , hooman.getUsername()));
            if (myrs.next()) {
                JOptionPane.showMessageDialog(Main.this, "Username Taken");
                return;
            }
            else{
                String a = hooman.getUsername();
                String b = hooman.getPassword();
                String regex = "(.)*(\\d)(.)*";      
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(b);
                boolean isMatched = matcher.matches();
                if(b.length()<8||isMatched==false)
                {JOptionPane.showMessageDialog(Main.this,"Password should be 8 character long\nPassword Should Contain atleast 1 Digit");return;}
                stmt.executeUpdate(String.format("Insert INTO Logins Values ('%s' , '%s','cust') " , a , b));
                JOptionPane.showMessageDialog(Main.this, "New user created");
                dispose();
                CustDash CustDash= new CustDash(hooman);
                CustDash.setVisible(true);
                return;
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bRegisterActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TFpassword;
    private javax.swing.JTextField TFusername;
    private javax.swing.JButton bLogin;
    private javax.swing.JButton bRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
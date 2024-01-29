package main;
import TableClasses.Account;
import TableClasses.Airplane;
import TableClasses.Airport;
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
public class AddAirport extends javax.swing.JFrame {

    public AddAirport() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        bView = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ap = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        bGet = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TFnum = new javax.swing.JTextField();
        TFlocation = new javax.swing.JTextField();
        bUpdate = new javax.swing.JButton();
        bAdd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TFname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calisto MT", 1, 18)); // NOI18N
        jLabel1.setText("AIRPORT");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 17, 105, 28));

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 23, 73, -1));

        bView.setText("View All");
        bView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bViewActionPerformed(evt);
            }
        });
        getContentPane().add(bView, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 50, 111, -1));

        table_ap.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airport Number", "Name", "Location"
            }
        ));
        jScrollPane1.setViewportView(table_ap);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(498, 86, 383, 318));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel4.setText("Update and Delete");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 164, 28));

        bGet.setText("Get Details");
        bGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGetActionPerformed(evt);
            }
        });
        getContentPane().add(bGet, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 99, -1));

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(bDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, 73, -1));

        jLabel2.setText("Enter Port Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 120, -1));

        TFnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnumActionPerformed(evt);
            }
        });
        getContentPane().add(TFnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 115, -1));
        getContentPane().add(TFlocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 128, -1));

        bUpdate.setText("Update");
        bUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(bUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 73, -1));

        bAdd.setText("Add");
        bAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddActionPerformed(evt);
            }
        });
        getContentPane().add(bAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 73, -1));

        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 34, -1));
        getContentPane().add(TFname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 128, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Add");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 164, 28));

        jLabel7.setText("Location");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 65, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/plane-uk.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 1010, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
        AdminDash ad= new AdminDash();
        ad.setVisible(true);
        return;
    }//GEN-LAST:event_jButton1ActionPerformed

    private synchronized void bViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bViewActionPerformed
        Airport ap= new Airport();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();
            DefaultTableModel mod= (DefaultTableModel)table_ap.getModel();
            ResultSet myrs = stmt.executeQuery(String.format("Select * from airport"));
            mod.setRowCount(0);
            while(myrs.next()){
                ap.setName(myrs.getString("name"));
                ap.setAirport_num(myrs.getInt("airport_num"));
                ap.setLocation(myrs.getString("location"));
                
                Object[] row= new Object[3];
                row[0]=ap.getAirport_num();
                row[1]=ap.getName();
                row[2]=ap.getLocation();
                
                mod.addRow(row);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bViewActionPerformed

    private synchronized void bGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGetActionPerformed
        Airport ap= new Airport();
        ap.setAirport_num(Integer.parseInt(TFnum.getText()));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();
            ResultSet myrs = stmt.executeQuery(String.format("Select * from airport where airport_num='%s'",ap.getAirport_num()));
            if(myrs.next()){
                ap.setName(myrs.getString("name"));
            ap.setLocation(myrs.getString("location"));
            TFlocation.setText(ap.getLocation());
            TFname.setText(ap.getName());
            return;
                
            }

            JOptionPane.showMessageDialog(AddAirport.this, "Enter Valid Number");
                return;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bGetActionPerformed

    private synchronized void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        Airport ap= new Airport();
        ap.setAirport_num(Integer.parseInt(TFnum.getText()));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();
            stmt.executeUpdate(String.format("delete from airport where airport_num='%s'" ,ap.getAirport_num()));
            JOptionPane.showMessageDialog(AddAirport.this, "Deleted");
            return;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void TFnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnumActionPerformed

    }//GEN-LAST:event_TFnumActionPerformed

    private synchronized void bUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateActionPerformed
        Airport ap= new Airport();
        ap.setAirport_num(Integer.parseInt(TFnum.getText()));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();
            ap.setLocation(TFlocation.getText());
            ap.setName(TFname.getText());
            stmt.executeUpdate(String.format("Update airport set name='%s',location='%s' where airport_num='%s'" , ap.getName(),ap.getLocation(),ap.getAirport_num()));
            JOptionPane.showMessageDialog(AddAirport.this, "Updated");
            return;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bUpdateActionPerformed

    private synchronized void bAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddActionPerformed
        Airport ap= new Airport();
        ap.setLocation(TFlocation.getText());
        ap.setName(TFname.getText());
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();
            ResultSet myrs = stmt.executeQuery(String.format("Select * from airport where name='%s' and location='%s'",ap.getName(),ap.getLocation()));
            if(myrs.next()){
                JOptionPane.showMessageDialog(AddAirport.this, "Airport Already Exists");
                return;
            }
            stmt.executeUpdate(String.format("Insert INTO Airport(location,name) Values ('%s' ,'%s') " , ap.getLocation(),ap.getName()));
            JOptionPane.showMessageDialog(AddAirport.this, "Inserted");
            return;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bAddActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAirport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFlocation;
    private javax.swing.JTextField TFname;
    private javax.swing.JTextField TFnum;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_ap;
    // End of variables declaration//GEN-END:variables
}

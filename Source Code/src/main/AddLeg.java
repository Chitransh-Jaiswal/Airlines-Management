
package main;

import TableClasses.Airplane;
import TableClasses.Airport;
import TableClasses.ConnectionManager;
import TableClasses.Flight_leg;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class AddLeg extends javax.swing.JFrame {

 
    public AddLeg() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        table_fl = new javax.swing.JTable();
        Bview = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TFlegnum = new javax.swing.JTextField();
        bdelete = new javax.swing.JButton();
        bfetch = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TFflightnum = new javax.swing.JTextField();
        TFdtime = new javax.swing.JTextField();
        TFatime = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TFdist = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        CBstats = new javax.swing.JComboBox<>();
        badd = new javax.swing.JButton();
        bupdate = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        TFcost = new javax.swing.JTextField();
        CBdair = new javax.swing.JComboBox<>();
        CBaair = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setText("Flight Segment");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 220, 43));

        table_fl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Leg Number", "Flight Number", "Departure", "Arrival", "Departure Time", "Arrival Time", "Available Seats", "Status", "Cost", "Distance"
            }
        ));
        jScrollPane1.setViewportView(table_fl);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 115, 1023, 186));

        Bview.setText("View All");
        Bview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BviewActionPerformed(evt);
            }
        });
        getContentPane().add(Bview, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 65, 92, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel2.setText("Segment Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 341, 110, -1));

        TFlegnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFlegnumActionPerformed(evt);
            }
        });
        getContentPane().add(TFlegnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 338, 162, -1));

        bdelete.setText("Delete");
        bdelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdeleteActionPerformed(evt);
            }
        });
        getContentPane().add(bdelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(674, 337, 73, -1));

        bfetch.setText("Fetch Details");
        bfetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfetchActionPerformed(evt);
            }
        });
        getContentPane().add(bfetch, new org.netbeans.lib.awtextra.AbsoluteConstraints(561, 337, -1, -1));

        jButton4.setText("Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 92, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel4.setText("Departure Airport");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 453, 100, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel5.setText("Flight Number");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 418, 90, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel6.setText("Arrival Airport");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 497, 90, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel7.setText("Departure Time");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 457, 100, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel8.setText("Arrival Time");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 497, 100, -1));

        TFflightnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFflightnumActionPerformed(evt);
            }
        });
        getContentPane().add(TFflightnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 415, 162, -1));

        TFdtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdtimeActionPerformed(evt);
            }
        });
        getContentPane().add(TFdtime, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 454, 162, -1));

        TFatime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFatimeActionPerformed(evt);
            }
        });
        getContentPane().add(TFatime, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 494, 162, -1));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 567, 88, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel10.setText("Distance");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 539, 100, -1));

        TFdist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFdistActionPerformed(evt);
            }
        });
        getContentPane().add(TFdist, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 536, 162, -1));

        jLabel11.setText("Status");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 588, 88, -1));

        CBstats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ACTIVE", "SCHEDULED", "DELAYED", "DEPARTED", "LANDED", "IN_AIR", "ARRIVED", "CANCELLED", "DIVERTED", "UNKNOWN" }));
        getContentPane().add(CBstats, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 585, 162, -1));

        badd.setText("Add");
        badd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baddActionPerformed(evt);
            }
        });
        getContentPane().add(badd, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 623, 73, -1));

        bupdate.setText("Update");
        bupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bupdateActionPerformed(evt);
            }
        });
        getContentPane().add(bupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 623, 86, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        jLabel12.setText("Cost");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 539, 100, -1));

        TFcost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFcostActionPerformed(evt);
            }
        });
        getContentPane().add(TFcost, new org.netbeans.lib.awtextra.AbsoluteConstraints(652, 536, 162, -1));

        CBdair.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBdairItemStateChanged(evt);
            }
        });
        CBdair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBdairActionPerformed(evt);
            }
        });
        getContentPane().add(CBdair, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 453, 162, -1));

        getContentPane().add(CBaair, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 493, 162, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/924822-910140-aircraft-1.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1040, 710));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BviewActionPerformed
        Flight_leg fl= new Flight_leg();
        Airplane aplane = new Airplane();
        Airport aport = new Airport();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();
            DefaultTableModel mod= (DefaultTableModel)table_fl.getModel();
            ResultSet myrs = stmt.executeQuery(String.format("Select * from flight_legs"));
            mod.setRowCount(0);
            while(myrs.next()){
               aplane.check_by_num(Integer.parseInt(myrs.getString("flight_num")));
                Object[] row= new Object[10];
                row[0]=myrs.getString("leg_num");
                row[1]=myrs.getString("flight_num");
                row[2]=aport.get_airportLoc_byNum(myrs.getInt("departure_airport"));
                row[3]=aport.get_airportLoc_byNum(myrs.getInt("arrival_airport"));;
                row[4]=myrs.getString("departure_time");
                row[5]=myrs.getString("arrival_time");
                row[6]=myrs.getString("avail_seats");
                row[7]=myrs.getString("flight_status");
                row[8]=myrs.getString("cost");
                row[9]=myrs.getString("distance");
                mod.addRow(row);
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BviewActionPerformed

    private void TFlegnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFlegnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFlegnumActionPerformed

    private void bdeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdeleteActionPerformed
        Flight_leg fl= new Flight_leg();
        String leg = TFlegnum.getText().trim();
        if (leg.length() == 0) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Enter Valid Leg Number");
        	return;
        }
        Is_number chk = new Is_number();
        if (!chk.is_num(leg)) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Leg Number not valid");
            return;
        }
        fl.setleg_num(Integer.parseInt(leg));
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();               
            stmt.executeUpdate(String.format("delete from flight_legs where leg_num='%s'" ,fl.getleg_num()));
            JOptionPane.showMessageDialog(AddLeg.this, "Deleted. Refresh to view the changes");
            return;                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bdeleteActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
        AdminDash ad= new AdminDash();
        ad.setVisible(true);
        return;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void TFflightnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFflightnumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFflightnumActionPerformed

    private void TFdtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFdtimeActionPerformed

    private void TFatimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFatimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFatimeActionPerformed

    private void TFdistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFdistActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFdistActionPerformed

    private synchronized void bfetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfetchActionPerformed
        Flight_leg fl= new Flight_leg();
        Airplane aplane = new Airplane();
        Airport aport = new Airport();
        String leg = TFlegnum.getText().trim();
        Is_number chk = new Is_number();
        if (leg.length() == 0) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Enter Valid Leg Number");
        	return;
        }
        if (!chk.is_num(leg)) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Leg Number not valid");
            return;
        }
        fl.setleg_num(Integer.parseInt(leg));
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();
            ResultSet myrs = stmt.executeQuery(String.format("Select * from flight_legs where leg_num='%s'",fl.getleg_num()));
            if(myrs.next()){
                //TFaair.setText(aport.get_airportLoc_byNum(myrs.getInt("arrival_airport")));
                TFatime.setText(myrs.getString("arrival_time"));
                //TFdair.setText(aport.get_airportLoc_byNum(myrs.getInt("departure_airport")));
                TFdist.setText(myrs.getString("distance"));
                TFdtime.setText(myrs.getString("departure_time"));
                TFflightnum.setText(myrs.getString("flight_num"));
                TFcost.setText(myrs.getString("cost"));
                CBstats.setSelectedItem(myrs.getString("flight_status"));
                CBaair.setSelectedItem(aport.get_airportLoc_byNum(myrs.getInt("arrival_airport")));
                CBdair.setSelectedItem(aport.get_airportLoc_byNum(myrs.getInt("departure_airport")));
                return;
                
            }
            JOptionPane.showMessageDialog(AddLeg.this, "Enter Valid Number");
                return;

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bfetchActionPerformed
    
    
    
    private Boolean lies_between(String StartA , String EndA , String StartB , String EndB) {
    	
    	if ((StartA.compareTo(StartB) > 0 ? StartA: StartB).compareTo((EndA.compareTo(EndB) < 0? EndA: EndB)) <= 0)return true;
    	return false;
    }
    
    private Boolean duplicate_flights(Flight_leg fl) {
    	String [] status = {"ACTIVE" , "SCHEDULED" , "DELAYED" , "DEPARTED" , "IN_AIR"};
    	int flag = 0;
    	for (String stat : status) {
    		if (fl.Flight_status == stat) {
    			flag = 1;
    			break;
    		}
    	}
    	if (flag == 0) {
    		return false;
    	}
    	try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();
            ResultSet myrs = stmt.executeQuery(String.format("Select arrival_time , departure_time  from(Select arrival_time , departure_time , flight_status from Flight_legs where flight_num = %d) as fl where flight_status in ('ACTIVE' , 'SCHEDULED' , \"DELAYED\" , \"DEPARTED\" , \"IN_AIR\") ;"  , fl.flightNumber )) ;
            flag = 0;
            while(myrs.next()) {
            	String arrival = myrs.getString("arrival_time") ;
            	String depart = myrs.getString("departure_time");
            	if (flag == 0 && arrival.equals(fl.arrival_time) && depart.equals(fl.departure_time)) {
            		flag = 1;
            		continue;
            	}
            	System.out.printf("%s %s %s %s\n" , fl.arrival_time , fl.departure_time , arrival , depart);
            	if (lies_between(fl.departure_time , fl.arrival_time , depart , arrival) ) {
            		return true;
            	}
            }
            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    	return true;
    }
    
    
    
    private synchronized void baddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baddActionPerformed
        Flight_leg fl= new Flight_leg();
        Airplane aplane = new Airplane();
        Airport aport = new Airport();
        Is_number chk = new Is_number();
        String fl_num = TFflightnum.getText().trim();
        if (!chk.is_num(fl_num)) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Check Airplane number");
        	return;
        }
        fl.setFlightNumber(Integer.parseInt(fl_num));
        if(!aplane.check_by_num(fl.getFlightNumber()) ){
            JOptionPane.showMessageDialog(AddLeg.this, "No plane found");
        }
        fl.setArrival(aport.get_airportnum_byName(CBaair.getSelectedItem().toString()));
        fl.setDeparture(aport.get_airportnum_byName(CBdair.getSelectedItem().toString()));
        fl.setArrival_time(TFatime.getText().trim());
        fl.setDeparture_time(TFdtime.getText().trim());
        
        String cost = TFcost.getText().trim();
        if (!chk.is_num(cost)) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Check the Cost field");
            return;
        }
        fl.setcost(Integer.parseInt(cost));
        String dist = TFdist.getText().trim();
        dist.replaceAll("\\s", "");
        if (!chk.is_num(dist)) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Check the Distance field");
            return;
        }
        fl.setDistance(Integer.parseInt(dist));
        fl.setFlight_status(CBstats.getSelectedItem().toString());
        if(fl.getArrival()==-1|| fl.getDeparture()==-1){
            JOptionPane.showMessageDialog(AddLeg.this, "No Airports found");
            return;
        }
        if (fl.arrival == fl.departure) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Arrival and Departure airports must be different");
            return;
        }
        Date_checker chck = new Date_checker();
        time_check check = new time_check();
        if ((fl.arrival_time.length() != 19 || fl.departure_time.length() != 19 )) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Time must be in the format (YYYY-MM-DD HH:MI:SS) and must be a valid date");
        	return;
        }
        System.out.println(fl.arrival_time);
        System.out.println(fl.departure_time);
    
        if ( (chck.date_checker(fl.arrival_time.substring(0 , 10)) != true || chck.date_checker(fl.departure_time.substring(0 , 10)) != true || check.time_check(fl.arrival_time.substring(11 , 19)) != true || check.time_check(fl.departure_time.substring(11 , 19)) != true ) ) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Time Must be in the format (YYYY-MM-DD HH:MI:SS) and must be a valid date");
        	return;
        }
        
        if (fl.arrival_time.compareTo(fl.departure_time) <= 0){
        	JOptionPane.showMessageDialog(AddLeg.this, "Arrival time must be greater than the departure time");
        	return;
        }
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();               
            stmt.executeUpdate(String.format("insert into flight_legs(flight_num, Arrival_Airport, departure_airport, flight_status,distance, arrival_time , departure_time, avail_seats,cost) values('%s','%s','%s','%s','%s','%s','%s','%s','%s')" ,fl.getFlightNumber(),fl.getArrival(),fl.getDeparture(),fl.getFlight_status(),fl.getDistance(),fl.getArrival_time(),fl.getDeparture_time(),aplane.getMaximum_occupancy(),fl.getcost()));
            JOptionPane.showMessageDialog(AddLeg.this, "Added");
            if (duplicate_flights(fl) == true){
            	JOptionPane.showMessageDialog(AddLeg.this, "There are two or more flight legs for the same flight during the same time interval.Delete one of them");
            	return;
            }
            return;                    
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_baddActionPerformed

    private synchronized void bupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bupdateActionPerformed
        Flight_leg fl= new Flight_leg();
        Airplane aplane = new Airplane();
        Airport aport = new Airport();
        Is_number chk = new Is_number();
        String leg_num = TFlegnum.getText().trim();
        if (!chk.is_num(leg_num)) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Leg Number not valid");
            return;
        }
        fl.setleg_num(Integer.parseInt(leg_num));
        String fligt_num = TFflightnum.getText().trim();
        if (!chk.is_num(fligt_num)) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Flight Number not valid");
            return;
        }
        fl.setFlightNumber(Integer.parseInt(fligt_num));
        if(!aplane.check_by_num(fl.getFlightNumber())){
            JOptionPane.showMessageDialog(AddLeg.this, "No plane found");
            return;
        }
        
        fl.setArrival(aport.get_airportnum_byName(CBaair.getSelectedItem().toString()));
        fl.setDeparture(aport.get_airportnum_byName(CBdair.getSelectedItem().toString()));
        fl.setArrival_time(TFatime.getText().trim());
        fl.setDeparture_time(TFdtime.getText().trim());
        String cost = TFcost.getText().trim();
        if (!chk.is_num(cost)) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Cost not valid");
            return;
        }
        fl.setcost(Integer.parseInt(cost));
        String dist = TFdist.getText().trim();
        if (!chk.is_num(dist)) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Distance not valid");
            return;
        }
        fl.setDistance(Integer.parseInt(dist));
        fl.setFlight_status(CBstats.getSelectedItem().toString());
        if(fl.getArrival()==-1|| fl.getDeparture()==-1){
            JOptionPane.showMessageDialog(AddLeg.this, "No Airports found");
            return;
        }
        if (fl.arrival == fl.departure) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Arrival and Departure airports must be different");
            return;
        }
        Date_checker chck = new Date_checker();
        time_check check = new time_check();
        if ((fl.arrival_time.length() != 19 || fl.departure_time.length() != 19 )) 
        {
        	JOptionPane.showMessageDialog(AddLeg.this, "Time must be in the format (YYYY-MM-DD HH:MI:SS)");
        	return;
        }
        if ((chck.date_checker(fl.arrival_time.substring(0 , 10)) != true || chck.date_checker(fl.departure_time.substring(0 , 10)) != true || check.time_check(fl.arrival_time.substring(11 , 19)) != true || check.time_check(fl.departure_time.substring(11 , 19)) != true ) ) {
        	JOptionPane.showMessageDialog(AddLeg.this, "Time must be in the format (YYYY-MM-DD HH:MI:SS)");
        	return;
        }
        
        	
        
        if (fl.arrival_time.compareTo(fl.departure_time) <= 0){
        	JOptionPane.showMessageDialog(AddLeg.this, "Arrival time must be greater than departure time");
        	return;
        }
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            ConnectionManager cm= new ConnectionManager();
            Connection mycon= DriverManager.getConnection(cm.getUrl(), cm.getU(), cm.getP());
            Statement stmt = mycon.createStatement();               
            stmt.executeUpdate(String.format("update flight_legs set flight_num='%s', Arrival_Airport='%s', departure_airport='%s', flight_status='%s',distance='%s', arrival_time='%s' , departure_time='%s', avail_seats='%s',cost='%s' where leg_num='%s'" ,fl.getFlightNumber(),fl.getArrival(),fl.getDeparture(),fl.getFlight_status(),fl.getDistance(),fl.getArrival_time(),fl.getDeparture_time(),aplane.getMaximum_occupancy(),fl.getcost(),fl.getleg_num()));
            JOptionPane.showMessageDialog(AddLeg.this, "Updated");
            if (duplicate_flights(fl) == true) {
            	JOptionPane.showMessageDialog(AddLeg.this, "There are two or more flight legs for the same flight during the same time interval.Delete one of them");
            	return;
            }
            return;                        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bupdateActionPerformed

    private void TFcostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFcostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFcostActionPerformed

    private void CBdairItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBdairItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CBdairItemStateChanged

    private void CBdairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBdairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBdairActionPerformed

  
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddLeg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bview;
    private javax.swing.JComboBox<String> CBaair;
    private javax.swing.JComboBox<String> CBdair;
    private javax.swing.JComboBox<String> CBstats;
    private javax.swing.JTextField TFatime;
    private javax.swing.JTextField TFcost;
    private javax.swing.JTextField TFdist;
    private javax.swing.JTextField TFdtime;
    private javax.swing.JTextField TFflightnum;
    private javax.swing.JTextField TFlegnum;
    private javax.swing.JButton badd;
    private javax.swing.JButton bdelete;
    private javax.swing.JButton bfetch;
    private javax.swing.JButton bupdate;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_fl;
    // End of variables declaration//GEN-END:variables
}

package View;
import Model.*;
import Controller.*;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class VRoomReservation extends javax.swing.JFrame {

    private MRoomReservation MReservation;
    public VRoomReservation() {
        initComponents();
        MReservation = new MRoomReservation();
        sp_nights.addChangeListener((javax.swing.event.ChangeEvent evt) -> {
            calculateTotal();
        });
        autoID() ;
        loadReservation();
        
       
    }
    private void autoID() 
    { 
        String reservation_no =  MReservation.generateReservationNo(); txt_reservation_no.setText( reservation_no); 
    }
    
    private void loadReservation()
    {
        DefaultTableModel MGuestTable = (DefaultTableModel) table_reservations.getModel(); 
        MReservation.loadReservation(MGuestTable);
    }
    
    public void calculateTotal() {
    try {
        // Create a controller instance
        CRoomReservation controller = new CRoomReservation();
        
        // Retrieve the room price from the text field
        double price = Double.parseDouble(txt_room_price.getText());
        
        // Retrieve the number of nights from the spinner
        int nights = (int) sp_nights.getValue();
        
        // Calculate total using the controller
        double total = controller.calculateTotal(price, nights);
        
        // Display the total cost in the total text field
        txt_total_amount.setText(String.format("%.2f", total));
    } catch (NumberFormatException e) {
        txt_total_amount.setText("Invalid input"); // Handle invalid number format
    } catch (Exception e) {
        txt_total_amount.setText("Error calculating total"); // Handle any other exceptions
    }
    
    
    
    
}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_room_type = new javax.swing.JTextField();
        txt_room_price = new javax.swing.JTextField();
        dc_check_in_date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        dc_check_out_date = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        txt_total_amount = new javax.swing.JTextField();
        sp_nights = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_guest_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_reservations = new javax.swing.JTable();
        btn_search = new javax.swing.JButton();
        btn_confirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        txt_guest_name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cmb_payment_method = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_reservation_no = new javax.swing.JTextField();
        txt_room_no = new javax.swing.JTextField();
        btn_search1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel5.setText("Room Price");

        jLabel6.setText("Room Type");

        jLabel7.setText("Check Out Date ");

        jLabel8.setText("Total Amount");

        jLabel9.setText("Nights");

        jLabel1.setText("Enter Guest ID");

        table_reservations.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation No", "Guest ID", "Room No", "Check In Date", "Check Out Date", "Nights", "Total Amount", "Payment Method"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_reservations);

        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_confirm.setText("Confirm");
        btn_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmActionPerformed(evt);
            }
        });

        jLabel2.setText("Guest Name ");

        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jLabel10.setText("ROOM RESERVATION");

        jLabel11.setText("Payment Method");

        cmb_payment_method.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "Card" }));

        jLabel3.setText("Select Room No");

        jLabel4.setText("Check In Date ");

        jLabel12.setText("Reservation No");

        btn_search1.setText("Search");
        btn_search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_search1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(273, 273, 273))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_guest_id)
                                    .addComponent(txt_guest_name)
                                    .addComponent(dc_check_in_date, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dc_check_out_date, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_reservation_no, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(sp_nights, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_confirm))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txt_room_price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(txt_room_type, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(btn_cancel))
                                    .addComponent(cmb_payment_method, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_room_no, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_total_amount))
                                .addGap(18, 18, 18)
                                .addComponent(btn_search1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel10)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_guest_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search)
                    .addComponent(jLabel3)
                    .addComponent(txt_room_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search1))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_guest_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txt_room_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_room_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jLabel4))
                    .addComponent(dc_check_in_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(dc_check_out_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txt_total_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sp_nights, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(cmb_payment_method, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_confirm)
                            .addComponent(btn_cancel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_reservation_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
       
        String guest_id = txt_guest_id.getText(); 
        ResultSet rs = MReservation.searchGuestByID(guest_id);
        try 
        { 
            if (rs.next()) 
            { 
                txt_guest_name.setText(rs.getString("first_name"));
                
            } else 
            { 
                JOptionPane.showMessageDialog(this, "Guest not found!"); 
            }
        } catch (Exception e) 
        { 
            System.err.println(e.getMessage()); 
        }
        
        
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmActionPerformed
       
    try {
        // Retrieve input values
        String reservation_no = txt_reservation_no.getText();
        String guest_id = txt_guest_id.getText();
        String room_no = txt_room_no.getText();
        SimpleDateFormat date_format = new SimpleDateFormat("yyyy-MM-dd");
        String check_in_date = date_format.format(dc_check_in_date.getDate());
        SimpleDateFormat date_format1 = new SimpleDateFormat("yyyy-MM-dd");
        String check_out_date = date_format1.format(dc_check_out_date.getDate());
        int nights = (int) sp_nights.getValue();
        double total_amount = Double.parseDouble(txt_total_amount.getText());
        String payment_method = (String) cmb_payment_method.getSelectedItem();

        // Validate input values
        if (reservation_no.isEmpty() || guest_id.isEmpty() || room_no.isEmpty() || check_in_date == null || check_out_date == null || nights <= 0 || total_amount <= 0 || payment_method.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields correctly", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Call the ReserveRoom method
        MReservation.ReserveRoom(reservation_no, guest_id, room_no, check_in_date, check_out_date, nights, total_amount, payment_method);

        // Show success message
        JOptionPane.showMessageDialog(this, "Room reservation successful", "Success", JOptionPane.INFORMATION_MESSAGE);
        
       txt_reservation_no.setText("");
       txt_guest_id.setText("");
       txt_guest_name.setText("");
       txt_room_price.setText("");
       txt_room_type.setText("");
       txt_room_no.setText("");
       dc_check_in_date.setDate(null);
       dc_check_out_date.setDate(null);
       sp_nights.setValue(1);
       txt_total_amount.setText("");
       cmb_payment_method.setSelectedIndex(0);

        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Invalid number format: " + e.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error saving reservation: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace(); // Print stack trace for debugging
    }

        
    }//GEN-LAST:event_btn_confirmActionPerformed

    private void btn_search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_search1ActionPerformed
        
        String room_no = txt_room_no.getText(); 
        ResultSet rs = MReservation.searchRoomNo(room_no);
        try 
        { 
            if (rs.next()) 
            { 
                txt_room_type.setText(rs.getString("room_type"));
                txt_room_price.setText(Double.toString(rs.getDouble("price")));
                
            } else 
            { 
                JOptionPane.showMessageDialog(this, "Room not found!"); 
            }
        } catch (Exception e) 
        { 
            System.err.println(e.getMessage()); 
        }
        
    }//GEN-LAST:event_btn_search1ActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
       VDashboard dashboard = new VDashboard();
        this.setVisible(false);
        dashboard.setVisible(true);
    }//GEN-LAST:event_btn_cancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VRoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VRoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VRoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VRoomReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VRoomReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_confirm;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_search1;
    private javax.swing.JComboBox<String> cmb_payment_method;
    private com.toedter.calendar.JDateChooser dc_check_in_date;
    private com.toedter.calendar.JDateChooser dc_check_out_date;
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
    private javax.swing.JSpinner sp_nights;
    private javax.swing.JTable table_reservations;
    private javax.swing.JTextField txt_guest_id;
    private javax.swing.JTextField txt_guest_name;
    private javax.swing.JTextField txt_reservation_no;
    private javax.swing.JTextField txt_room_no;
    private javax.swing.JTextField txt_room_price;
    private javax.swing.JTextField txt_room_type;
    private javax.swing.JTextField txt_total_amount;
    // End of variables declaration//GEN-END:variables
}

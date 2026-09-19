package View;


import Model.MDashboard;

public class VDashboard extends javax.swing.JFrame {

    private MDashboard dashboard;
    
    public VDashboard() {
        initComponents();
        dashboard = new MDashboard();
        loadDashboardData();
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_add_guest = new javax.swing.JButton();
        btn_add_room = new javax.swing.JButton();
        btn_reports = new javax.swing.JButton();
        btn_make_reservation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_available_rooms = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_occupied_rooms = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_total_rooms = new javax.swing.JLabel();
        lbl_todays_reservations = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setLocationByPlatform(true);

        btn_add_guest.setText("Add Guest");
        btn_add_guest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_guestActionPerformed(evt);
            }
        });

        btn_add_room.setText("Add Room");
        btn_add_room.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_add_roomActionPerformed(evt);
            }
        });

        btn_reports.setText("Reports");
        btn_reports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportsActionPerformed(evt);
            }
        });

        btn_make_reservation.setText("Make Reservation");
        btn_make_reservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_make_reservationActionPerformed(evt);
            }
        });

        jLabel1.setText("Total Rooms");

        jLabel3.setText("Available Rooms");

        lbl_available_rooms.setText("0");

        jLabel5.setText("     Occupied Rooms ");

        lbl_occupied_rooms.setText("0");

        jLabel7.setText("Today's Reservations");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel9.setText("         HOTEL RESERVATION SYSTEM");

        lbl_total_rooms.setText("0");

        lbl_todays_reservations.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(btn_add_guest)
                        .addGap(56, 56, 56)
                        .addComponent(btn_add_room, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(btn_make_reservation)
                        .addGap(49, 49, 49)
                        .addComponent(btn_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(jLabel1)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbl_total_rooms)
                                .addGap(89, 89, 89)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lbl_available_rooms)))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(lbl_occupied_rooms)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(lbl_todays_reservations))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel9)))
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_total_rooms))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_occupied_rooms))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_todays_reservations))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_available_rooms)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add_guest, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_add_room, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_make_reservation, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_reports, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void loadDashboardData() {

    lbl_total_rooms.setText(
        String.valueOf(dashboard.getTotalRooms())
    );

    lbl_available_rooms.setText(
        String.valueOf(dashboard.getAvailableRooms())
    );

    lbl_occupied_rooms.setText(
        String.valueOf(dashboard.getOccupiedRooms())
    );

    lbl_todays_reservations.setText(
        String.valueOf(dashboard.getTodaysReservations())
    );
}
     @SuppressWarnings("unchecked")
    private void btn_add_guestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_guestActionPerformed
        VGuestRegistration guest = new VGuestRegistration();
        this.setVisible(false);
        guest.setVisible(true);
    }//GEN-LAST:event_btn_add_guestActionPerformed

    private void btn_add_roomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_add_roomActionPerformed
        VRoomRegistration room = new VRoomRegistration();
        this.setVisible(false);
        room.setVisible(true);
    }//GEN-LAST:event_btn_add_roomActionPerformed

    private void btn_make_reservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_make_reservationActionPerformed
        VRoomReservation reservation = new VRoomReservation();
        this.setVisible(false);
        reservation.setVisible(true);
    }//GEN-LAST:event_btn_make_reservationActionPerformed

    private void btn_reportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportsActionPerformed
        VReport report = new VReport();
        this.setVisible(false);
        report.setVisible(true);
        
    }//GEN-LAST:event_btn_reportsActionPerformed

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
            java.util.logging.Logger.getLogger(VDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VDashboard().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add_guest;
    private javax.swing.JButton btn_add_room;
    private javax.swing.JButton btn_make_reservation;
    private javax.swing.JButton btn_reports;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_available_rooms;
    private javax.swing.JLabel lbl_occupied_rooms;
    private javax.swing.JLabel lbl_todays_reservations;
    private javax.swing.JLabel lbl_total_rooms;
    // End of variables declaration//GEN-END:variables
}

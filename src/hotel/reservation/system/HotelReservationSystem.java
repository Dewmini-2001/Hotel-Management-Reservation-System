package hotel.reservation.system;

import Model.DarkMetalTheme;
import View.VDashboard;

public class HotelReservationSystem {

    public static void main(String[] args) {

        DarkMetalTheme.apply();

        java.awt.EventQueue.invokeLater(() -> {
            new VDashboard().setVisible(true);
        });
    }
}
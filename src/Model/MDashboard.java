package Model;

import java.sql.*;

public class MDashboard {

    public int getTotalRooms() {
        int total = 0;

        try {
            Statement st = DBConnection.createDBConnection().createStatement();

            ResultSet rs = st.executeQuery(
                "SELECT COUNT(*) FROM room"
            );

            if (rs.next()) {
                total = rs.getInt(1);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return total;
    }

    public int getOccupiedRooms() {
        int occupied = 0;

        try {
            Statement st = DBConnection.createDBConnection().createStatement();

            ResultSet rs = st.executeQuery(
                "SELECT COUNT(DISTINCT room_no) " +
                "FROM reservation " +
                "WHERE check_in_date <= CURDATE() " +
                "AND check_out_date > CURDATE()"
            );

            if (rs.next()) {
                occupied = rs.getInt(1);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return occupied;
    }

    public int getAvailableRooms() {
        int total = getTotalRooms();
        int occupied = getOccupiedRooms();

        return total - occupied;
    }

    public int getTodaysReservations() {
        int reservations = 0;

        try {
            Statement st = DBConnection.createDBConnection().createStatement();

            ResultSet rs = st.executeQuery(
                "SELECT COUNT(*) " +
                "FROM reservation " +
                "WHERE check_in_date = CURDATE()"
            );

            if (rs.next()) {
                reservations = rs.getInt(1);
            }

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return reservations;
    }
}
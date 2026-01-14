package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DatabaseConnection {

    // KONFIGURASI DATABASE
    private static final String URL = "jdbc:mysql://localhost:3306/db_penjualanbuku";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // SELALU BUAT KONEKSI BARU
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Driver MySQL tidak ditemukan: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal koneksi ke database: " + e.getMessage());
        }
        return conn;
    }
}

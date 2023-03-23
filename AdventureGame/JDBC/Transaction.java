package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/Universite";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "pgsql";

    public static void main(String[] args) {

        Connection conn = null;
        String sql = "SELECT  * FROM student";
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            conn.setAutoCommit(false);
            Statement st = conn.createStatement();

            // .... databasi okuma işlemleri
            ResultSet data = st.executeQuery(sql);
            while (data.next()) {
                System.out.println("ID :" + data.getInt("sid"));
                System.out.println("Name :" + data.getString("sname"));
                System.out.println("Clas :" + data.getString("sclass"));
                System.out.println("------------------------");
            }
            // PreparedStatement ile Insert İşlemi
            PreparedStatement pr = conn.prepareStatement("INSERT INTO student (sname,sclass) VALUES (?,?)");
            pr.setString(1, "Harry");
            pr.setString(2, "6");
            pr.executeUpdate();

            if (1 == 1) { throw new SQLException();            }

            // PreparedStatement ile Insert İşlemi
            pr.setString(1, "Ron");
            pr.setString(2, "1");
            pr.executeUpdate();

            conn.commit();
            conn.close();

        } catch (SQLException ex) {
            try {

                if (conn != null) {
                    conn.rollback();
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }
}
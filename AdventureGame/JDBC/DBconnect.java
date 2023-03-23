package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBconnect {
    public static final String DB_URL = "jdbc:postgresql://localhost:5432/Universite";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "pgsql";

    public static void main(String[] args) {

        // ..........database bağlanma işlemleri............
        Connection connect = null;
        String sql = "SELECT  * FROM student";
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connected to PostgreSQL server");
            Statement st = connect.createStatement();

            // .... databasi okuma işlemleri
            ResultSet data = st.executeQuery(sql);
            while (data.next()) {
                System.out.println("ID :" + data.getInt("sid"));
                System.out.println("Name :" + data.getString("sname"));
                System.out.println("Clas :" + data.getString("sclass"));
                System.out.println("------------------------");
            }
            // ... database yeni veri girme işlemi............
            String newQ = "INSERT INTO student (sname,sclass) VALUES ('Mustafa','4')";
            // st.executeUpdate(newQ);

            // ......... önceden hazırlanmış ifadelerle yeni veri girme işlemi.........
            PreparedStatement prnew = connect.prepareStatement("INSERT INTO student (sname,sclass) VALUES (?,?)");
            prnew.setString(1, "Veli");
            prnew.setString(2, "6");
            // prnew.executeUpdate();

            // ...... database verisini değiştirme işlemi............
            String updateQuery = "UPDATE student SET sclass = '5'  WHERE sid = 5";
            // st.executeUpdate(updateQuery);

            // ......PreparedStatement ile database verisini değiştirme işlemi............

            PreparedStatement prupdate = connect.prepareStatement("UPDATE student SET sclass = ?  WHERE sid = ?");
            prupdate.setString(1, "6");
            prupdate.setInt(2, 3);
            // prupdate.executeUpdate();

            // .........Statement ile Delete İşlemi..............
            String deleteQuery = "DELETE FROM student WHERE sid = 2";
            //st.executeUpdate(deleteQuery);

            // .........PreparedStatement ile Delete İşlemi.........
            PreparedStatement prdelete = connect.prepareStatement("DELETE FROM student WHERE sid = ?");
            prdelete.setInt(1, 7);
            prdelete.executeUpdate();

            // .... databasi okuma işlemleri
            data = st.executeQuery(sql);
            System.out.println("***************************");
            while (data.next()) {
                System.out.println("ID :" + data.getInt("sid"));
                System.out.println("Name :" + data.getString("sname"));
                System.out.println("Clas :" + data.getString("sclass"));
                System.out.println("------------------------");
            }

            st.close();
            connect.close();
        } catch (SQLException e) {

            System.out.println(e.getMessage());
            System.out.println(e.getSQLState());
            System.out.println(e.getErrorCode());
        }
    }
}

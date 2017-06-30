package GUI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBase {

    static Connection c;

    public static Connection Createconnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmangementsystem", "root", "12345");
        return c;
    }

    public static void executeupdate(String s) throws Exception {
        if (c == null) {
            Createconnection();
        }

        Statement statement = c.createStatement();
        statement.executeUpdate(s);

    }

    public static ResultSet executequary1(String tb, String wh, String wt) throws Exception {
        if (c == null) {
            Createconnection();
        }
        Statement statement = c.createStatement();
        ResultSet rs = statement.executeQuery("Select* from " + tb + " where " + wh + "='" + wt + "' ");
        return rs;
    }

    public static ResultSet executequary2(String tb) throws Exception {
        if (c == null) {
            Createconnection();
        }
        Statement statement = c.createStatement();
        ResultSet rs = statement.executeQuery("Select* from " + tb + "");
        return rs;
    }

    public static ResultSet executequary3(String tb, String wh, String wt, String wh1, String wt1) throws Exception {
        if (c == null) {
            Createconnection();
        }
        Statement statement = c.createStatement();
        ResultSet rs = statement.executeQuery("Select* from " + tb + " where " + wh + "='" + wt + "' and " + wh1 + "='" + wt1 + "' ");
        return rs;
    }
}

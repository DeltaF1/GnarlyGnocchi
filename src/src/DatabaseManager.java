import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;

public class DatabaseManager {
    private static String url = "jdbc:sqlite:"+Paths.get(".").toAbsolutePath().normalize().toString()+"\\items.db";
    private static Connection conn;
    private static Statement stmt;
    public static void connect()
    {
        try
        {
            conn = DriverManager.getConnection(url);
        }
        catch (SQLException e)
        {
            System.out.println("Error getting connection:");
            System.out.println(e.getMessage());
        }

        try
        {
            stmt = conn.createStatement();
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
        /*if (!hasTable("items")
        {
            firstTimeSetup();
        }
        */

    }

    private static void firstTimeSetup()
    {
        //Create the table here

    }

    public static ArrayList<Record> getAllItems()
    {
        return null;
    }

    public static void removeExpired()
    {
        //conn.execute
    }

    public static Record getItem(int id)
    {
        return null;
    }

    private static Record Record()
    {
        return null;
    }

    public static void remove(int id)
    {
        try
        {
            stmt.execute("DELETE FROM items WHERE id = "+id);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static Record addRecord(String name, float volume, int price, String date) {
        String sql = "INSERT INTO items (name, volume, price, expiry) VALUES ('" +
        name+"',"+volume+","+price+",date("+date+")"+
        ")";
        try {
            stmt.execute(sql);
            ResultSet rs = stmt.executeQuery("SELECT last_insert_rowid();");
            return new Record(rs.getInt(1), name, volume, price, date);
        } catch (SQLException e) {
            System.out.println("Error adding record:");
            System.out.println(e.getMessage());
            return null;
        }
    }

}

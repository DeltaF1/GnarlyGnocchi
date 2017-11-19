import java.sql.*;
import java.util.ArrayList;

public class DatabaseManager {
    private static String url = "jdbc:sqlite:./items.db";
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
            stmt.execute("DELETE FROM item WHERE id = "+id);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public static int addRecord(String name, float volume, int price, String date)
    {
        String sql = "INSERT INTO item (name, volume, price, date) VALUES";

        try
        {
            stmt.execute(sql);
            ResultSet rs = stmt.executeQuery("SELECT last_insert_rowid();");
            return rs.getInt(0);
        }
        catch (SQLException e)
        {
            System.out.println(e.getMessage());
            return -1;
        }
    }

    private static void execute(String sql)
    {

    }

}

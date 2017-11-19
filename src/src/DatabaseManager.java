import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
    }

    private static void firstTimeSetup()
    {
        //Create the table here

    }

    public static ArrayList<Record> getAllItems()
    {

    }

    public static void removeExpired()
    {
        //conn.execute
    }

    public static Record getItem(int id)
    {

    }

    private static Record Record()
    {
        //
    }

    public static void remove(int id)
    {

    }

    public static void addRecord(Record r)
    {

    }

}

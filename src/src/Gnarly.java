
import java.text.SimpleDateFormat;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import javax.swing.*;
import java.util.Date;
import java.nio.file.Paths;


public class Gnarly{

    public static long yourmilliseconds;

    public static String currentTime()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        return sdf.format(new Date());
    }

    public static void main(String [] args){


        DatabaseManager.connect();

        //Testing for Model
        Record r = DatabaseManager.addRecord("Food pellets", 500.0f, 10025, "2017-11-21");
        r.remove();

        View test = new View();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new View();
            }
        });







        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(()-> {
                    DatabaseManager.removeExpired();

                },0, 1, TimeUnit.HOURS);
    }


}

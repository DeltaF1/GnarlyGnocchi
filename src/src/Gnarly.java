
import java.text.SimpleDateFormat;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.Date;
import javax.swing.*;
import java.util.Date;
import java.nio.file.Paths;


public class Gnarly{

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

        long yourmilliseconds = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd,yyyy HH:mm");
        Date resultdate = new Date(yourmilliseconds);
        System.out.println(resultdate);

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(()-> {
                    yourmilliseconds = System.currentTimeMillis();
                });
                executor.scheduleAtFixedRate(timerWatchdog, 0, 3, TimeUnit.SECONDS);
    }


}

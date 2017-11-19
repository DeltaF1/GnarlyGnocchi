

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

    }


}

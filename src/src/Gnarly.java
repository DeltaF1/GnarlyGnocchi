

import javax.swing.*;

public class Gnarly{

    public static void main(String [] args){


        View test = new View();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new View();
            }
        });

    }


}

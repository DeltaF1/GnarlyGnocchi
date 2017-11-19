package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View {
    private JFrame mainWindow;
    public View(){
        mainWindow=new JFrame();
        mainWindow.setSize(420,420);
        mainWindow.addWindowListener(new WindowAdapter() {
            //public void windowClosing(WindowEvent event);
        });
    }
}

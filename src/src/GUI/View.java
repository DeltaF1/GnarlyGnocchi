package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View {
    private JFrame mainWindow;
    private JPanel dataHolder;
    private JPanel dataManipulator;
    private JPanel details;
    private JPanel feature;


    public View(){
        mainWindow=new JFrame("GnarlyGnocchi");
        mainWindow.setSize(420,420);
        mainWindow.setLayout(new FlowLayout());


        dataHolder = new JPanel();
        dataManipulator = new JPanel();
        details = new JPanel();
        dataHolder.add(new JLabel("TempTest"));
        dataHolder.setBorder(BorderFactory.createLineBorder(Color.black));
        dataManipulator.add(new JLabel("TempTest2"));
        dataManipulator.setBorder(BorderFactory.createLineBorder(Color.black));
        details.add(new JLabel("TempTest3"));
        details.setBorder(BorderFactory.createLineBorder(Color.black));


        mainWindow.add(dataHolder);
        mainWindow.add(dataManipulator);


        mainWindow.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent event){
                System.exit(0);
            }
        });
        mainWindow.setVisible(true);
    }





}

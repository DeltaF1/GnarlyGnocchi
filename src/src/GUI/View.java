package GUI;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View {
    private JFrame mainWindow;

   private JPanel mainPanel, dataContainer, manipulatorPanel, detailsPanel, removePanel,
    addPanel, systemPanel;

    public View(){
        mainWindow=new JFrame();
        mainWindow.setSize(1024,768);
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        dataContainer = new JPanel();







        mainWindow.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event){
                System.exit(0);
            }
        });

    }






}

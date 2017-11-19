

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View {
    private JFrame mainWindow;

   private JPanel mainPanel, dataContainer, controlPanel, detailsPanel, removePanel,
    addPanel, systemPanel;

   private JMenuBar dataManagerMenu;
   private JMenu dataManipulator;
   private JMenuItem systemOption, addOption, removeOption;

    public View(){
        mainWindow=new JFrame();
        mainWindow.setSize(420,420);


        dataManagerMenu = new JMenuBar();
        dataManipulator = new JMenu("Data Manipulation");
        systemOption = new JMenuItem("Show System Stats");
        addOption = new JMenuItem("Add New Item");
        removeOption = new JMenuItem("Remove Item");
        dataManagerMenu.add(dataManipulator);
        dataManagerMenu.add(systemOption);
        dataManipulator.add(addOption);
        dataManipulator.add(removeOption);
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        dataContainer = new DataContainerPanel();
        controlPanel = new JPanel();
        mainWindow.add(mainPanel);
        mainPanel.add(dataContainer, BorderLayout.WEST);
        mainPanel.add(controlPanel, BorderLayout.EAST);
        controlPanel.add(dataManagerMenu);





        mainWindow.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event){
                //TODO: BB Make sure it closes correctly
                System.exit(0);
            }
        });
        mainWindow.setVisible(true);

    }






}

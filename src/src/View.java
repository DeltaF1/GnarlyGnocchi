

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View {
    private JFrame mainWindow;

   private JPanel mainPanel, dataContainer, controlPanel, detailsPanel, switchPanel,
    addPanel, systemPanel;

   private JMenuBar dataManagerMenu;
   private JMenu dataManipulator;
   private JMenuItem systemOption, addOption, removeOption;
   private DatabaseManager dataModel;
    private CardLayout switchConext;
   public static DataContainerPanel dataContainerPanel;
    public View(){
        mainWindow=new JFrame();
        mainWindow.setSize(420,420);
        switchConext = new CardLayout();
        switchPanel = new JPanel();
        switchPanel.setLayout(switchConext);
        addPanel = new JPanel();
        systemPanel = new JPanel();
        detailsPanel = new DetailsPanel();

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
        View.dataContainerPanel = (DataContainerPanel) dataContainer;
        controlPanel = new JPanel();
        controlPanel.setLayout(new BorderLayout());
        controlPanel.add(detailsPanel, BorderLayout.WEST);
        controlPanel.add(switchPanel, BorderLayout.EAST);

        switchPanel.add(addPanel, "Add");
        switchPanel.add(systemPanel, "System");
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


    public void switchPanel(String x){
       if(x.equals("System")){
           switchConext.show(systemPanel, "System");
       }else{
           switchConext.show(addPanel, "Add");
       }
    }




}



import javax.swing.*;
import java.awt.*;
import java.util.*;


public class DataContainerPanel  extends JPanel{
    private JPanel innerPanel;
    private JList<Record> data;
    private  DefaultListModel<Record> temp;

    public DataContainerPanel(){
        super();

       this.setLayout(new BorderLayout());

        temp = new DefaultListModel<Record>();
        data = new JList<Record>(temp);

        data.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        data.setSelectedIndex(0);

        JScrollPane listScrollPane = new JScrollPane(data);
        this.add(listScrollPane);


    }


    public void getData(){

        temp.clear();
        float totalVolume = 0;
        for (Record r : DatabaseManager.getAllItems())
        {
            temp.addElement(r);
            totalVolume += r.volume;
        }

        if (totalVolume / (float)80000 <= 60)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Supplies are too low!");
        }

        if (totalVolume / (float)80000 >= 95)
        {
            JOptionPane.showMessageDialog(new JFrame(), "Too full!");
        }

    }


}

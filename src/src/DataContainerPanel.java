

import javax.swing.*;
import java.awt.*;
import java.util.*;


public class DataContainerPanel  extends JPanel{
    private JPanel innerPanel;
    private JList<Record> data;

    public DataContainerPanel(){
        super();

       this.setLayout(new BorderLayout());

        DefaultListModel<Record> temp = new DefaultListModel<Record>();
        temp.addElement(new Record("tep",2, 5, "lol"));

        data = new JList<Record>(temp);
        data.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        data.setSelectedIndex(0);

        JScrollPane listScrollPane = new JScrollPane(data);
        this.add(listScrollPane);

    }


    public void getData(){



    }


}

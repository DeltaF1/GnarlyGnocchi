

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

        temp= new DefaultListModel<Record>();


        data = new JList<Record>(temp);

        data.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        data.setSelectedIndex(0);

        JScrollPane listScrollPane = new JScrollPane(data);
        this.add(listScrollPane);

    }


    public void getData(){

        temp.addElement(new Record(1,"test", 2, 1, "LOL"));

    }


}

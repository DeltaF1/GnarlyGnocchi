

import javax.swing.*;
import java.awt.*;


public class DataContainerPanel  extends JPanel{
    private JPanel innerPanel;
    private JList<Record> data;

    public DataContainerPanel(){

        super();
       this.setLayout(new BorderLayout());

        data = new JList<Record>();
       this.add(data);
    }


    public void getData(){

    }


}

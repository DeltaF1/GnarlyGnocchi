import javax.swing.*;

public class SysPanel extends JPanel {

    private JTextField TotalArea, AreaInUse, TotalCost;

    public SysPanel(){

            JLabel TotalAreaLabel = new JLabel("Total Area");
            TotalAreaLabel.setBounds(10,10,10,10);
            this.add(TotalAreaLabel);

            TotalArea = new JTextField(20);
            TotalArea.setBounds(10,20,10,10);
            this.add(TotalArea);
            TotalArea.setEditable(false);


            JLabel AreaInUseLabel = new JLabel("Area In Use");
            AreaInUseLabel.setBounds(10,30,10,10);
            this.add(AreaInUseLabel);

            AreaInUse = new JTextField(20);
            AreaInUse.setBounds(10,20,10,10);
            this.add(AreaInUse);
            AreaInUse.setEditable(false);


            JLabel TotalCostLabel = new JLabel("Total Cost");
            TotalCostLabel.setBounds(10,30,10,10);
            this.add(TotalCostLabel);

            TotalCost = new JTextField(20);
            TotalCost.setBounds(10,20,10,10);
            this.add(TotalCost);
            TotalCost.setEditable(false);
            //
        }
    }


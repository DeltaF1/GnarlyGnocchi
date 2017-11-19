import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddControler implements ActionListener {
    private JPanel currentPanel;

    public AddControler(JPanel currentPanel){
        this.currentPanel = currentPanel;
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getActionCommand().equals("Add Item")){

            addPanel panel = (addPanel) actionEvent.getSource();

            Record r = DatabaseManager.addRecord(panel.nameText.getText(), Float.parseFloat(panel.volumeText.getText()),
                    Integer.parseInt(panel.priceText.getText()), panel.expiryText.getText());

            View.dataContainerPanel.getData();

        }
    }


}

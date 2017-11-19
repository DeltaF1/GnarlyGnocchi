
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class addPanel extends JPanel{

    private JTextField nameText, volumeText, priceText, expiryText;


    public addPanel() {
        JPanel addPanel = new JPanel();
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(10,10,10,10);
        addPanel.add(nameLabel);

        nameText = new JTextField(20);
        nameText.setBounds(20,20,10,10);
        addPanel.add(nameText);

        JLabel volumeLabel = new JLabel("Volume");
        volumeLabel.setBounds(30,30,10,10);
        addPanel.add(volumeLabel);

        volumeText = new JTextField(20);
        volumeText.setBounds(40,40,10,10);
        addPanel.add(volumeText);

        JLabel priceLabel = new JLabel("Price");
        priceLabel.setBounds(50,50,10,10);
        addPanel.add(priceLabel);

        priceText = new JTextField(20);
        priceText.setBounds(60,60,10,10);
        addPanel.add(priceText);

        JLabel expiryLabel = new JLabel("Expiry");
        priceLabel.setBounds(70,70,10,10);
        addPanel.add(expiryLabel);

        expiryText = new JTextField(20);
        expiryText.setBounds(80,80,10,10);
        addPanel.add(expiryText);

        JButton addButton = new JButton("Add Item");
        addButton.setBounds(100, 100, 80, 25);
        addPanel.add(addButton);
    }

}

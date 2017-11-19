
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class addPanel extends JPanel{

    private JTextField nameText, volumeText, priceText, expiryText;

    public JTextField getVolumeText() {
        return volumeText;
    }

    public JTextField getPriceText() {
        return priceText;
    }

    public JTextField getNameText() {
        return nameText;
    }

    public JTextField getExpiryText() {
        return expiryText;
    }

    public addPanel() {
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel nameLabel = new JLabel("Name");

        this.add(nameLabel);

        nameText = new JTextField(20);
        nameText.setEnabled(true);
        this.add(nameText);

        JLabel volumeLabel = new JLabel("Volume");

        this.add(volumeLabel);

        volumeText = new JTextField(20);
        volumeText.setEnabled(true);
        this.add(volumeText);

        JLabel priceLabel = new JLabel("Price");

        this.add(priceLabel);

        priceText = new JTextField(20);
        priceText.setEnabled(true);
        this.add(priceText);

        JLabel expiryLabel = new JLabel("Expiry");

        this.add(expiryLabel);

        expiryText = new JTextField(20);
        expiryText.setEnabled(true);
        this.add(expiryText);

        JButton addButton = new JButton("Add Item");

        addButton.addActionListener(new AddControler(this));

        this.add(addButton);
    }

}

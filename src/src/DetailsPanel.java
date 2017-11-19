import javax.swing.*;
import java.awt.*;

public class DetailsPanel extends JPanel {


    private JTextField id, name, volume, price, expirey;

    public DetailsPanel(){

        JLabel idLabel = new JLabel("ID");
        idLabel.setBounds(10,10,10,10);
        this.add(idLabel);

        id = new JTextField(20);
        id.setBounds(20,20,10,10);
        this.add(id);
        id.setEditable(false);


        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(30,30,10,10);
        this.add(nameLabel);

        name = new JTextField(20);
        name.setBounds(40,40,10,10);
        this.add(name);
        name.setEditable(false);


        JLabel volumeLabel = new JLabel("Volume");
        this.setBounds(50,50,10,10);
        this.add(volumeLabel);

        volume = new JTextField(20);
        volume.setBounds(60,60,10,10);
        this.add(volume);
        volume.setEditable(false);


        JLabel priceLabel = new JLabel("Price");
        this.setBounds(70,70,10,10);
        this.add(priceLabel);

        price = new JTextField(20);
        price.setBounds(80,80,10,10);
        this.add(price);
        price.setEditable(false);


        JLabel expireyLabel = new JLabel("Price");
        expireyLabel.setBounds(90,90,10,10);
        this.add(expireyLabel);

        expirey = new JTextField(20);
        expirey.setBounds(100,100,10,10);
        this.add(expirey);
        expirey.setEditable(false);

        this.setLayout(new FlowLayout());






    }






}

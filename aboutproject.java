import java.awt.*;
import javax.swing.*;
//import javax.swing.border.*;

public class aboutproject extends JFrame{
    public aboutproject() {
        super("About Us");
        JLabel l3 = new JLabel("Institute Management System");
        l3.setFont(new Font("Pristina", Font.BOLD | Font.ITALIC, 34));
        l3.setBounds(300, 40, 500, 55);
        add(l3);
        setBackground(Color.GREEN);
        setSize(500,550);
    }

    public static void main(String[] args) {
        new aboutproject().setVisible(true);
    }
}
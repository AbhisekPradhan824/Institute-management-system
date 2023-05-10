import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class InstituteManagementSystem extends JFrame implements ActionListener{

    JLabel l1;
    JButton b1;

    public InstituteManagementSystem() {

        setSize(1200,500);
        setLayout(null);
        setLocation(300,300);

        l1 = new JLabel("");
        b1 = new JButton("Next >>");

        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.GREEN);



        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/Institute.png"));
        Image i3 = i1.getImage().getScaledInstance(1366, 390,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        l1 = new JLabel(i2);

        b1.setBounds(1050,350,200,60);
        l1.setBounds(0, 0, 1366, 500);

        l1.add(b1);
        add(l1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae){
        new Login().setVisible(true);
        this.setVisible(false);

    }

    public static void main(String[] args)
    {
        InstituteManagementSystem window = new InstituteManagementSystem();
        window.setVisible(true);
    }
}
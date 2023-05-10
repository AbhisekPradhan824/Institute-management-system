import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
public class AddTeacher extends JFrame implements ActionListener{

    private JPanel contentPane;

    JDateChooser dateChooser;
    private JTextField t1,t2,t4,t5,t6,t7,t8,t9,t14,t15;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
    JButton b1,b2;

    public static void main(String[] args) {
        new AddTeacher().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
        t1.setText("" + rd.nextInt(10000 + 1));
    }

    public AddTeacher() {
        super("Add Teacher");
        setBounds(700, 200, 550, 1200);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("Teacher_id");
        l1.setForeground(new Color(25, 25, 130));
        l1.setFont(new Font("Tahoma", Font.BOLD, 14));
        l1.setBounds(64, 63, 102, 22);
        contentPane.add(l1);

        t1 = new JTextField();
        t1.setEditable(false);
        t1.setForeground(new Color(47, 79, 79));
        t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t1.setBounds(174, 66, 156, 20);
        contentPane.add(t1);
        t1.setColumns(10);

        JLabel l2 = new JLabel("Name");
        l2.setForeground(new Color(25, 25, 130));
        l2.setFont(new Font("Tahoma", Font.BOLD, 14));
        l2.setBounds(64, 97, 102, 22);
        contentPane.add(l2);

        t2 = new JTextField();
        t2.setForeground(new Color(47, 79, 79));
        t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t2.setColumns(10);
        t2.setBounds(174, 100, 156, 20);
        contentPane.add(t2);

        JLabel l3 = new JLabel(" Date of Birth :");
        l3.setForeground(new Color(25, 25, 130));
        l3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l3.setBounds(20, 130, 110, 26);
        contentPane.add(l3);

        dateChooser = new JDateChooser();
        dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(137, 130, 200, 29);
        contentPane.add(dateChooser);

        JLabel l13 = new JLabel("Gender");
        l13.setForeground(new Color(25, 25, 130));
        l13.setFont(new Font("Tahoma", Font.BOLD, 14));
        l13.setBounds(64, 163, 102, 22);
        contentPane.add(l13);

        comboBox_3 = new JComboBox();
        comboBox_3.setModel(new DefaultComboBoxModel(
                new String[] {"Male","Female","Trans" }));
        comboBox_3.setForeground(new Color(47, 79, 79));
        comboBox_3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        comboBox_3.setBounds(176, 165, 154, 20);
        contentPane.add(comboBox_3);

        JLabel l4 = new JLabel("Father's Name");
        l4.setForeground(new Color(25, 25, 130));
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(64, 195, 102, 22);
        contentPane.add(l4);

        t4 = new JTextField();
        t4.setForeground(new Color(47, 79, 79));
        t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t4.setColumns(10);
        t4.setBounds(174, 197, 156, 20);
        contentPane.add(t4);

        JLabel l5 = new JLabel("Mother's Name");
        l5.setForeground(new Color(25, 25, 130));
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(64, 230, 102, 22);
        contentPane.add(l5);

        t5 = new JTextField();
        t5.setForeground(new Color(47, 79, 79));
        t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t5.setColumns(10);
        t5.setBounds(174, 232, 156, 20);
        contentPane.add(t5);

        JLabel l9 = new JLabel("Contact");
        l9.setForeground(new Color(25, 25, 130));
        l9.setFont(new Font("Tahoma", Font.BOLD, 14));
        l9.setBounds(64, 260, 102, 22);
        contentPane.add(l9);

        t9 = new JTextField();
        t9.setForeground(new Color(47, 79, 79));
        t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t9.setColumns(10);
        t9.setBounds(174, 262, 156, 20);
        contentPane.add(t9);

        JLabel l7 = new JLabel("E-mail  Id");
        l7.setForeground(new Color(25, 25, 130));
        l7.setFont(new Font("Tahoma", Font.BOLD, 14));
        l7.setBounds(64, 290, 102, 22);
        contentPane.add(l7);

        t7 = new JTextField();
        t7.setForeground(new Color(47, 79, 79));
        t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t7.setColumns(10);
        t7.setBounds(174, 292, 156, 20);
        contentPane.add(t7);

        JLabel l8 = new JLabel("Address");
        l8.setForeground(new Color(25, 25, 130));
        l8.setFont(new Font("Tahoma", Font.BOLD, 14));
        l8.setBounds(64, 320, 102, 22);
        contentPane.add(l8);

        t8 = new JTextField();
        t8.setForeground(new Color(47, 79, 79));
        t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t8.setColumns(10);
        t8.setBounds(174, 322, 156, 20);
        contentPane.add(t8);

        JLabel l20 = new JLabel(" Date of Joining :");
        l20.setForeground(new Color(25, 25, 130));
        l20.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l20.setBounds(20, 350, 110, 26);
        contentPane.add(l20);

        dateChooser = new JDateChooser();
        dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(137, 350, 200, 29);
        contentPane.add(dateChooser);

        JLabel l6 = new JLabel("Designation ");
        l6.setForeground(new Color(25, 25, 130));
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setBounds(64, 380, 102, 22);
        contentPane.add(l6);

        t6 = new JTextField();
        t6.setForeground(new Color(47, 79, 79));
        t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t6.setColumns(10);
        t6.setBounds(174, 381, 156, 20);
        contentPane.add(t6);

        JLabel a = new JLabel("Salary");
        a.setForeground(new Color(25, 25, 130));
        a.setFont(new Font("Tahoma", Font.BOLD, 14));
        a.setBounds(64, 410, 102, 22);
        contentPane.add(a);

        t14 = new JTextField();
        t14.setForeground(new Color(47, 79, 79));
        t14.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t14.setColumns(10);
        t14.setBounds(174, 413, 156, 20);
        contentPane.add(t14);

        JLabel l10 = new JLabel("Academic  Qualification");
        l10.setForeground(new Color(25, 25, 130));
        l10.setFont(new Font("Tahoma", Font.BOLD, 14));
        l10.setBounds(64, 445, 102, 22);
        contentPane.add(l10);

        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] { "BSC","MA","MCA","MSC","B.ed","P.hd", "Other" }));
        comboBox.setForeground(new Color(47, 79, 79));
        comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        comboBox.setBounds(176, 447, 175, 20);
        contentPane.add(comboBox);

        JLabel l11 = new JLabel("Experience");
        l11.setForeground(new Color(25, 25, 130));
        l11.setFont(new Font("Tahoma", Font.BOLD, 14));
        l11.setBounds(64, 480, 102, 22);
        contentPane.add(l11);

        t15 = new JTextField();
        t15.setForeground(new Color(47, 79, 79));
        t15.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t15.setColumns(10);
        t15.setBounds(174, 483, 156, 20);
        contentPane.add(t15);

        JLabel l12 = new JLabel("Graduate ");
        l12.setForeground(new Color(25, 25, 130));
        l12.setFont(new Font("Tahoma", Font.BOLD, 14));
        l12.setBounds(64, 515, 102, 22);
        contentPane.add(l12);


        comboBox_2 = new JComboBox();
        comboBox_2.setModel(
                new DefaultComboBoxModel(new String[] { "Yes","No" }));
        comboBox_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        comboBox_2.setForeground(new Color(47, 79, 79));
        comboBox_2.setBounds(176, 517, 154, 20);
        contentPane.add(comboBox_2);

        b1 = new JButton("ADD");
        b1.addActionListener(this);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b1.setBounds(64, 580, 111, 33);
        b1.setBackground(Color.RED);
        b1.setForeground(Color.BLACK);
        contentPane.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b2.setBounds(198, 580, 111, 33);
        b2.setBackground(Color.GREEN);
        b2.setForeground(Color.BLACK);
        contentPane.add(b2);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 2, true), "Add-Teacher",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 255)));
        panel.setBackground(new Color(211, 211, 211));
        panel.setBounds(10, 38, 358, 800);

        contentPane.setBackground(Color.GREEN);
        panel.setBackground(Color.YELLOW);

        contentPane.add(panel);
        random();
    }

    public void actionPerformed(ActionEvent ae){
        try{

            if(ae.getSource() == b1){
                try{
                    Connect conn = new Connect();
                    String sql = "insert into teacher(teacher_id, teacher_name, dob, gender, fa_name, mo_name, contact, email, address, date_of_joining, desig, salary, aca_quali, expe, graduate) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = conn.con.prepareStatement(sql);
                    st.setString(1, t1.getText());
                    st.setString(2, t2.getText());
                    st.setString(3, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
                    st.setString(5, t4.getText());
                    st.setString(6, t5.getText());
                    st.setString(7, t9.getText());
                    st.setString(8, t7.getText());
                    st.setString(9, t8.getText());
                    st.setString(10, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
                    st.setString(11, t6.getText());
                    st.setString(12, t14.getText());
                    st.setString(4, (String) comboBox_3.getSelectedItem());
                    st.setString(13, (String) comboBox.getSelectedItem());
                    st.setString(14, t15.getText());
                    st.setString(15, (String) comboBox_2.getSelectedItem());

                    int i = st.executeUpdate();
                    if (i > 0){
                        JOptionPane.showMessageDialog(null, "Successfully Added");
                        this.setVisible(false);
                        new Menu().setVisible(true);
                    }
                    else
                        JOptionPane.showMessageDialog(null, "error");
                }catch(Exception e){
                    e.printStackTrace();
                }
            }

            if(ae.getSource() == b2){
                this.setVisible(false);
                new Menu().setVisible(true);
            }
        }catch(Exception e){

        }
    }
}


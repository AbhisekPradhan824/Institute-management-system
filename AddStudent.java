import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
public class AddStudent extends JFrame implements ActionListener{

    private JPanel contentPane;

    JDateChooser dateChooser;
    private JTextField t1,t2,t4,t5,t6,t7,t8,t9,t14;
    private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3,comboBox_4;
    JButton b1,b2;

    public static void main(String[] args) {
        new AddStudent().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
        t1.setText("" + rd.nextInt(10000 + 1));
    }

    public AddStudent() {
        super("Add Student");
        setBounds(700, 200, 600, 700);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel l1 = new JLabel("Student_id");
        l1.setForeground(new Color(25, 25, 112));
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
        l2.setForeground(new Color(25, 25, 112));
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
        l3.setForeground(new Color(10, 1, 105));
        l3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
        l3.setBounds(20, 130, 110, 26);
        contentPane.add(l3);

        dateChooser = new JDateChooser();
        dateChooser.setBorder(new LineBorder(new Color(14, 78, 56), 1, true));
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(174, 127, 200, 22);
        contentPane.add(dateChooser);

        JLabel l4 = new JLabel("Father's Name");
        l4.setForeground(new Color(25, 25, 112));
        l4.setFont(new Font("Tahoma", Font.BOLD, 14));
        l4.setBounds(64, 160, 102, 22);
        contentPane.add(l4);

        t4 = new JTextField();
        t4.setForeground(new Color(47, 79, 79));
        t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t4.setColumns(10);
        t4.setBounds(174, 163, 156, 20);
        contentPane.add(t4);

        JLabel l5 = new JLabel("Father's Occupation");
        l5.setForeground(new Color(25, 25, 112));
        l5.setFont(new Font("Tahoma", Font.BOLD, 14));
        l5.setBounds(64, 190, 102, 22);
        contentPane.add(l5);

        t5 = new JTextField();
        t5.setForeground(new Color(47, 79, 79));
        t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t5.setColumns(10);
        t5.setBounds(174, 193, 156, 20);
        contentPane.add(t5);

        JLabel l6 = new JLabel("Mother's Name");
        l6.setForeground(new Color(25, 25, 112));
        l6.setFont(new Font("Tahoma", Font.BOLD, 14));
        l6.setBounds(64, 230, 102, 22);
        contentPane.add(l6);

        t6 = new JTextField();
        t6.setForeground(new Color(47, 79, 79));
        t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t6.setColumns(10);
        t6.setBounds(174, 233, 156, 20);
        contentPane.add(t6);

        JLabel l7 = new JLabel("Mother's Occupation");
        l7.setForeground(new Color(25, 25, 112));
        l7.setFont(new Font("Tahoma", Font.BOLD, 14));
        l7.setBounds(64, 260, 102, 22);
        contentPane.add(l7);

        t7 = new JTextField();
        t7.setForeground(new Color(47, 79, 79));
        t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t7.setColumns(10);
        t7.setBounds(174, 263, 156, 20);
        contentPane.add(t7);

        JLabel l8 = new JLabel("Address");
        l8.setForeground(new Color(25, 25, 112));
        l8.setFont(new Font("Tahoma", Font.BOLD, 14));
        l8.setBounds(64, 290, 102, 22);
        contentPane.add(l8);

        t8 = new JTextField();
        t8.setForeground(new Color(47, 79, 79));
        t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t8.setColumns(10);
        t8.setBounds(174, 293, 156, 20);
        contentPane.add(t8);

        JLabel l9 = new JLabel("Contact");
        l9.setForeground(new Color(25, 25, 112));
        l9.setFont(new Font("Tahoma", Font.BOLD, 14));
        l9.setBounds(64, 330, 102, 22);
        contentPane.add(l9);

        t9 = new JTextField();
        t9.setForeground(new Color(47, 79, 79));
        t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t9.setColumns(10);
        t9.setBounds(174, 333, 156, 20);
        contentPane.add(t9);

        JLabel l10 = new JLabel("Category");
        l10.setForeground(new Color(25, 25, 112));
        l10.setFont(new Font("Tahoma", Font.BOLD, 14));
        l10.setBounds(64, 360, 102, 22);
        contentPane.add(l10);

        comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] { "GENERAL","OBC","SCBC","ST","SC", "Other" }));
        comboBox.setForeground(new Color(47, 79, 79));
        comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        comboBox.setBounds(176, 362, 175, 20);
        contentPane.add(comboBox);

        JLabel l11 = new JLabel("Admission Year");
        l11.setForeground(new Color(25, 25, 112));
        l11.setFont(new Font("Tahoma", Font.BOLD, 14));
        l11.setBounds(64, 390, 102, 22);
        contentPane.add(l11);

        comboBox_1 = new JComboBox();
        comboBox_1.setModel(new DefaultComboBoxModel(new String[] { "2017","2018","2019","2020","2021","2022","2013","2014"}));
        comboBox_1.setForeground(new Color(47, 79, 79));
        comboBox_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        comboBox_1.setBounds(176, 392, 175, 20);
        contentPane.add(comboBox_1);

        JLabel l12 = new JLabel("Semester");
        l12.setForeground(new Color(25, 25, 112));
        l12.setFont(new Font("Tahoma", Font.BOLD, 14));
        l12.setBounds(64, 420, 102, 22);
        contentPane.add(l12);


        comboBox_2 = new JComboBox();
        comboBox_2.setModel(
                new DefaultComboBoxModel(new String[] { "1st", "2nd", "3rd", "4th", "5th", "6th", "7th", "8th" }));
        comboBox_2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        comboBox_2.setForeground(new Color(47, 79, 79));
        comboBox_2.setBounds(176, 422, 154, 20);
        contentPane.add(comboBox_2);

        JLabel l15 = new JLabel("Branch");
        l15.setForeground(new Color(25, 25, 112));
        l15.setFont(new Font("Tahoma", Font.BOLD, 14));
        l15.setBounds(64, 450, 102, 22);
        contentPane.add(l15);


        comboBox_4 = new JComboBox();
        comboBox_4.setModel(
                new DefaultComboBoxModel(new String[] { "CSE", "ECE", "EEE", "Mechanical", "Civil", "Metallurgy", "Aerospace", "Biotechnology" }));
        comboBox_4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        comboBox_4.setForeground(new Color(47, 79, 79));
        comboBox_4.setBounds(176, 452, 154, 20);
        contentPane.add(comboBox_4);

        JLabel l14 = new JLabel("Roll no.");
        l14.setForeground(new Color(25, 25, 112));
        l14.setFont(new Font("Tahoma", Font.BOLD, 14));
        l14.setBounds(64, 480, 102, 22);
        contentPane.add(l14);

        t14 = new JTextField();
        t14.setForeground(new Color(47, 79, 79));
        t14.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t14.setColumns(10);
        t14.setBounds(174, 482, 156, 20);
        contentPane.add(t14);

        b1 = new JButton("ADD");
        b1.addActionListener(this);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b1.setBounds(64, 560, 111, 33);
        b1.setBackground(Color.RED);
        b1.setForeground(Color.GREEN);
        contentPane.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b2.setBounds(198, 560, 111, 33);
        b2.setBackground(Color.GREEN);
        b2.setForeground(Color.BLUE);
        contentPane.add(b2);

        JLabel l13 = new JLabel("Gender");
        l13.setForeground(new Color(25, 25, 112));
        l13.setFont(new Font("Tahoma", Font.BOLD, 14));
        l13.setBounds(64, 512, 102, 22);
        contentPane.add(l13);

        comboBox_3 = new JComboBox();
        comboBox_3.setModel(new DefaultComboBoxModel(
                new String[] {"Male","Female","Trans" }));
        comboBox_3.setForeground(new Color(47, 79, 79));
        comboBox_3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        comboBox_3.setBounds(176, 514, 154, 20);
        contentPane.add(comboBox_3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 2, true), "Add-Student",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 250)));
        panel.setBackground(new Color(211, 211, 211));
        panel.setBounds(10, 38, 888, 888);

        contentPane.setBackground(Color.PINK);
        panel.setBackground(Color.YELLOW);

        contentPane.add(panel);
        random();
    }

    public void actionPerformed(ActionEvent ae){
        try{

            if(ae.getSource() == b1){
                try{
                    Connect conn = new Connect();
                    String sql = "insert into student(student_id, stname, dob,fa_name,fa_occu,mo_name,mo_occu,address,contact,category,adm_year,sem,branch,roll,gender) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = conn.con.prepareStatement(sql);
                    st.setString(1, t1.getText());
                    st.setString(2, t2.getText());
                    st.setString(3, ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText());
                    st.setString(4, t4.getText());
                    st.setString(5, t5.getText());
                    st.setString(6, t6.getText());
                    st.setString(7, t7.getText());
                    st.setString(8, t8.getText());
                    st.setString(9, t9.getText());
                    st.setString(14, t14.getText());
                    st.setString(13, (String) comboBox_4.getSelectedItem());
                    st.setString(15, (String) comboBox_3.getSelectedItem());
                    st.setString(10, (String) comboBox.getSelectedItem());
                    st.setString(11, (String) comboBox_1.getSelectedItem());
                    st.setString(12, (String) comboBox_2.getSelectedItem());

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

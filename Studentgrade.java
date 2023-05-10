import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.util.*;
public class Studentgrade extends JFrame implements ActionListener{

    private JPanel content;

    private JTextField t1,t2,t4,t5,t6,t7,t8,t9,t10;
    JButton b1,b2;

    public static void main(String[] args) {
        new Studentgrade().setVisible(true);
    }

    public void random() {
        Random rd = new Random();
     t1.setText("" + rd.nextInt(10000 + 1));
    }

    public Studentgrade() {
        super("Grade_Sheet");
        setBounds(700, 200, 600, 700);
        content = new JPanel();
        content.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(content);
        content.setLayout(null);

        JLabel la = new JLabel("Student_id");
        la.setForeground(new Color(25, 25, 112));
        la.setFont(new Font("Tahoma", Font.BOLD, 14));
        la.setBounds(64, 63, 102, 22);
        content.add(la);

        t1 = new JTextField();
        t1.setEditable(false);
        t1.setForeground(new Color(47, 79, 79));
        t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t1.setBounds(174, 66, 156, 20);
        content.add(t1);
        t1.setColumns(10);

        JLabel lb = new JLabel("Name");
        lb.setForeground(new Color(25, 25, 112));
        lb.setFont(new Font("Tahoma", Font.BOLD, 14));
        lb.setBounds(64, 97, 102, 22);
        content.add(lb);

        t2 = new JTextField();
        t2.setForeground(new Color(47, 79, 79));
        t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t2.setColumns(10);
        t2.setBounds(174, 100, 156, 20);
        content.add(t2);


        JLabel lc = new JLabel("JAVA");
        lc.setForeground(new Color(25, 25, 112));
        lc.setFont(new Font("Tahoma", Font.BOLD, 14));
        lc.setBounds(64, 160, 102, 22);
        content.add(lc);

        t4 = new JTextField();
        t4.setForeground(new Color(47, 79, 79));
        t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t4.setColumns(10);
        t4.setBounds(174, 163, 156, 20);
        content.add(t4);

        JLabel ld = new JLabel("DSP");
        ld.setForeground(new Color(25, 25, 112));
        ld.setFont(new Font("Tahoma", Font.BOLD, 14));
        ld.setBounds(64, 190, 102, 22);
        content.add(ld);

        t5 = new JTextField();
        t5.setForeground(new Color(47, 79, 79));
        t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t5.setColumns(10);
        t5.setBounds(174, 193, 156, 20);
        content.add(t5);

        JLabel le = new JLabel("ITC");
        le.setForeground(new Color(25, 25, 112));
        le.setFont(new Font("Tahoma", Font.BOLD, 14));
        le.setBounds(64, 230, 102, 22);
        content.add(le);

        t6 = new JTextField();
        t6.setForeground(new Color(47, 79, 79));
        t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t6.setColumns(10);
        t6.setBounds(174, 233, 156, 20);
        content.add(t6);

        JLabel lf = new JLabel("Maths");
        lf.setForeground(new Color(25, 25, 112));
        lf.setFont(new Font("Tahoma", Font.BOLD, 14));
        lf.setBounds(64, 260, 102, 22);
        content.add(lf);

        t7 = new JTextField();
        t7.setForeground(new Color(47, 79, 79));
        t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t7.setColumns(10);
        t7.setBounds(174, 263, 156, 20);
        content.add(t7);

        JLabel lg = new JLabel("Data structure");
        lg.setForeground(new Color(25, 25, 112));
        lg.setFont(new Font("Tahoma", Font.BOLD, 14));
        lg.setBounds(64, 290, 102, 22);
        content.add(lg);

        t8 = new JTextField();
        t8.setForeground(new Color(47, 79, 79));
        t8.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t8.setColumns(10);
        t8.setBounds(174, 293, 156, 20);
        content.add(t8);

        JLabel lh = new JLabel("Embedded System");
        lh.setForeground(new Color(25, 25, 112));
        lh.setFont(new Font("Tahoma", Font.BOLD, 14));
        lh.setBounds(64, 330, 102, 22);
        content.add(lh);

        t9 = new JTextField();
        t9.setForeground(new Color(47, 79, 79));
        t9.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t9.setColumns(10);
        t9.setBounds(174, 333, 156, 20);
        content.add(t9);


        JLabel li = new JLabel("COA");
        li.setForeground(new Color(25, 25, 112));
        li.setFont(new Font("Tahoma", Font.BOLD, 14));
        li.setBounds(64, 360, 102, 22);
        content.add(li);

        t10 = new JTextField();
        t10.setForeground(new Color(47, 79, 79));
        t10.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        t10.setColumns(10);
        t10.setBounds(174, 362, 156, 20);
        content.add(t10);

        b1 = new JButton("ADD");
        b1.addActionListener(this);
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b1.setBounds(64, 430, 111, 33);
        b1.setBackground(Color.RED);
        b1.setForeground(Color.GREEN);
        content.add(b1);

        b2 = new JButton("Back");
        b2.addActionListener(this);
        b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        b2.setBounds(198, 430, 111, 33);
        b2.setBackground(Color.GREEN);
        b2.setForeground(Color.BLUE);
        content.add(b2);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(102, 205, 170), 2, true), "Grade Sheet",
                TitledBorder.LEADING, TitledBorder.TOP, null, new Color(30, 144, 250)));
        panel.setBackground(new Color(211, 211, 211));
        panel.setBounds(10, 38, 600, 600);

        content.setBackground(Color.PINK);
        panel.setBackground(Color.YELLOW);

        content.add(panel);
        random();
    }

    public void actionPerformed(ActionEvent ae){
        try{

            if(ae.getSource() == b1){
                try{
                    Connect conn = new Connect();
                    String sql = "insert into gradesheet(student_id, name, JAVA, dsp, itc, math, datastr, embedded, coa) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
                    PreparedStatement st = conn.con.prepareStatement(sql);
                    st.setString(1, t1.getText());
                    st.setString(2, t2.getText());
                    st.setString(3, t4.getText());
                    st.setString(4, t5.getText());
                    st.setString(5, t6.getText());
                    st.setString(6, t7.getText());
                    st.setString(7, t8.getText());
                    st.setString(8, t9.getText());
                    st.setString(9, t10.getText());

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

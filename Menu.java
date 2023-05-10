import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame implements ActionListener {

    private JPanel contentPane;
    private JButton b1, b2, b3, b4, b5, b6;

    public static void main(String[] args) {
        new Menu().setVisible(true);
    }

    public Menu() {

        setBounds(400, 150, 1000, 800);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);


        JMenuBar menuBar = new JMenuBar();
        menuBar.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 128, 0), new Color(128, 128, 128)));
        menuBar.setBackground(Color.GREEN);
        menuBar.setBounds(0, 10, 1000, 35);
        contentPane.add(menuBar);

        JMenu mnExit = new JMenu("Exit");
        mnExit.setFont(new Font("Trebuchet MS", Font.BOLD, 17));


        JMenuItem mntmLogout = new JMenuItem("Logout");
        mntmLogout.setBackground(new Color(211, 211, 211));
        mntmLogout.setForeground(new Color(105, 105, 105));
        mntmLogout.addActionListener(this);
        mnExit.add(mntmLogout);

        JMenuItem mntmExit = new JMenuItem("Exit");
        mntmExit.setForeground(new Color(105, 155, 105));
        mntmExit.setBackground(new Color(0, 0, 0));
        mntmExit.addActionListener(this);
        mnExit.add(mntmExit);


        JMenu mnHelp = new JMenu("Help");
        mnHelp.setFont(new Font("Trebuchet MS", Font.BOLD, 17));


        JMenuItem mntmReadme = new JMenuItem("Read Me");
        mntmReadme.setBackground(new Color(211, 211, 211));
        mntmReadme.setForeground(new Color(105, 105, 105));
        mnHelp.add(mntmReadme);

        JMenuItem mntmAboutUs = new JMenuItem("About Us");
        mntmAboutUs.setForeground(new Color(105, 105, 105));
        mntmAboutUs.setBackground(new Color(211, 211, 211));
        mntmAboutUs.addActionListener(this);
        mnHelp.add(mntmAboutUs);

        JMenu mnMain = new JMenu("Main");
        mnMain.setFont(new Font("Trebuchet MS", Font.BOLD, 17));


        JMenuItem TeacherDetails = new JMenuItem("Teacher Details");
        TeacherDetails.addActionListener(this);
        TeacherDetails.setBackground(new Color(211, 211, 211));
        TeacherDetails.setForeground(Color.BLUE);
        mnMain.add(TeacherDetails);

        JMenuItem StudentDetails = new JMenuItem("Student Details");
        StudentDetails.setBackground(new Color(211, 211, 211));
        StudentDetails.setForeground(Color.BLUE);
        StudentDetails.addActionListener(this);
        mnMain.add(StudentDetails);

        JMenuItem GradeDetails = new JMenuItem("Grade Details");
        GradeDetails.setBackground(new Color(211, 211, 211));
        GradeDetails.setForeground(Color.BLUE);
        GradeDetails.addActionListener(this);
        mnMain.add(GradeDetails);

        menuBar.add(mnMain);
        menuBar.add(mnHelp);
        menuBar.add(mnExit);


        JLabel l1 = new JLabel("Institute Management System");
        l1.setForeground(new Color(20, 51, 200));
        l1.setFont(new Font("Segoe UI Semilight", Font.BOLD, 30));
        l1.setBounds(268, 30, 701, 80);
        contentPane.add(l1);

        JLabel l2 = new JLabel("");
        l2.setVerticalAlignment(SwingConstants.TOP);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/addteacher.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        l2 = new JLabel(i3);
        l2.setBounds(60, 140, 159, 152);
        contentPane.add(l2);

        JLabel l3 = new JLabel("");
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/marks.png"));
        Image i5 = i4.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        l3 = new JLabel(i6);
        l3.setBounds(320, 140, 134, 128);
        contentPane.add(l3);

        JLabel l4 = new JLabel("");
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/addstudent.jpeg"));
        Image i8 = i7.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        l4 = new JLabel(i9);
        l4.setBounds(530, 140, 225, 152);
        contentPane.add(l4);

        b1 = new JButton("Add Teacher");
        b1.addActionListener(this);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.BLACK);
        b1.setBounds(60, 320, 159, 44);
        contentPane.add(b1);

        b2 = new JButton("Add Grade");
        b2.addActionListener(this);
        b2.setBackground(Color.CYAN);
        b2.setForeground(Color.BLACK);
        b2.setBounds(313, 320, 139, 44);
        contentPane.add(b2);

        b3 = new JButton("Add Student");
        b3.addActionListener(this);
        b3.setBackground(Color.YELLOW);
        b3.setForeground(Color.BLUE);
        b3.setBounds(562, 320, 167, 44);
        contentPane.add(b3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(250, 128, 114), 2), "Operation", TitledBorder.LEADING,
                TitledBorder.TOP, null, new Color(220, 20, 60)));
        panel.setBounds(20, 120, 750, 260);
        panel.setBackground(Color.BLUE);
        contentPane.add(panel);

        b4 = new JButton("Student Details");
        b4.addActionListener(this);
        b4.setBackground(Color.YELLOW);
        b4.setForeground(Color.BLACK);
        b4.setBounds(76, 620, 143, 41);
        contentPane.add(b4);

        b5 = new JButton("Teacher Details");
        b5.addActionListener(this);
        b5.setBackground(Color.CYAN);
        b5.setForeground(Color.BLACK);
        b5.setBounds(310, 620, 159, 41);
        contentPane.add(b5);

        b6 = new JButton("FEES Report");
        b6.addActionListener(this);
        b6.setBackground(Color.RED);
        b6.setForeground(Color.BLACK);
        b6.setBounds(562, 620, 159, 41);
        contentPane.add(b6);

        JLabel l5 = new JLabel("");
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/student.jpeg"));
        Image i11 = i10.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        l5 = new JLabel(i12);
        l5.setBounds(60, 440, 159, 163);
        contentPane.add(l5);

        JLabel l6 = new JLabel("");
        ImageIcon i13 = new ImageIcon(ClassLoader.getSystemResource("icons/teacher.jpeg"));
        Image i14 = i13.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i15 = new ImageIcon(i14);
        l6 = new JLabel(i15);
        l6.setBounds(332, 440, 139, 152);
        contentPane.add(l6);

        JLabel l7 = new JLabel("");
        ImageIcon i16 = new ImageIcon(ClassLoader.getSystemResource("icons/abc.png"));
        Image i17 = i16.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
        ImageIcon i18 = new ImageIcon(i17);
        l7 = new JLabel(i18);
        l7.setBounds(562, 440, 157, 152);
        contentPane.add(l7);

        JPanel panel2 = new JPanel();
        panel2.setBorder(new TitledBorder(new LineBorder(new Color(205, 133, 63), 2), "Action", TitledBorder.LEADING,
                TitledBorder.TOP, null, new Color(233, 150, 122)));
        panel2.setBounds(20, 420, 750, 270);
        panel2.setBackground(Color.GREEN);
        contentPane.add(panel2);

        getContentPane().setBackground(Color.BLACK);
        contentPane.setBackground(Color.RED);
    }


    public void actionPerformed(ActionEvent ae) {
        String msg = ae.getActionCommand();
        if (msg.equals("Logout")) {
            setVisible(false);
            new Login().setVisible(true);
        } else if (msg.equals("Exit")) {
            System.exit(ABORT);

        } else if (msg.equals("Read Me")) {

        } else if (msg.equals("About Us")) {
            setVisible(false);
            new aboutproject().setVisible(true);

        } else if (msg.equals("Teacher Details")) {
            setVisible(false);
            new TeacherDetails().setVisible(true);
        } else if (msg.equals("Student Details")) {
            setVisible(false);
            new StudentDetails().setVisible(true);

        } else if (msg.equals("Grade Details")) {
            setVisible(false);
            new Gradedetails().setVisible(true);
        }

        if (ae.getSource() == b1) {
                this.setVisible(false);
                new AddTeacher().setVisible(true);
        }
        if (ae.getSource() == b2) {
                this.setVisible(false);
                new Studentgrade().setVisible(true);
        }
        if (ae.getSource() == b3) {
                this.setVisible(false);
                new AddStudent().setVisible(true);
        }
        if (ae.getSource() == b4) {
                this.setVisible(false);
                new StudentDetails().setVisible(true);
        }
        if (ae.getSource() == b5) {
                this.setVisible(false);
                new TeacherDetails().setVisible(true);

        }
            if (ae.getSource() == b6) {
                this.setVisible(false);
                new fee().setVisible(true);
            }

        }
    }

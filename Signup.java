import javax.swing.*;
//import javax.xml.validation.SchemaFactoryLoader;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
    JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7;
    JRadioButton r1, r2, r3, r4, r5;
    JButton b;
    JDateChooser dateChooser;

    Random r = new Random();
    long randNum = r.nextLong() % 9000 + 1000;
    String number = "" + Math.abs(randNum);

    public Signup() {
        setTitle("New Account Application Form");
        setLayout(null);

        l1 = new JLabel("Application Form:" + number);
        l1.setFont(new Font("Raleway", Font.BOLD, 40));
        l1.setBounds(150, 20, 600, 40);
        add(l1);

        l2 = new JLabel("Personal Details Of Customer");
        l2.setFont(new Font("Arial", Font.BOLD, 25));
        l2.setBounds(200, 80, 600, 30);
        add(l2);

        l3 = new JLabel("Your Name:");
        l3.setFont(new Font("Arial", Font.BOLD, 22));
        l3.setBounds(100, 130, 200, 30);
        add(l3);

        tf1 = new JTextField();
        tf1.setFont(new Font("Arial", Font.BOLD, 15));
        tf1.setBounds(305, 130, 300, 30);
        add(tf1);

        l4 = new JLabel("Father Name:");
        l4.setFont(new Font("Arial", Font.BOLD, 22));
        l4.setBounds(100, 180, 200, 30);
        add(l4);

        tf2 = new JTextField();
        tf2.setFont(new Font("Arial", Font.BOLD, 15));
        tf2.setBounds(305, 180, 300, 30);
        add(tf2);

        l5 = new JLabel("Date Of Birth:");
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        l5.setBounds(100, 230, 200, 30);
        add(l5);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(200, 0, 0));
        dateChooser.setBounds(305, 230, 200, 30);
        add(dateChooser);

        l6 = new JLabel("Gender:");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(100, 280, 200, 30);
        add(l6);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.BOLD, 14));
        r1.setBackground(Color.white);
        r1.setBounds(305, 280, 100, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.BOLD, 14));
        r2.setBackground(Color.white);
        r2.setBounds(410, 280, 100, 30);
        add(r2);

        ButtonGroup bgGender = new ButtonGroup();
        bgGender.add(r1);
        bgGender.add(r2);

        l7 = new JLabel("Email-Address:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        l7.setBounds(100, 330, 200, 30);
        add(l7);

        tf3 = new JTextField();
        tf3.setFont(new Font("Arial", Font.BOLD, 15));
        tf3.setBounds(305, 330, 300, 30);
        add(tf3);

        l8 = new JLabel("Marital-Status:");
        l8.setFont(new Font("Arial", Font.BOLD, 20));
        l8.setBounds(100, 370, 200, 30);
        add(l8);

        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Tahoma", Font.BOLD, 14));
        r3.setBackground(Color.white);
        r3.setBounds(305, 370, 100, 30);
        add(r3);

        r4 = new JRadioButton("Un-Married");
        r4.setFont(new Font("Tahoma", Font.BOLD, 14));
        r4.setBackground(Color.white);
        r4.setBounds(410, 370, 120, 30);
        add(r4);

        r5 = new JRadioButton("Others");
        Font f1 = new Font("Tahoma", Font.BOLD, 14);
        r5.setFont(f1);
        r5.setBackground(Color.white);
        r5.setBounds(535, 370, 100, 30);
        add(r5);

        ButtonGroup bgStatus = new ButtonGroup();
        bgStatus.add(r3);
        bgStatus.add(r4);
        bgStatus.add(r5);

        l9 = new JLabel("Address:");
        l9.setFont(new Font("Arial", Font.BOLD, 20));
        l9.setBounds(100, 410, 200, 30);
        add(l9);

        tf4 = new JTextField();
        tf4.setFont(new Font("Arial", Font.BOLD, 15));
        tf4.setBounds(305, 410, 300, 30);
        add(tf4);

        l10 = new JLabel("City:");
        l10.setFont(new Font("Arial", Font.BOLD, 20));
        l10.setBounds(100, 460, 200, 30);
        add(l10);

        tf5 = new JTextField();
        tf5.setFont(new Font("Arial", Font.BOLD, 15));
        tf5.setBounds(305, 460, 300, 30);
        add(tf5);

        l11 = new JLabel("Pin-Code:");
        l11.setFont(new Font("Arial", Font.BOLD, 20));
        l11.setBounds(100, 510, 200, 30);
        add(l11);

        tf6 = new JTextField();
        tf6.setFont(new Font("Arial", Font.BOLD, 15));
        tf6.setBounds(305, 510, 300, 30);
        add(tf6);

        l12 = new JLabel("State:");
        l12.setFont(new Font("Arial", Font.BOLD, 20));
        l12.setBounds(100, 560, 200, 30);
        add(l12);

        tf7 = new JTextField();
        tf7.setFont(new Font("Arial", Font.BOLD, 15));
        tf7.setBounds(305, 560, 300, 30);
        add(tf7);

        b = new JButton("Next");
        b.setFont(f1);
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setBounds(600, 600, 80, 30);
        add(b);
        b.addActionListener(this);

        l13 = new JLabel("Date:");
        l13.setFont(new Font("Arial", Font.BOLD, 14));
        l13.setBounds(100, 610, 200, 30);
        add(l13);

        l14 = new JLabel("Month:");
        l14.setFont(new Font("Arial", Font.BOLD, 14));
        l14.setBounds(100, 660, 200, 30);
        add(l14);

        l15 = new JLabel("Year:");
        l15.setFont(new Font("Arial", Font.BOLD, 14));
        l15.setBounds(100, 720, 200, 30);
        add(l15);

        getContentPane().setBackground(Color.pink);
        setVisible(true);
        setSize(800, 700);
        setLocation(400, 100);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Signup obj = new Signup();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNum = number;
        String name = tf1.getText();
        String fname = tf2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = tf3.getText();
        String maritalStatus = null;
        if (r3.isSelected()) {
            maritalStatus = "Married";
        } else if (r4.isSelected()) {
            maritalStatus = "Un-Married";
        } else if (r5.isSelected()) {
            maritalStatus = "Others";
        }
        String address = tf4.getText();
        String city = tf5.getText();
        String pincode = tf6.getText();
        String state = tf7.getText();

        try {
            if (tf1.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter your name");
            }
            /*
             * if(tf2.getText().equals("")) {
             * JOptionPane.showMessageDialog(null, "Please enter your  father name");
             * }
             */
            else {
                ConnectionFactory cf = new ConnectionFactory();
                String query = "insert into signup values('" + formNum + "','" + name + "','" + fname + "','" + dob
                        + "','" + gender + "','" + email + "','" + maritalStatus + "','" + address + "','" + city
                        + "','" + pincode + "','" + state + "')";
                cf.stmt.executeUpdate(query);

                // JOptionPane.showMessageDialog(null,"Congrates");
                setVisible(false);
                new SignupTwo(formNum).setVisible(true);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

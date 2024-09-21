import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//import java.util.Random;

public class SignupTwo extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14, l15;
    JTextField tfPan, tfAadhar;
    JRadioButton rbnCitizenYes, rbnCitizenNo, rbnAccountYes, rbnAccountNo, rbnOthers;
    JComboBox jcbReligion, jcbCategory, jcbIncome, jcbEducation, jcbOccupation;
    JButton b;

    String formno = "";

    public SignupTwo(String formno) {
        this.formno = formno;
        setTitle("New Account Application Form-Page-2");
        setLayout(null);

        l2 = new JLabel("Additional Details Of Customer");
        l2.setFont(new Font("Arial", Font.BOLD, 25));
        l2.setBounds(200, 80, 600, 30);
        add(l2);

        l3 = new JLabel("Religion:");
        l3.setFont(new Font("Arial", Font.BOLD, 22));
        l3.setBounds(100, 130, 200, 30);
        add(l3);

        String[] religion = { "Hindu", "Muslim", "Sikh", "Christian", "Other" };
        jcbReligion = new JComboBox(religion);
        jcbReligion.setBackground(Color.white);
        jcbReligion.setFont(new Font("Arial", Font.BOLD, 15));
        jcbReligion.setBounds(305, 130, 300, 30);
        add(jcbReligion);

        l4 = new JLabel("Category:");
        l4.setFont(new Font("Arial", Font.BOLD, 22));
        l4.setBounds(100, 180, 200, 30);
        add(l4);

        String[] category = { "General", "OBC", "ST", "SC", "Other" };
        jcbCategory = new JComboBox(category);
        jcbCategory.setBackground(Color.white);
        jcbCategory.setFont(new Font("Arial", Font.BOLD, 15));
        jcbCategory.setBounds(305, 180, 300, 30);
        add(jcbCategory);

        l5 = new JLabel("Income:");
        l5.setFont(new Font("Arial", Font.BOLD, 20));
        l5.setBounds(100, 230, 200, 30);
        add(l5);

        String[] income = { "Null", "<1,50,000", "<2,50,000", "<5,00,000", "Other" };
        jcbIncome = new JComboBox(income);
        jcbIncome.setBackground(Color.white);
        jcbIncome.setBounds(305, 230, 200, 30);
        add(jcbIncome);

        l6 = new JLabel("Educational");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(100, 280, 200, 30);
        add(l6);

        l7 = new JLabel("Qualification:");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        l7.setBounds(100, 311, 200, 30);
        add(l7);

        String[] education = { "Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other" };
        jcbEducation = new JComboBox(education);
        jcbEducation.setBackground(Color.white);
        jcbEducation.setFont(new Font("Arial", Font.BOLD, 15));
        jcbEducation.setBounds(305, 311, 300, 30);
        add(jcbEducation);

        l8 = new JLabel("Occupation:");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        l8.setBounds(100, 370, 200, 30);
        add(l8);

        String[] occupation = { "Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other" };
        jcbOccupation = new JComboBox(occupation);
        jcbOccupation.setBackground(Color.white);
        jcbOccupation.setFont(new Font("Raleway", Font.BOLD, 15));
        jcbOccupation.setBounds(305, 370, 200, 30);
        add(jcbOccupation);

        l9 = new JLabel("Pan Number:");
        l9.setFont(new Font("Arial", Font.BOLD, 20));
        l9.setBounds(100, 410, 200, 30);
        add(l9);

        tfPan = new JTextField();
        tfPan.setFont(new Font("Arial", Font.BOLD, 15));
        tfPan.setBounds(305, 410, 300, 30);
        add(tfPan);

        l10 = new JLabel("Aadhar Number:");
        l10.setFont(new Font("Arial", Font.BOLD, 20));
        l10.setBounds(100, 460, 200, 30);
        add(l10);

        tfAadhar = new JTextField();
        tfAadhar.setFont(new Font("Arial", Font.BOLD, 15));
        tfAadhar.setBounds(305, 460, 300, 30);
        add(tfAadhar);

        l11 = new JLabel("Senior Citizen:");
        l11.setFont(new Font("Arial", Font.BOLD, 20));
        l11.setBounds(100, 510, 200, 30);
        add(l11);

        rbnCitizenYes = new JRadioButton("Yes");
        rbnCitizenYes.setFont(new Font("Tahoma", Font.BOLD, 14));
        rbnCitizenYes.setBackground(Color.white);
        rbnCitizenYes.setBounds(305, 510, 100, 30);
        add(rbnCitizenYes);

        rbnCitizenNo = new JRadioButton("No");
        rbnCitizenNo.setFont(new Font("Tahoma", Font.BOLD, 14));
        rbnCitizenNo.setBackground(Color.white);
        rbnCitizenNo.setBounds(410, 510, 100, 30);
        add(rbnCitizenNo);

        ButtonGroup bgGender = new ButtonGroup();
        bgGender.add(rbnCitizenYes);
        bgGender.add(rbnCitizenNo);

        l12 = new JLabel("Existing Account :");
        l12.setFont(new Font("Arial", Font.BOLD, 20));
        l12.setBounds(100, 560, 200, 30);
        add(l12);

        rbnAccountYes = new JRadioButton("Yes");
        Font f = new Font("Tahoma", Font.BOLD, 14);
        rbnAccountYes.setFont(f);
        rbnAccountYes.setBackground(Color.white);
        rbnAccountYes.setBounds(305, 560, 100, 30);
        add(rbnAccountYes);

        rbnAccountNo = new JRadioButton("No");
        rbnAccountNo.setFont(f);
        rbnAccountNo.setBackground(Color.white);
        rbnAccountNo.setBounds(410, 560, 100, 30);
        add(rbnAccountNo);

        ButtonGroup bgStatus = new ButtonGroup();
        bgStatus.add(rbnAccountYes);
        bgStatus.add(rbnAccountNo);

        b = new JButton("Next");
        b.setFont(f);
        b.setBackground(Color.black);
        b.setForeground(Color.white);
        b.setBounds(600, 600, 80, 30);
        add(b);
        b.addActionListener(this);

        getContentPane().setBackground(Color.pink);
        setVisible(true);
        setSize(800, 700);
        setLocation(400, 100);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SignupTwo obj = new SignupTwo("");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String religion = (String) jcbReligion.getSelectedItem();
        String category = (String) jcbCategory.getSelectedItem();
        String income = (String) jcbIncome.getSelectedItem();
        String education = (String) jcbEducation.getSelectedItem();
        String occupation = (String) jcbOccupation.getSelectedItem();
        String pan = tfPan.getText();
        String aadhar = tfAadhar.getText();
        String scitizen = "";
        if (rbnCitizenYes.isSelected()) {
            scitizen = "yes";
        } else if (rbnCitizenNo.isSelected()) {
            scitizen = "No";
        }
        String eaccount = "";
        if (rbnAccountYes.isSelected()) {
            eaccount = "yes";
        } else if (rbnAccountNo.isSelected()) {
            eaccount = "No";

        }
        try {
            ConnectionFactory cf = new ConnectionFactory();
            String query = "insert into signuptwo values('" + formno + "','" + religion + "','" + category + "','"
                    + income + "','" + education + "','" + occupation + "','" + pan + "','" + aadhar + "','" + scitizen
                    + "','" + eaccount + "')";
            cf.stmt.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Congrates");
            new SignupThree(formno).setVisible(true);
            setVisible(false);

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }
}

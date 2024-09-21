import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener {
    JLabel lblWelcome, lblCardNumber, lblPinNumber;
    JTextField tfCardNumber;
    JPasswordField pfPinNumber;
    JButton btnLogin, btnClear, btnSignup;

    login() {
        setTitle("Bank Management System");
        setLayout(null);

        lblWelcome = new JLabel("Welcome To Bank System");
        lblWelcome.setFont(new Font("Arial", Font.BOLD, 35));
        lblWelcome.setBounds(200, 40, 530, 40);
        add(lblWelcome);

        lblCardNumber = new JLabel("Enter Card No.");
        lblCardNumber.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblCardNumber.setBounds(120, 150, 400, 30);
        add(lblCardNumber);

        tfCardNumber = new JTextField(20);
        tfCardNumber.setBounds(350, 150, 230, 30);
        tfCardNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(tfCardNumber);

        lblPinNumber = new JLabel("Enter Pin No.");
        lblPinNumber.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblPinNumber.setBounds(120, 250, 400, 30);
        add(lblPinNumber);

        pfPinNumber = new JPasswordField(20);
        pfPinNumber.setBounds(350, 250, 230, 30);
        pfPinNumber.setFont(new Font("Tahoma", Font.BOLD, 15));
        add(pfPinNumber);

        btnLogin = new JButton("Login");
        btnLogin.setBackground(Color.black);
        btnLogin.setForeground(Color.WHITE);

        btnClear = new JButton("Clear");
        btnClear.setBackground(Color.black);
        btnClear.setForeground(Color.WHITE);

        btnSignup = new JButton("Sign Up");
        btnSignup.setBackground(Color.black);
        btnSignup.setForeground(Color.WHITE);

        btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnLogin.setBounds(300, 300, 100, 40);
        add(btnLogin);

        btnClear.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnClear.setBounds(400, 300, 100, 40);
        add(btnClear);

        btnSignup.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnSignup.setBounds(500, 300, 100, 40);
        add(btnSignup);

        btnLogin.addActionListener(this);
        btnClear.addActionListener(this);
        btnSignup.addActionListener(this);

        getContentPane().setBackground(new Color(255, 255, 204));
        setVisible(true);
        setSize(800, 500);
        setLocation(400, 200);
    }

    public static void main(String[] args) {
        login obj = new login();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // TODO Auto-generated method stub
        try {
            if (ae.getSource() == btnLogin) {
                ConnectionFactory cf = new ConnectionFactory();
                String cardNum = tfCardNumber.getText();
                String pin = pfPinNumber.getText();
                String query = "Select * from Login where cardnumber='" + cardNum + "' and pin='" + pin + "'";
                ResultSet rs = cf.stmt.executeQuery(query);
                if (rs.next()) {
                    setVisible(false);
                    new Transaction(pin).setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Either CardNum or Pin Number is Wrong");
                }

            }

            else if (ae.getSource() == btnClear) {
                tfCardNumber.setText("");
                pfPinNumber.setText("");

            }

            else if (ae.getSource() == btnSignup) {
                this.setVisible(false);
                new Signup();

            }
        } catch (Exception e) {

        }

    }

}

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import javax.management.loading.ClassLoaderRepository;
import javax.swing.*;

public class Transaction extends JFrame implements ActionListener {
    JLabel l1;
    JButton b1, b2, b3, b4, b5, b6, btnExit;
    String pin;

    public Transaction(String pin) {
        setTitle("Transaction Page");
        this.pin = pin;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("photos/next1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(960, 1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel lblImage = new JLabel(i3);
        lblImage.setBounds(0, 0, 960, 1000);
        add(lblImage);

        l1 = new JLabel("Please Select Your Transaction");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("Tahoma", Font.BOLD, 18));
        l1.setBounds(230, 300, 700, 35);
        add(l1);
        // lblImage.add(l1);

        b1 = new JButton("Deposit");
        b2 = new JButton("WITHDRAWL");
        b3 = new JButton("FAST CASH");
        b4 = new JButton("Mini Statement");
        b5 = new JButton("PIN Change");
        b6 = new JButton("Balance Check");
        btnExit = new JButton("Exit");

        b1.setBounds(170, 400, 150, 35);
        // lblImage.add(b1);
        add(b1);

        b2.setBounds(390, 400, 150, 35);
        // lblImage.add(b1);
        add(b2);

        b3.setBounds(170, 450, 150, 35);
        // lblImage.add(b3);
        add(b3);

        b4.setBounds(390, 450, 150, 35);
        // lblImage.add(b4);
        add(b4);

        b5.setBounds(170, 500, 150, 35);
        // lblImage.add(b5);
        add(b5);

        b6.setBounds(390, 500, 150, 35);
        // lblImage.add(b6);
        add(b6);

        btnExit.setBounds(390, 550, 150, 35);
        // lblImage.add(btnExit);
        add(btnExit);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        btnExit.addActionListener(this);

        setSize(960, 1000);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Transaction("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnExit) {
            System.exit(0);
        } else if (ae.getSource() == b1) {
            setVisible(false);
            new Deposit(pin).setVisible(true);
        } else if (ae.getSource() == b2) {
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
        } else if (ae.getSource() == b3) {
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }

    }

}

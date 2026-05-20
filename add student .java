package studentmanagement;

import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {

    JLabel l1, l2;
    JTextField tf1;
    JPasswordField pf1;
    JButton b1;

    Login() {

        setTitle("Student Management System");

        l1 = new JLabel("Username");
        l2 = new JLabel("Password");

        tf1 = new JTextField();
        pf1 = new JPasswordField();

        b1 = new JButton("Login");

        l1.setBounds(50, 50, 100, 30);
        l2.setBounds(50, 100, 100, 30);

        tf1.setBounds(150, 50, 150, 30);
        pf1.setBounds(150, 100, 150, 30);

        b1.setBounds(120, 170, 100, 40);

        add(l1);
        add(l2);
        add(tf1);
        add(pf1);
        add(b1);

        b1.addActionListener(this);

        setSize(400, 300);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String username = tf1.getText();
        String password = pf1.getText();

        if(username.equals("admin") && password.equals("admin123")) {

            JOptionPane.showMessageDialog(this, "Login Successful");

            new AddStudent();

            dispose();

        } else {

            JOptionPane.showMessageDialog(this, "Invalid Username or Password");
        }
    }
}

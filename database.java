package studentmanagement;

import javax.swing.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddStudent extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5;

    JTextField tf1, tf2, tf3, tf4, tf5;

    JButton b1;

    AddStudent() {

        setTitle("Add Student");

        l1 = new JLabel("Student ID");
        l2 = new JLabel("Name");
        l3 = new JLabel("Department");
        l4 = new JLabel("Year");
        l5 = new JLabel("Phone");

        tf1 = new JTextField();
        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        tf5 = new JTextField();

        b1 = new JButton("Save");

        l1.setBounds(50, 50, 100, 30);
        l2.setBounds(50, 100, 100, 30);
        l3.setBounds(50, 150, 100, 30);
        l4.setBounds(50, 200, 100, 30);
        l5.setBounds(50, 250, 100, 30);

        tf1.setBounds(170, 50, 150, 30);
        tf2.setBounds(170, 100, 150, 30);
        tf3.setBounds(170, 150, 150, 30);
        tf4.setBounds(170, 200, 150, 30);
        tf5.setBounds(170, 250, 150, 30);

        b1.setBounds(130, 320, 100, 40);

        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);

        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(tf5);

        add(b1);

        b1.addActionListener(this);

        setSize(450, 450);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        try {

            Connection con = DBConnection.getConnection();

            String query = "INSERT INTO students VALUES (?, ?, ?, ?, ?)";

            PreparedStatement pst = con.prepareStatement(query);

            pst.setInt(1, Integer.parseInt(tf1.getText()));
            pst.setString(2, tf2.getText());
            pst.setString(3, tf3.getText());
            pst.setInt(4, Integer.parseInt(tf4.getText()));
            pst.setString(5, tf5.getText());

            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Student Added Successfully");

        } catch (Exception ex) {

            System.out.println(ex);
        }
    }
}

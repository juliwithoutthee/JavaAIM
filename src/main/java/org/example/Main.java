package org.example;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main implements ActionListener { //GUI
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton loginButton;
    private static JLabel success;

    public static void main (String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,1080);
        frame.setTitle("Sign On");
        frame.add(panel);
        frame.setBackground(Color.blue);
        ImageIcon aimWindow = new ImageIcon("./images/windowAIM.png");
        frame.setIconImage(aimWindow.getImage());

        panel.setLayout(null);

        userLabel = new JLabel("ScreenName");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(10,80,80,25);
        loginButton.addActionListener(new Main());
        panel.add(loginButton);

        success = new JLabel();
        success.setBounds(10,110,300,25);
        panel.add(success);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();

        if(user.equals("ninjulitotoro") && password.equals("juliwashere")) {
            success.setText("Login Successful!");
        System.out.println("Login Successful!");
    }
}}
package org.example;
import java.awt.event.*;
import javax.swing.*;

public class Main { //GUI


    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,1080);
        frame.setTitle("AIM");
        frame.add(panel);

        ImageIcon aimWindow = new ImageIcon("./AIM/images/windowAIM.png");
        frame.setIconImage(aimWindow.getImage());

        panel.setLayout(null);

        JLabel label = new JLabel("ScreenName");
        label.setBounds(10, 20, 80, 25);
        panel.add(label);

        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JTextField passwordText = new JTextField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10,80,80,25);
        panel.add(loginButton);

        frame.setVisible(true);
    }
}
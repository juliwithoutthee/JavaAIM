package org.example;

import javax.swing.*;
import java.awt.*;

public class ButtonExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button Example");
        JButton b = new JButton("Click Here");
        b.setBounds(50, 100, 100, 30);
        f.add(b);
        f.setSize(9020, 1080);
        f.setTitle("Yo");
        f.setBackground(Color.blue);
        f.setLayout(null);
        f.setVisible(true);
    }
}


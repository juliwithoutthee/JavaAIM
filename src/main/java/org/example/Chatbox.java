package org.example;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Chatbox extends JFrame{
    private JTextArea chatArea = new JTextArea();
    private JTextField chatbox = new JTextField();
    public Chatbox(){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setTitle("AIM Chat");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setSize(600,600);
        frame.add(chatbox);
        frame.add(chatArea);

        chatArea.setSize(500,400);
        chatArea.setLocation(2,2);

        chatbox.setSize(540,30);
        chatbox.setLocation(2,500);
        chatbox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String text = chatbox.getText();
            chatArea.append( "ninjulitotoro: " + text+ "\n");
            chatbox.setText("");
            if (text.contains("hi")){
                bot("Hello There.");
            }else{
                int rand = (int) (Math.random() * 8);
                switch (rand) {
                    case 1: bot("I do not understand what you are saying.");
                    case 2: bot( "Yo!");
                    case 3: bot( "What's so funny?");
                    case 4: bot( "Ok, enough of this nonsense.");
                    case 5: bot( "?");
                    case 6: bot( "What problem does this solve?");
                    case 7: bot( "How are you today?");
                    case 8: bot( "What would you like to talk about?");
                }
            }

            }
        });
    }
    private void bot (String string) {
        chatArea.append("SmartererChild:" + string + "\n");
    }
    public static void main (String[] args){
        new Chatbox();
        
    }
}

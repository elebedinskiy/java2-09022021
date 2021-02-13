package ru.geekbrains.java2;

import javax.swing.*;
import java.awt.*;

public class ChatWindow extends JFrame {

    ChatWindow(){
        setTitle("Chat window");
        setSize(600, 400);
        setResizable(false);
        setLocation(600,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        JTextField textField = new JTextField();
        JButton button = new JButton("Send");

        add(textArea, BorderLayout.CENTER);

        JPanel panel = new JPanel(new GridLayout(1,4,1,0));
        panel.add(textField);
        panel.add(button);
        add(panel, BorderLayout.SOUTH);

        setVisible(true);

    }
}

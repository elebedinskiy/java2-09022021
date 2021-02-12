package ru.geekbrains.java2;

import javax.swing.*;

public class ChatWindow extends JFrame {

    ChatWindow(){
        setTitle("Chat window");
        setSize(600, 400);
        setResizable(false);
        setLocation(600,400);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        JTextField textField = new JTextField();
        JButton button = new JButton("Ок");



    }
}

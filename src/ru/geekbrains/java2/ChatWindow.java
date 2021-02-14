package ru.geekbrains.java2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame {

    ChatWindow(){
        setTitle("Chat window");
        setSize(600, 400);
        setMinimumSize(new Dimension(400,300));
        setLocation(600,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JTextField textField = new JTextField();
        JButton button = new JButton("Send");
        JButton button2 = new JButton("Clear");
        JButton button3 = new JButton("Exit");

        add(textArea, BorderLayout.CENTER);

        JPanel panelButton = new JPanel(new GridLayout(1,3,1,0));
        panelButton.add(button);
        panelButton.add(button2);
        panelButton.add(button3);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(textField, BorderLayout.CENTER);
        panel.add(panelButton, BorderLayout.LINE_END);
        add(panel, BorderLayout.SOUTH);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(textField.getText() + "\n");
                textField.setText("");
            }
        });

        textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append(textField.getText() + "\n");
                textField.setText("");
            }
        });

        setVisible(true);

    }

}

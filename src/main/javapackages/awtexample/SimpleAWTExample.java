package main.javapackages.awtexample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleAWTExample {
    public static void main(String[] args) {
        Frame frame = new Frame("Simple AWT Example");

        Button button = new Button("Click Me");

        frame.add(button);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        frame.setSize(300, 300);
        frame.setVisible(true);

        frame.setSize(300, 300);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button.setLabel("Clicked!");
            }
        });
    }
}
package main.javapackages.awtexample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SimpleAWTExample {
    public static void main(String[] args) {
        // Create a frame (window)
        Frame frame = new Frame("Simple AWT Example");

        // Create a button
        Button button = new Button("Click Me");

        // Add the button to the frame
        frame.add(button);

        // Set up a window listener to handle window events
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        // Set the frame size and make it visible
        frame.setSize(300, 300);
        frame.setVisible(true);

        // Add an action listener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button.setLabel("Clicked!");
            }
        });
    }
}
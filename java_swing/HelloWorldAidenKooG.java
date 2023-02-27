package java_swing;

import javax.swing.*;
import java.awt.*;

public class HelloWorldAidenKooG {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Hello");

        // set frame site
        frame.setMinimumSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // center the JLabel
        JLabel contentLabel = new JLabel("Hello World! AidenKooG!", SwingConstants.CENTER);

        // add JLabel to JFrame
        frame.getContentPane().add(contentLabel);

        // display it
        frame.pack();
        frame.setVisible(true);

    }
}
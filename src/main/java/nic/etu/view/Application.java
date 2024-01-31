package nic.etu.view;

import javax.swing.*;

public class Application extends JFrame {
    public Application() {
        super("Hex editor");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 800);
        setLocationRelativeTo(null);

        setVisible(true);
    }
}

package nic.etu;

import nic.etu.view.Application;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Application::new);
    }
}
package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        Welcome welcome = new Welcome();
        welcome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container content = welcome.getContentPane();
        Color myColor = new Color(128, 128, 128, 255);
        content.setBackground(myColor);
        welcome.setVisible(true);
        welcome.setSize(600, 500);
    }
}
package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame { // 'extends' means we're 'sharing' the properties defined in the Main class (e.g, BgColor, size etc.)
    private JLabel header;
    private JButton bookFlight, about_us, login, register; //creating object of JLabel and JButton

    public Welcome(){
        setTitle("Flight Connect"); //setting the title of the frame
        setLayout(new FlowLayout()); //setting a horizontal layout

//      setting size of the JFrame
        setPreferredSize(new Dimension(820,600));
        setMinimumSize(new Dimension(550, 350));
        setMaximumSize(new Dimension(830,600));
        setResizable(false);

        header = new JLabel("<html><span style='color: white;'><br><br><br>Flight Reservation System!<br><br></span></html>");
        header.setFont(header.getFont().deriveFont(40.0f));
        header.setBounds(220, 5, 150, 40);
        add(header);
        //adding the buttons to the frame
        about_us = new JButton("About Us");

        bookFlight = new JButton("Book A Flight");
        add(bookFlight);



//      calling the class "aboutUs" by adding an action listener to the button "about_us"
        about_us.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

//      calling the classes by adding action listeners to the buttons

        bookFlight.addActionListener(e -> {
            userDetails det = new userDetails();
            Container content = det.getContentPane();
            Color mycolor = new Color(168, 164, 162, 255);
            det.setSize(700, 750);
            content.setBackground(mycolor);
            content.setLayout(new GridLayout(0, 1));
            det.setVisible(true);
        });
    }
}
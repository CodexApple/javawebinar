package me.ghostfenrir.gui.panels;

import me.ghostfenrir.gui.components.CustomButton;
import me.ghostfenrir.gui.components.CustomLabel;

import javax.swing.*;
import java.awt.*;

public class NavigationPanel extends JPanel {
    public NavigationPanel() {
        setLayout(null);

        add(addBtn);
        add(viewBtn);
        add(homeBtn);
        add(logoLabel);
        add(logoDesc);

        setBounds(0, 0, 225, 720);
        setBackground(new Color(18, 35, 83));
        setVisible(true);
    }

    public JTextField jTextField = new JTextField(25);
    public CustomButton addBtn = new CustomButton("Add Record", 40, 175, 150, 50, Color.WHITE, false, "Verdana", 16);
    public CustomButton viewBtn = new CustomButton("View Record", 40, 235, 150, 50, Color.WHITE, false, "Verdana", 16);
    public CustomButton homeBtn = new CustomButton("Homepage", 40, 115, 150, 50, Color.WHITE, false, "Verdana", 16);
    public JLabel logoLabel = new CustomLabel("Lorem Ipsum", 50, 20, 1280, 50, Color.WHITE, "Verdana", 21);
    public JLabel logoDesc = new CustomLabel("Lorem Ipsum lorem ipsum", 30, 620, 1280, 50, Color.WHITE, "Verdana", 12);

}

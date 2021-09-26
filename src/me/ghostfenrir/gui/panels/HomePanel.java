package me.ghostfenrir.gui.panels;

import me.ghostfenrir.gui.components.CustomLabel;

import javax.swing.*;
import java.awt.*;

public class HomePanel extends JPanel {
    public HomePanel() {
        setLayout(null);
        add(label);

        setBounds(0, 0, 1280, 720);
        setBackground(new Color(8, 21, 56));
        setVisible(true);
    }

    private CustomLabel label = new CustomLabel("Inventory Management System", 1055 / 2 + 50, 10, 1280, 50, Color.WHITE,"Verdana", 21);
}

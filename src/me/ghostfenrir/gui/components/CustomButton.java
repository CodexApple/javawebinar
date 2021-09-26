package me.ghostfenrir.gui.components;

import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    public CustomButton(String title, int x, int y, int width, int height, Color color, boolean b, String font, int fontSize) {
        super(title);
        setBounds(x, y, width, height);
        setContentAreaFilled(b);
        setForeground(color);
        setFont(new Font(font, Font.PLAIN, fontSize));
        setFocusable(false);
    }

    public CustomButton(String title, int x, int y, Color color, boolean b, String font, int fontSize) {
        super(title);
        setBounds(x, y, 150, 50);
        setContentAreaFilled(b);
        setForeground(color);
        setFont(new Font(font, Font.PLAIN, fontSize));
        setFocusable(false);
    }
}

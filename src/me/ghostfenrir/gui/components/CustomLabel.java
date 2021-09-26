package me.ghostfenrir.gui.components;

import me.ghostfenrir.handlers.StringHandler;

import javax.swing.*;
import java.awt.*;

public class CustomLabel extends JLabel {
    public CustomLabel(String labelText) {
        super(labelText);
    }

    public CustomLabel(int x, int y, int width, int height) {
        setBounds(x, y, width, height);
    }

    public CustomLabel(String labelText, int x, int y, int width, int height, Color color) {
        super(labelText);
        setBounds(x, y, width, height);
        setForeground(color);
    }

    public CustomLabel(String labelText, int x, int y, int width, int height, Color color, String fontName, int fontSize) {
        super(labelText);
        setBounds(x, y, width, height);
        setForeground(color);
        setFont(new Font(fontName, Font.PLAIN, fontSize));
    }
}

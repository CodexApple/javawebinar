package me.ghostfenrir.gui;

import me.ghostfenrir.gui.panels.HomePanel;
import me.ghostfenrir.gui.panels.NavigationPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame implements ActionListener {
    public MainFrame() {
        super("Java Summer Tutorial");
        getContentPane().add(navPanel);
        getContentPane().add(homePanel);

        registerAction();

        setVisible(true);
        setSize(screen_x, screen_y);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void registerAction() {
        navPanel.addBtn.addActionListener(this);
        navPanel.homeBtn.addActionListener(this);
        navPanel.viewBtn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == navPanel.addBtn) {
            System.out.println("Add button Pressed");
        }

        if (e.getSource() == navPanel.homeBtn) {
            System.out.println("Home button Pressed");
        }

        if (e.getSource() == navPanel.viewBtn) {
            System.out.println("View button Pressed");
        }
    }

    private Boolean isAdmin() {
        return getAccount().equalsIgnoreCase("admin");
    }

    private String getAccount() {
        return JOptionPane.showInputDialog(null, "Please Login Account", "Login", JOptionPane.PLAIN_MESSAGE);
    }

    private static final int screen_x = 1280, screen_y = 720;
    private static final HomePanel homePanel = new HomePanel();
    private static final NavigationPanel navPanel = new NavigationPanel();
}
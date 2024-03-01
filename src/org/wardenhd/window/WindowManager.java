package org.wardenhd.window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class WindowManager {
    final JFrame frame;

    public WindowManager(JFrame frame) {
        this.frame = frame;
    }

    public void createWindow() {
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addComponents();
        frame.setPreferredSize(new Dimension(320, 200));
        frame.pack();
        frame.setVisible(true);

    }

    private void addComponents() {
        Container frameContentPane = frame.getContentPane();

        JButton addButton = new JButton("ADD");
        frameContentPane.add(addButton, BorderLayout.AFTER_LAST_LINE);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}

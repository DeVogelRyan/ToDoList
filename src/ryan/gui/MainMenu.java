package ryan.gui;

import ryan.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu {

    public MainMenu(){
        JFrame menu = new JFrame("Menu");
        FlowLayout layout = new FlowLayout();
        menu.setLayout(layout);
        JButton createItem = new JButton("Create Items");
        createItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.dispose();
                CreateItems createItems = new CreateItems();
            }
        });
        JButton viewItem = new JButton("View Items");
        viewItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.dispose();
                ViewItems items = new ViewItems();
            }
        });
        menu.add(createItem);
        menu.add(viewItem);
        menu.pack();
        menu.setVisible(true);
    }
}

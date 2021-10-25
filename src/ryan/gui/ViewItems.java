package ryan.gui;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import ryan.ReadFile;

import javax.swing.*;
import java.awt.*;

public class ViewItems {

    public ViewItems(){
        JFrame view = new JFrame("View items");
        //view.setResizable(false);
        Insets margins = new Insets(25, 0, 25, 0);
        ReadFile readFile = new ReadFile();
        JSONArray list = readFile.getData();
        view.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.insets = margins;
        System.out.println(list.toArray().length);
        for(Object item: list){
            JSONObject jsonLineItem = (JSONObject) item;
            String key = jsonLineItem.get("issue").toString();
            //System.out.println(list.toArray().length);
            System.out.println(key);
            JPanel panel = new JPanel();
            panel.setBackground(Color.WHITE);
            JLabel label = new JLabel(key);
            JLabel xd = new JLabel("xddddddddddd");
            panel.add(label);
            panel.add(xd);
            view.add(panel, gbc);
        }
        view.pack();
        view.setVisible(true);
    }
}

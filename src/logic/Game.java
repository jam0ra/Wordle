package logic;

import ui.Word;

import javax.swing.*;
import java.awt.*;

public class Game {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel window = new JPanel(new GridLayout(5, 1, 0, 10));
        for (int i = 0; i < 5; i++){
            window.add(new Word());
        }
        window.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(window);
        frame.pack();
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}

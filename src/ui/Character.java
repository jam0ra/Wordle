package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Character extends JTextField {
    public Character(String text){
        super(String.format(" %s ", text));
        setFont(new Font("SansSerif", Font.BOLD, 50));
        setHorizontalAlignment(JTextField.CENTER);
        setCaretColor(Color.WHITE);
        addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                selectAll();
            }

            @Override
            public void focusLost(FocusEvent e) {

            }
        });
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE){
                    e.getComponent().transferFocusBackward();
                } else if (e.getKeyCode() != KeyEvent.VK_ENTER){
                    e.getComponent().transferFocus();
                }
            }
        });
    }
}

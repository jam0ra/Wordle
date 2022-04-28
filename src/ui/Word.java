package ui;

import javax.swing.*;
import java.awt.*;

public class Word extends JPanel {

    public Word(){
        super(new GridLayout(1, 5, 10, 0));
        for (int i = 1; i <= 5; i++){
            add(new Character(" "));
        }
    }

    public boolean checkWin(String answer){
        String guess = "";
        for (int i = 0; i < 5; i++){
            guess = guess.concat(((JTextField) getComponent(i)).getText());
        }
        System.out.println(guess);
        return false;
    }
}

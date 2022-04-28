package logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        try {
            File f = new File("src/words.txt");
            Scanner input = new Scanner(f);
            ArrayList<String> words = new ArrayList<>();
            while (input.hasNext()){
                words.add(input.nextLine());
            }
            for (String s: words){
                System.out.println(s);
            }
            input.close();
        } catch (FileNotFoundException e){
            System.out.println("File not found.");
            e.printStackTrace();
        }

    }
}

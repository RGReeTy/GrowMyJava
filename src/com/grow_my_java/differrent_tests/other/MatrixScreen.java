package com.grow_my_java.differrent_tests.other;

import java.awt.*;
import java.util.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MatrixScreen extends JFrame {

    private static final int FONT_SIZE = 20;
    private static final int NUMBER_OF_REPEATS = 5;
    private static final String TEXT = new String("あ     た    ア   カ    サ    ザ      ジ ズ       ゼ       ゾ           シ    ス      セ   ソ    キ   ク   ケ   コ   イ  ウ   エ    オ   ジャ な");
    private static JPanel panel = new JPanel(null);
    private static Random random = new Random();
    private static JLabel label[] = new JLabel[NUMBER_OF_REPEATS];

    public MatrixScreen() {
        this.add(panel);
        panel.setBackground(Color.BLACK);
    }

    public static void main(String[] args) {
        MatrixScreen frame = new MatrixScreen();
        frame.setVisible(true);
        frame.setSize(600, 400);
        frame.setResizable(false);
        frame.setMinimumSize(new Dimension(300, 200));
        frame.setLocationRelativeTo(null);
        frame.setTitle("Matrix Code");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.scroll();
    }

    public void scroll() {
        //array to hold x coordinates for the labels
        int[] random_x = new int[NUMBER_OF_REPEATS];
        //create an infinite loop
        while (true) {
            //initialise all the labels to random characters
            for (int i = 0; i < NUMBER_OF_REPEATS; i++) {
                int character_initial = random.nextInt(TEXT.length());
                random_x[i] = random.nextInt(panel.getWidth() / FONT_SIZE) - 1;
                label[i] = new JLabel("" + TEXT.charAt(character_initial));
                panel.add(label[i]);
                label[i].setFont(new Font("monospaced", Font.PLAIN, FONT_SIZE));
                label[i].setForeground(new Color(0, 255, 0));
            }
            // change the text of the labels and their position
            for (int j = 0; j < (panel.getHeight() / FONT_SIZE) * 2; j++) {
                int character = random.nextInt(TEXT.length());
                //move each character
                for (int i = 0; i < NUMBER_OF_REPEATS; i++) {
                    label[i].setBounds(random_x[i] * FONT_SIZE, j * (FONT_SIZE / 2), FONT_SIZE, FONT_SIZE);
                    label[i].setText("" + TEXT.charAt(character));
                    label[i].setForeground(new Color(0, 255 - (j * 5), 0));
                    for (int k = 0; k < NUMBER_OF_REPEATS; k++) {
                        int character_initial = random.nextInt(TEXT.length());
                        random_x[k] = random.nextInt(panel.getWidth() / FONT_SIZE) - 1;
                        label[k] = new JLabel("" + TEXT.charAt(character_initial));
                        panel.add(label[k]);
                        label[k].setFont(new Font("monospaced", Font.PLAIN, FONT_SIZE));
                        label[k].setForeground(new Color(0, 255, 0));
                        Color colour = label[k].getForeground();
                        if (colour.getGreen() <= 80) {
                            panel.remove(label[k]);
                            k = (panel.getHeight() / FONT_SIZE) * 2;
                        }
                    }
                }
                // pause between each character
                try {
                    Thread.sleep(15);
                } catch (Exception e) {
                }
            }
        }
    }
}
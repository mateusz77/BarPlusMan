package BarPlusMan.company.gui;

import BarPlusMan.company.model.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;

public  class Main {
    public static void main(String[] args){
        PlanTreningowy nowy = null;

        IO odczyt = new IO("TrenujMiTu");
        nowy = odczyt.readPlanTreningowy();
        nowy.getTrening().wypiszPartie();

        JFrame frame = new JFrame("PLAN TRENINGOWY");

        try {
            BufferedImage img = ImageIO.read(new File("pla.jpg"));
            frame.setContentPane(new JLabel(new ImageIcon(img)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        PlanTreningowyGUI gui = new PlanTreningowyGUI(nowy, frame, nowy.getTrening());
        gui.getWidok(frame);




    }

}

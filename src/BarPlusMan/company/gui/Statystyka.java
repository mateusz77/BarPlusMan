package BarPlusMan.company.gui;

import BarPlusMan.company.model.IO;
import BarPlusMan.company.model.PlanTreningowy;
import BarPlusMan.company.model.Trening;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Statystyka {

    private JPanel panel1;
    private JTextPane czasTreningu;
    private JTextPane czasCwiczen;
    private JLabel Jlabel;
    private JTextPane iloscPowtorzen;
    private JTextPane textPane1;
    private JLabel czasPrzerw;
    private JButton WSTECZButton;
    private Trening trening;
    private PlanTreningowy plan;

    public JPanel getPanel1() {
        return panel1;
    }

    private Statystyka(){

    }

    public Statystyka(PlanTreningowy plane, JFrame frame, Trening trening1){
        PlanTreningowy nowy = new PlanTreningowy();
        IO odczyt = new IO("TrenujMiTu");
        nowy = odczyt.readPlanTreningowy();
        plan = nowy;
        trening = nowy.getTrening();
        czasTreningu.setText(trening.getStatystyka().wypiszLacznyCzasSpedzonyNaTreningu());
        czasCwiczen.setText(trening.getStatystyka().wypiszCzasCwiczen());
        textPane1.setText(trening.getStatystyka().wypiszCzasPrzerw());
        iloscPowtorzen.setText(String.valueOf(trening.getStatystyka().getLacznaIloscPowtorzen()));

        WSTECZButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File("obraz.jpg"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                frame.setContentPane(new JLabel(new ImageIcon(img)));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridwidth = GridBagConstraints.REMAINDER;
                frame.add(new PlanTreningowyGUI(plan, frame, trening).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });

    }
}

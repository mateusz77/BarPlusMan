package BarPlusMan.company.gui;


import BarPlusMan.company.model.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CwiczenieGUI implements Obserwator {

    private JButton GOTOWEButton;
    private JTextField textField1;
    private JTextPane textPane1;
    private JTextPane textPane2STOPER;
    private JPanel panel1;
    private JTextPane iloscPowtorzenbyl;
    private Cwiczenie cwiczenie;
    private Zestaw zestaw;
    private Trening trening;
    private int iloscCwiczen, iloscRund;
    private Licznik licznik = new Licznik();
    private PlanTreningowy plan;

    public Cwiczenie getCwiczenie() {
        return cwiczenie;
    }

    public void setCwiczenie(Cwiczenie cwiczenie) {
        this.cwiczenie = cwiczenie;
    }
    public JPanel getPanel1() {
        return panel1;
    }



    public CwiczenieGUI(PlanTreningowy plan1,JFrame frame, Cwiczenie cwiczenie1, Zestaw zestaw1, Trening trening1, int iloscCwiczen1, int iloscRund1){
        plan = plan1;
        iloscRund = iloscRund1;
        iloscCwiczen = iloscCwiczen1;
        cwiczenie = cwiczenie1;
        zestaw = zestaw1;
        trening = trening1;
        textField1.setText(cwiczenie.getNazwa());
        textPane1.setText(cwiczenie.getWskazowka());



        textPane2STOPER.setText("tu będzie leciał czas KIEEE+DYŚ");
        licznik.subskrybuj(this);
        licznik.start();
        iloscPowtorzenbyl.setText("Musisz wykonać co najmniej "+cwiczenie.getLiczbaPowtorzen() +" Powtórzeń");

        GOTOWEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {



                iloscCwiczen++;
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
                frame.add(new PrzygotujSie(plan, frame,zestaw, trening, iloscCwiczen, iloscRund).getPanel1(), gbc);

                frame.setLocationRelativeTo(null);
             //   frame.setSize(300, 400);
                frame.pack();
                frame.setVisible(true);


            }
        });
    }
    public void informuj() {refresh();}
    private void refresh(){
        textPane2STOPER.setText(String.valueOf( licznik.getSekundy()));
    }
}

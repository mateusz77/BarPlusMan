package BarPlusMan.company.gui;



import BarPlusMan.company.model.Partia;
import BarPlusMan.company.model.PlanTreningowy;
import BarPlusMan.company.model.Trening;
import BarPlusMan.company.model.Zestaw;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PoziomGUI {
    private JPanel panel1;
    private JButton POCZATKUJACYButton;
    private JButton THISISSPARTAButton;
    private JButton SREDNIOZAAWANSOWANYButton;
    private JButton WSTECZButton;
    private Partia partia;
    private Trening trening;
    private PlanTreningowy plan;

    public Partia getPartia() {
        return partia;
    }

    public void setPartia(Partia partia) {
        this.partia = partia;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public PoziomGUI(PlanTreningowy plan1, JFrame frame,Trening trening1, Partia partia1) {
        plan = plan1;
        partia = partia1;
        trening = trening1;

        POCZATKUJACYButton.addActionListener(new ActionListener() {
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

                frame.add(new ZestawGUI(plan, frame, trening,partia).getPanel1(), gbc);

                // frame.pack();
                frame.setLocationRelativeTo(null);

                frame.setVisible(true);


                for(Zestaw temp : partia.getSpisZestawow()){
                    temp.setRundy(3);
                    temp.setLiczbaPowtorzenWszystkichCwiczen(8);
                    temp.setCzasprzerwy(60);
                }

            }
        });
        SREDNIOZAAWANSOWANYButton.addActionListener(new ActionListener() {
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
                ;
                frame.setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridwidth = GridBagConstraints.REMAINDER;

                frame.add(new ZestawGUI(plan,frame,trening,  partia).getPanel1(), gbc);

                // frame.pack();
                frame.setLocationRelativeTo(null);

                frame.setVisible(true);
                for(Zestaw temp : partia.getSpisZestawow()){
                    temp.setRundy(4);
                    temp.setLiczbaPowtorzenWszystkichCwiczen(12);
                    temp.setCzasprzerwy(45);
                }
            }
        });
        THISISSPARTAButton.addActionListener(new ActionListener() {
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

                frame.add(new ZestawGUI(plan, frame,trening, partia).getPanel1(), gbc);

                frame.pack();
                frame.setLocationRelativeTo(null);

                frame.setVisible(true);
                for(Zestaw temp : partia.getSpisZestawow()){
                    temp.setRundy(5);
                    temp.setLiczbaPowtorzenWszystkichCwiczen(15);
                    temp.setCzasprzerwy(30);
                }

            }
        });

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

                frame.add(new PartieGUI(plan, frame, trening).getPanel1(), gbc);

                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });
    }


}

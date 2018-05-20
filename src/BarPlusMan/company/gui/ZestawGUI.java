package BarPlusMan.company.gui;



import BarPlusMan.company.model.Partia;
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

public class ZestawGUI {
    private JButton trzeciButton;
    private JButton drugiButton;
    private JPanel panel1;
    private JButton pierwszyButton;
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

    public ZestawGUI(PlanTreningowy plan1, JFrame frame,Trening trening1,  Partia partia1) {
        plan = plan1;
        partia = partia1;
        trening = trening1;
        pierwszyButton.setText(partia.getSpisZestawow().get(0).getNazwa());
        pierwszyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File("pla.jpg"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                frame.setContentPane(new JLabel(new ImageIcon(img)));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridwidth = GridBagConstraints.REMAINDER;
                frame.add(new TreningGUI(plan, frame, partia.getSpisZestawow().get(0), trening, partia).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);
               // frame.setSize(400, 800);
                frame.setVisible(true);
            }
        });

        drugiButton.setText(partia.getSpisZestawow().get(1).getNazwa());
        drugiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File("pla.jpg"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                frame.setContentPane(new JLabel(new ImageIcon(img)));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridwidth = GridBagConstraints.REMAINDER;
                frame.add(new TreningGUI(plan, frame, partia.getSpisZestawow().get(1),trening, partia).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);
           //     frame.setSize(400, 800);
                frame.setVisible(true);


            }
        });
        trzeciButton.setText(partia.getSpisZestawow().get(2).getNazwa());;
        trzeciButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                BufferedImage img = null;
                try {
                    img = ImageIO.read(new File("pla.jpg"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                frame.setContentPane(new JLabel(new ImageIcon(img)));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                frame.setLayout(new GridBagLayout());
                GridBagConstraints gbc = new GridBagConstraints();
                gbc.gridwidth = GridBagConstraints.REMAINDER;
                frame.add(new TreningGUI(plan, frame, partia.getSpisZestawow().get(2),trening, partia).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);
               // frame.setSize(400, 800);
                frame.setVisible(true);

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
                frame.add(new PoziomGUI(plan,frame, trening, partia).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);
              //  frame.setSize(300, 300);
                frame.setVisible(true);
            }
        });
    }


}

package BarPlusMan.company.gui;



import BarPlusMan.company.model.PlanTreningowy;
import BarPlusMan.company.model.Trening;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;



public class PlanTreningowyGUI extends javax.swing.JFrame {
    private int nazwa;
    private JPanel panel1;
    private JButton TRENINGButton;
    private JButton CZATButton;
    private JButton DIETAButton;
    private JButton STATYButton;
    private JTabbedPane tabbedPane1;
    private PoziomGUI poziom;
    public Trening trening;
    private PlanTreningowy plan;

    public void setTrening(Trening trening) {
        this.trening = trening;
    }

    public Trening getTrening() {
        return trening;
    }

    public JPanel getPanel1() {
        return panel1;
    }

     public PlanTreningowyGUI(PlanTreningowy plan1, JFrame frame, Trening trening1) {
        plan = plan1;
        trening = trening1;


        TRENINGButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                try {

                    BufferedImage img = ImageIO.read(new File("obraz.jpg"));

                    frame.setContentPane(new JLabel(new ImageIcon(img)));
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setLayout(new GridBagLayout());
                    GridBagConstraints gbc = new GridBagConstraints();
                    gbc.gridwidth = GridBagConstraints.REMAINDER;
                    frame.add(new PartieGUI(plan, frame, trening).getPanel1(), gbc);
                   // frame.setSize(300, 300);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
         STATYButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 try {

                     BufferedImage img = ImageIO.read(new File("staty.jpg"));

                     frame.setContentPane(new JLabel(new ImageIcon(img)));
                     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                     frame.setLayout(new GridBagLayout());
                     GridBagConstraints gbc = new GridBagConstraints();
                     gbc.gridwidth = GridBagConstraints.REMAINDER;
                     frame.add(new Statystyka(plan, frame, trening).getPanel1(), gbc);
                     frame.pack();
                     frame.setLocationRelativeTo(null);
                     frame.setVisible(true);
                 } catch (IOException e) {
                     e.printStackTrace();
                 }

             }
         });
         CZATButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 BufferedImage img = null;
                 try {
                     img = ImageIO.read(new File("staty.jpg"));
                 } catch (IOException e) {
                     e.printStackTrace();
                 }

                 frame.setContentPane(new JLabel(new ImageIcon(img)));
                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame.setLayout(new GridBagLayout());
                 GridBagConstraints gbc = new GridBagConstraints();
                 gbc.gridwidth = GridBagConstraints.REMAINDER;
                 frame.add(new CzatGui(frame,plan, trening).getPanel1(), gbc);
                 frame.pack();
                 frame.setLocationRelativeTo(null);
                 frame.setVisible(true);

             }
         });
         DIETAButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent actionEvent) {
                 BufferedImage img = null;
                 try {
                     img = ImageIO.read(new File("staty.jpg"));
                 } catch (IOException e) {
                     e.printStackTrace();
                 }

                 frame.setContentPane(new JLabel(new ImageIcon(img)));
                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 frame.setLayout(new GridBagLayout());
                 GridBagConstraints gbc = new GridBagConstraints();
                 gbc.gridwidth = GridBagConstraints.REMAINDER;
                 frame.add(new DietaGUI(plan, frame, trening,0).getPanel1(), gbc);
                 frame.pack();
                 frame.setLocationRelativeTo(null);
                 frame.setVisible(true);

             }
         });
     }

   public void getWidok(JFrame frame) {
        frame.setContentPane(new PlanTreningowyGUI(plan,frame, trening).getPanel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setSize(300, 300);
       frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    /*************************************************MAIN*******************************************************************/


    public int getNazwa() {
        return nazwa;
    }

    public void setNazwa(int nazwa) {
        this.nazwa = nazwa;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JButton getTRENINGButton() {
        return TRENINGButton;
    }

    public void setTRENINGButton(JButton TRENINGButton) {
        this.TRENINGButton = TRENINGButton;
    }

    public JButton getCZATButton() {
        return CZATButton;
    }

    public void setCZATButton(JButton CZATButton) {
        this.CZATButton = CZATButton;
    }

    public JButton getDIETAButton() {
        return DIETAButton;
    }

    public void setDIETAButton(JButton DIETAButton) {
        this.DIETAButton = DIETAButton;
    }

    public JButton getSTATYButton() {
        return STATYButton;
    }

    public void setSTATYButton(JButton STATYButton) {
        this.STATYButton = STATYButton;
    }

    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    public void setTabbedPane1(JTabbedPane tabbedPane1) {
        this.tabbedPane1 = tabbedPane1;
    }

    public PoziomGUI getPoziom() {
        return poziom;
    }

    public void setPoziom(PoziomGUI poziom) {
        this.poziom = poziom;
    }

}
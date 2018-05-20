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

public class TreningGUI {
    private JPanel panel1;
    private JPanel ZestawCwiczen;
    private JTextField textField1;
    private JTabbedPane tabbedPane1;
    private JTabbedPane tabbedPane2;
    private JTabbedPane tabbedPane3;
    private JTabbedPane tabbedPane4;
    private JTabbedPane tabbedPane5;
    private JButton ZACZYNAJMYButton;
    private JTextField textField2;
    private JTextField textField3;
    private JTextPane textPane4;
    private JTextField textField4;
    private JTextPane textPane5;
    private JTextField textField5;
    private JTextPane textPane2;
    private JTextPane textPane3;
    private JTextPane textPane1;
    private PoziomGUI poziom;
    private JButton WSTECZButton;
    private JTabbedPane tabbedPane7;
    private JTabbedPane tabbedPane8;
    private JTextPane textPane6;
    private JTextPane textPane7;
    private JTextField textField6;
    private JTextField textField7;
    private Zestaw zestaw;
    private Trening trening;
    private Partia partia;
    private PlanTreningowy plan;

    private PrzygotujSie przygotujSie;
    private CwiczenieGUI cwiczenieGUI;


    public Zestaw getZestaw() {
        return zestaw;
    }

    public void setZestaw(Zestaw zestaw) {
        this.zestaw = zestaw;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public TreningGUI(PlanTreningowy plan1,JFrame frame, Zestaw zestaw1, Trening trening1, Partia partia1) {
        plan = plan1;
        zestaw = zestaw1;
        trening = trening1;
        partia = partia1;

        textField1.setText(zestaw.getSpisCwiczen().get(0).getNazwa());
        textPane1.setText(zestaw1.getSpisCwiczen().get(0).getWskazowka());
        textField2.setText(zestaw.getSpisCwiczen().get(1).getNazwa());
        textPane2.setText(zestaw1.getSpisCwiczen().get(1).getWskazowka());
        textField3.setText(zestaw.getSpisCwiczen().get(2).getNazwa());
        textPane3.setText(zestaw1.getSpisCwiczen().get(2).getWskazowka());
        textField4.setText(zestaw.getSpisCwiczen().get(3).getNazwa());
        textPane4.setText(zestaw1.getSpisCwiczen().get(3).getWskazowka());
        textField5.setText(zestaw.getSpisCwiczen().get(4).getNazwa());
        textPane5.setText(zestaw1.getSpisCwiczen().get(4).getWskazowka());
        textField6.setText(zestaw.getSpisCwiczen().get(5).getNazwa());
        textPane6.setText(zestaw1.getSpisCwiczen().get(5).getWskazowka());
        textField7.setText(zestaw.getSpisCwiczen().get(6).getNazwa());
        textPane7.setText(zestaw1.getSpisCwiczen().get(6).getWskazowka());


        ZACZYNAJMYButton.addActionListener(new ActionListener() {
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
                    frame.add(new PrzygotujSie(plan, frame, zestaw, trening, 0, 0).getPanel1(), gbc);
                    frame.pack();
                    frame.setLocationRelativeTo(null);

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
                frame.add(new ZestawGUI(plan, frame, trening, partia).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);

                frame.setVisible(true);
            }
        });

    }

}

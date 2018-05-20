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
import java.io.IOException;

public class DietaGUI {
    private JPanel panel1;
    private JButton wsteczButton;
    private JTextPane textPane1;
    private JTextPane sniadanie;
    private JTextPane drugiesniadanie;
    private JTextPane obiad;
    private JTextPane lunch;
    private JTextPane kolacja;
    private JButton następnyZestawButton;
    private int numerDiety;

    public JPanel getPanel1() {
        return panel1;
    }
    public DietaGUI(PlanTreningowy plan, JFrame frame, Trening trening, int numer) {
        numerDiety = numer;
        textPane1.setText("zestaw posiłków na dziś : ");
        sniadanie.setText(plan.getDieta().get(numerDiety).getSniadanie());
        drugiesniadanie.setText(plan.getDieta().get(numerDiety).getDrugiesniadanie());
        obiad.setText(plan.getDieta().get(numerDiety).getObiad());
        lunch.setText(plan.getDieta().get(numerDiety).getLunch());
        kolacja.setText(plan.getDieta().get(numerDiety).getKolacja());

        wsteczButton.addActionListener(new ActionListener() {
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
                frame.setSize(600,430);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);


            }
        });
        następnyZestawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(numerDiety<plan.getDieta().size()-1) {
                    numerDiety++;
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
                    frame.add(new DietaGUI(plan, frame, trening, numerDiety).getPanel1(), gbc);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);

                }else{
                    JOptionPane.showMessageDialog(null, "To już koniec zestawów :/");
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
                    frame.add(new DietaGUI(plan, frame, trening, 0).getPanel1(), gbc);
                    frame.pack();
                    frame.setLocationRelativeTo(null);
                    frame.setVisible(true);

                }
            }
        });
    }
}

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

public class CzatGui {
    private JPanel panel1;
    private JButton WSTECZButton;
    private PlanTreningowy plan;
    public JPanel getPanel1() {
        return panel1;
    }

    public CzatGui(JFrame frame,PlanTreningowy plan1, Trening trening) {
        plan = plan1;
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

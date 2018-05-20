package BarPlusMan.company.gui;



import BarPlusMan.company.model.Trening;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class KoniecGUI {
    private JPanel panel1;
    private JTextField KONIECTextField;
    private JButton powrotDoMenuGłownegoButton;
    private Trening trening;

    public JPanel getPanel1() {
        return panel1;
    }

    public KoniecGUI(JFrame frame, Trening trening1) {
    trening = trening1;

        powrotDoMenuGłownegoButton.addActionListener(new ActionListener() {
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
               // frame.add(new PlanTreningowyGUI(frame,PlanTreningowyGUI.getTrening).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setSize(300, 300);
                frame.setVisible(true);
            }
        });
    }
}

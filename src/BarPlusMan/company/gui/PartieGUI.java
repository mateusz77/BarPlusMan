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

public class PartieGUI {
    private JButton czwartyButton;
    private JButton pierwszyBUTTON;
    private JButton piatyButton;
    private JButton drugiButton;
    private JButton szostuyButton;
    private JPanel panel1;
    private JButton WSTECZButton;
    private JButton trzecibutton;
    private Trening trening;
    private PlanTreningowy plan;

    public void setTrening(Trening trening) {
        this.trening = trening;
    }

    public Trening getTrening() {
        return trening;
    }

    public PartieGUI(PlanTreningowy plan1, JFrame frame, Trening trening1) {
        plan = plan1;
        trening = trening1;


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
                frame.add(new PlanTreningowyGUI(plan,frame, trening).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);

                frame.setVisible(true);
            }
        });
        pierwszyBUTTON.setText(trening.getSpisPartii().get(0).getNazwa());
        pierwszyBUTTON.addActionListener(new ActionListener() {
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
                frame.add(new PoziomGUI(plan,frame, trening,trening.getSpisPartii().get(0)).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);

                frame.setVisible(true);
            }
        });
        drugiButton.setText(trening.getSpisPartii().get(1).getNazwa());
        drugiButton.addActionListener(new ActionListener() {
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

                frame.add(new PoziomGUI(plan, frame,trening, trening.getSpisPartii().get(1)).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);

                frame.setVisible(true);

            }
        });
        trzecibutton.setText(trening.getSpisPartii().get(2).getNazwa());
        trzecibutton.addActionListener(new ActionListener() {
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

                frame.add(new PoziomGUI(plan, frame,trening, trening.getSpisPartii().get(2)).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);

                frame.setVisible(true);

            }
        });
        czwartyButton.setText(trening.getSpisPartii().get(3).getNazwa());
        czwartyButton.addActionListener(new ActionListener() {
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

                frame.add(new PoziomGUI(plan, frame,trening, trening.getSpisPartii().get(3)).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);

                frame.setVisible(true);

            }
        });
        piatyButton.setText(trening.getSpisPartii().get(4).getNazwa());
        piatyButton.addActionListener(new ActionListener() {
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

                frame.add(new PoziomGUI(plan,frame,trening, trening.getSpisPartii().get(4)).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);

                frame.setVisible(true);

            }
        });
        szostuyButton.setText(trening.getSpisPartii().get(5).getNazwa());
        szostuyButton.addActionListener(new ActionListener() {
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

                frame.add(new PoziomGUI(plan, frame,trening, trening.getSpisPartii().get(5)).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);

                frame.setVisible(true);

            }
        });
    }

    public JPanel getPanel1() {
        return panel1;
    }


}

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

public class PrzygotujSie implements Obserwator {
    private JPanel panel1;
    private JButton zaczynajmyButton;
    private JTextField odliczanieprzerwy;
    private JTextField nastepneCwiczenie;
    private JSpinner jakPoszloIloscPowt;
    private JPanel STOPER;
    private JPanel jakieCwiczenieTerazBedzie;
    private JPanel IleUdaloCiSieZrobic;
    private JTextPane Wskazowka;
    private JButton zakonczButton;
    private JButton następnaRundaButton;
    private JTextField rundaText;
    private Zestaw zestaw;
    private Trening trening;
    private int iloscCwiczen;
    private int iloscPowtorzen;
    private int iloscRund;
    PlanTreningowy plan;

    private Minutnik minutnik = new Minutnik();


    public PrzygotujSie(PlanTreningowy plan1, JFrame frame, Zestaw zestaw1, Trening trening1, int iloscCwiczen1, int iloscRund1) {
        iloscCwiczen = iloscCwiczen1;
        zestaw = zestaw1;
        iloscRund = iloscRund1;
        trening = trening1;
        minutnik.setSekundy(zestaw.getCzasprzerwy());
        minutnik.subskrybuj(this);
        minutnik.start();
        iloscPowtorzen = (int) jakPoszloIloscPowt.getValue();
       // trening.getStatystyka().dodajPowtorzenia(iloscPowtorzen);
        rundaText.setText(String.valueOf(iloscRund+1));
        następnaRundaButton.setVisible(false);
        plan = plan1;


        plan.getStoper().start();
        plan.getStoper().pauza();




        if (this.iloscRund < zestaw.getRundy()) {
            if (iloscCwiczen1 < zestaw1.getSpisCwiczen().size()) {
                odliczanieprzerwy.setText(String.valueOf(zestaw1.getCzasprzerwy()));
                nastepneCwiczenie.setText(zestaw.getSpisCwiczen().get(iloscCwiczen).getNazwa() + " ilość powtórzeń: " + zestaw.getLiczbaPowtorzenWszystkichCwiczen());
                Wskazowka.setText(zestaw.getSpisCwiczen().get(iloscCwiczen).getWskazowka());
            } else {
                odliczanieprzerwy.setText(String.valueOf(zestaw1.getCzasprzerwy()));
                nastepneCwiczenie.setText("To już koniec tej rundy  DOBRA ROBOTA!");
                Wskazowka.setText("Czy już czas na kolejną rundę? Może już wymiękasz? :X");
                zaczynajmyButton.setVisible(false);
                iloscRund++;
                iloscCwiczen = 0;

                następnaRundaButton.setVisible(true);

            }
        } else {
            nastepneCwiczenie.setText("To już koniec DOBRA ROBOTA!");
            Wskazowka.setText("Nie zapomnij się rozciągnąć!");
            zaczynajmyButton.setVisible(false);


        }

        zaczynajmyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                plan.getStoper().wznowienie();
                trening.getStatystyka().dodajPowtorzenia((int)jakPoszloIloscPowt.getValue());
                plan.getStatystyka().dodajCzas(plan.getStoper().obliczCzasSpedzonyNaTreningu());
                plan.getStatystyka().setCzasNaCwiczeniach(plan.getStoper().obliczCzasCwiczen());
                plan.getStatystyka().setCzasNaPrzerwach(plan.getStoper().obliczCzasSpedzonyNaPrzerwach());

                if (iloscCwiczen < zestaw.getSpisCwiczen().size() + 1) {
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
                    frame.add(new CwiczenieGUI(plan,frame, zestaw.getSpisCwiczen().get(iloscCwiczen), zestaw, trening, iloscCwiczen,iloscRund).getPanel1(), gbc);
                    frame.pack();
                    frame.setLocationRelativeTo(null);

                    frame.setVisible(true);

                } else {
                    BufferedImage img = null;
                    try {
                        img = ImageIO.read(new File("obraz.jpg"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setContentPane(new JLabel());
                    frame.setLayout(new GridBagLayout());
                    GridBagConstraints gbc = new GridBagConstraints();
                    gbc.gridwidth = GridBagConstraints.REMAINDER;
                    frame.add(new KoniecGUI(frame, trening).getPanel1(), gbc);
                    frame.pack();
                    frame.setLocationRelativeTo(null);

                    frame.setVisible(true);

                }


            }
        });
        zakonczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                plan.getStoper().stop();
                trening.getStatystyka().dodajPowtorzenia((int)jakPoszloIloscPowt.getValue());
                trening.getStatystyka().dodajCzas(plan.getStoper().obliczCzasSpedzonyNaTreningu());
                trening.getStatystyka().setCzasNaCwiczeniach(plan.getStoper().obliczCzasCwiczen());
                trening.getStatystyka().setCzasNaPrzerwach(plan.getStoper().obliczCzasSpedzonyNaPrzerwach());

                IO zapis = new IO("TrenujMiTu");
                zapis.writePlanTreningowy(plan);


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
        następnaRundaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                trening.getStatystyka().dodajPowtorzenia((int)jakPoszloIloscPowt.getValue());
                trening.getStatystyka().dodajCzas(plan.getStoper().obliczCzasSpedzonyNaTreningu());
                trening.getStatystyka().setCzasNaCwiczeniach(plan.getStoper().obliczCzasCwiczen());
                trening.getStatystyka().setCzasNaPrzerwach(zestaw.getCzasprzerwy());


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
                frame.add(new PrzygotujSie(plan, frame, zestaw, trening, 0, iloscRund).getPanel1(), gbc);
                frame.pack();
                frame.setLocationRelativeTo(null);

                frame.setVisible(true);


            }
        });
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public JButton getZaczynajmyButton() {
        return zaczynajmyButton;
    }

    public void setZaczynajmyButton(JButton zaczynajmyButton) {
        this.zaczynajmyButton = zaczynajmyButton;
    }

    public JTextField getOdliczanieprzerwy() {
        return odliczanieprzerwy;
    }

    public void setOdliczanieprzerwy(JTextField odliczanieprzerwy) {
        this.odliczanieprzerwy = odliczanieprzerwy;
    }

    public JTextField getNastepneCwiczenie() {
        return nastepneCwiczenie;
    }

    public void setNastepneCwiczenie(JTextField nastepneCwiczenie) {
        this.nastepneCwiczenie = nastepneCwiczenie;
    }

    public JSpinner getJakPoszloIloscPowt() {
        return jakPoszloIloscPowt;
    }

    public void setJakPoszloIloscPowt(JSpinner jakPoszloIloscPowt) {
        this.jakPoszloIloscPowt = jakPoszloIloscPowt;
    }

    @Override
    public void informuj() {
        refresh();
    }

    private void refresh() {
        try {
            odliczanieprzerwy.setText(String.valueOf(minutnik.getSekundy()));
        } catch (Wyjatekujemnegoczasu ex1) {
            JOptionPane.showMessageDialog(null, ex1.getMessage());
        }
    }

}

package BarPlusMan.company.model;

import java.io.Serializable;
import java.util.ArrayList;


public class Trening implements Serializable {
    private Statystyka statystyka = new Statystyka();
    private String nazwa;
    private int czas;

    private ArrayList <Partia> spisPartii = new ArrayList <>();

    Trening() {
    }

    public Trening(String nazwaa) {
        nazwa = nazwaa;
    }


    public String getNazwa() {
        return nazwa;
    }

    public int getCzas() {
        return czas;
    }

    public ArrayList <Partia> getSpisPartii() {
        return spisPartii;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCzas(int czas) {
        this.czas = czas;
    }

    public void setSpisPartii(ArrayList <Partia> spisPartii) {
        this.spisPartii = spisPartii;
    }

    public Statystyka getStatystyka() {
        return statystyka;
    }

    public void setStatystyka(Statystyka statystyka) {
        this.statystyka = statystyka;
    }

    public void dodajPartieDoTreningu(Partia partia) throws WyjatekDodaniaObiektu {

        if (!(spisPartii.contains(partia))) {
            this.spisPartii.add(partia);
        } else {
            throw new WyjatekDodaniaObiektu("Obiekt już isnieje");
        }
    }

    public void wypiszPartie() {
        for (Partia temp : getSpisPartii()) temp.wypisz();
    }
}

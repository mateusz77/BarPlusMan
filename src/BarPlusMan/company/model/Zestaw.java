package BarPlusMan.company.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Zestaw implements Serializable {
    private String nazwa;
    private ArrayList <Cwiczenie> spisCwiczen = new ArrayList <>();
    private int przecietnyczas;
    private int rundy;
    private int liczbaPowtorzenWszystkichCwiczen;
    private int czasprzerwy;

    public int getCzasprzerwy() {
        return czasprzerwy;
    }

    public void setCzasprzerwy(int czasprzerwy) {
        this.czasprzerwy = czasprzerwy;
    }

    public int getLiczbaPowtorzenWszystkichCwiczen() {
        return liczbaPowtorzenWszystkichCwiczen;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setSpisCwiczen(ArrayList <Cwiczenie> spisCwiczen) {
        this.spisCwiczen = spisCwiczen;
    }

    public void setPrzecietnyczas(int przecietnyczas) {
        this.przecietnyczas = przecietnyczas;
    }

    public void setLiczbaPowtorzenWszystkichCwiczen(int liczbaPowtorzenWszystkichCwiczen) {
        this.liczbaPowtorzenWszystkichCwiczen = liczbaPowtorzenWszystkichCwiczen;
        for (Cwiczenie cwiczenie : spisCwiczen) {
            cwiczenie.setLiczbaPowtorzen(liczbaPowtorzenWszystkichCwiczen);

        }
    }

    public int getPrzecietnyczas() {
        return przecietnyczas;
    }

    public ArrayList <Cwiczenie> getSpisCwiczen() {
        return spisCwiczen;
    }

    public String getNazwa() {
        return nazwa;
    }

    public int getRundy() {
        return rundy;
    }

    public void wypiszCwiczenia() {
        for (Cwiczenie temp : getSpisCwiczen()) {
            temp.wypisz();
        }
    }

    public void setRundy(int rundy) {
        this.rundy = rundy;
    }


    public void wypisz() {
        System.out.println("nazwa: " + getNazwa() + "\n " + "Rundy: " + getRundy() + "\n " + "czas: " + (getPrzecietnyczas() * getRundy()) + "\n " + " \n ");
    }

    public void utworz(String nazwaa, int rundyy) {
        nazwa = nazwaa;
        rundy = rundyy;

    }

    public void dodajCwiczenieDoZestawu(Cwiczenie mojecwiczenie) throws WyjatekDodaniaObiektu {
        if (!(spisCwiczen.contains(mojecwiczenie))) {
            this.spisCwiczen.add(mojecwiczenie);
            this.przecietnyczas = this.przecietnyczas + mojecwiczenie.getCzas();

        } else {
            throw new WyjatekDodaniaObiektu("Obiekt już isnieje");
        }
    }


}

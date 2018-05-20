package BarPlusMan.company.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Partia implements Serializable {
    private String nazwa;
    private ArrayList <Zestaw> spisZestawow = new ArrayList <>();
    private int czas;

    private Partia(){

    }
    public Partia(String nazwaa){
        nazwa = nazwaa;
    }
    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public ArrayList <Zestaw> getSpisZestawow() {
        return spisZestawow;
    }

    public void setSpisZestawow(ArrayList <Zestaw> spisZestawow) {
        spisZestawow = spisZestawow;
    }

    public void utworzPartie() {

    }

    public void wypisz() {

        for (Zestaw temp : getSpisZestawow()) temp.wypisz();

    }

    public void dodajZestawDoPartii(Zestaw mojZestaw) throws WyjatekDodaniaObiektu {
        if (!(spisZestawow.contains(mojZestaw))) {
            this.spisZestawow.add(mojZestaw);
            this.czas = this.czas + mojZestaw.getPrzecietnyczas();

        } else {
            throw new WyjatekDodaniaObiektu("Obiekt już isnieje");
        }
    }

}

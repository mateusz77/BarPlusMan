package BarPlusMan.company.model;

import java.io.Serializable;

public class Cwiczenie implements Serializable {
    private String nazwa;
    private int czas;
    private String wskazowka;
    private int liczbaPowtorzen;

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCzas(int czas) {
        this.czas = czas;
    }

    public void setWskazowka(String wskazowka) {
        this.wskazowka = wskazowka;
    }

    public void setLiczbaPowtorzen(int liczbaPowtorzen) {
        this.liczbaPowtorzen = liczbaPowtorzen;
    }

    public static class Builder {
        private int liczbaPowtorzen;  //liczba powtórzeń nie zmienia się podczas budowania ćwiczenia;
        private int czas; //w sekundach
        private String wskazowka;
        private String nazwa;



        public Builder iloscPowtorzen(int powtorzenia) {
            if (powtorzenia > 0) {
                this.liczbaPowtorzen = powtorzenia;
            }
            this.liczbaPowtorzen = 5;
            return this;
        }

        public Builder czasWykonaniaCwiczenia(int czasWSekundach) {
            this.czas = czasWSekundach;
            return this;
        }

        public Builder jakWykonacToCwiczenie(String dajWskazowke) {
            this.wskazowka = dajWskazowke;
            return this;
        }

        public Builder jakSieNazywaCwiczenie(String dajNazwe) {
            this.nazwa = dajNazwe;
            return this;
        }

        public Cwiczenie build() {
            return new Cwiczenie(this);
        }
    }

    private Cwiczenie() {
    }

    private Cwiczenie(Builder builder) {
        if (builder == null) {
            return;
        }
        nazwa = builder.nazwa;
        czas = builder.czas;
        wskazowka = builder.wskazowka;
        liczbaPowtorzen = builder.liczbaPowtorzen;


    }


    public String getNazwa() {
        return nazwa;
    }

    public int getCzas() {
        return czas;
    }

    public String getWskazowka() {
        return wskazowka;
    }

    public int getLiczbaPowtorzen() {
        return liczbaPowtorzen;
    }

    public void wypisz() {
        System.out.println("nazwa: " + getNazwa() + "\n " + "Wskazówka: " + getWskazowka() + "\n " + "czas: " + getCzas() + "\n " + "Ilość powtórzeń: " + getLiczbaPowtorzen() + " \n ");
    }
}

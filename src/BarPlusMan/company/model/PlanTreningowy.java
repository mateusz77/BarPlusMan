package BarPlusMan.company.model;

import java.io.Serializable;
import java.util.ArrayList;

public class PlanTreningowy implements Serializable{
    private String nazwa;
    private Trening trening;
    private ArrayList<Dieta> dieta = new ArrayList <>();
    private Statystyka statystyka;
    private Czat czat;
    private Stoper stoper;

    public  PlanTreningowy(){}

    public PlanTreningowy(String nazwaa, Trening trening1, Dieta dieta1, Statystyka statystyka1,Czat czat1 , Stoper stoper1){
        stoper = stoper1;
        nazwa = nazwaa;
        trening = trening1;
        dieta.add(dieta1);
        statystyka = statystyka1;
        czat = czat1;
    }



    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Trening getTrening() {
        return trening;
    }

    public void setTrening(Trening trening) {
        this.trening = trening;
    }

    //public Dieta getDieta() {return dieta; }

    //public void setDieta(Dieta dieta) {this.dieta = dieta;}
    public void dodajDiete(Dieta dieta1){
        dieta.add(dieta1);

    }

    public ArrayList <Dieta> getDieta() {
        return dieta;
    }

    public Statystyka getStatystyka() {
        return statystyka;
    }

    public void setStatystyka(Statystyka statystyka) {
        this.statystyka = statystyka;
    }

    public Czat getCzat() {
        return czat;
    }

    public void setCzat(Czat czat) {
        this.czat = czat;
    }

    public Stoper getStoper() {
        return stoper;
    }

    public void setStoper(Stoper stoper) {
        this.stoper = stoper;
    }
}

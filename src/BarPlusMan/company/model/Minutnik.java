package BarPlusMan.company.model;

import java.io.Serializable;

public class Minutnik extends Thread implements Serializable{
    Obserwator obserwator;
    int godziny;
    int minuty = 60;
    int sekundy;

    public int getGodziny() {
        return godziny;
    }

    public void setGodziny(int godziny) {
        this.godziny = godziny;
    }

    public int getMinuty() {
        return minuty;
    }

    public void setMinuty(int minuty) {
        this.minuty = minuty;
    }

    public int getSekundy() throws Wyjatekujemnegoczasu{
        if(sekundy > 0) {
            return sekundy;
        }else {
            throw new Wyjatekujemnegoczasu("ZACZNIJ JUŻ ĆWICZYĆ!");
        }
    }

    public void setSekundy(int sekundy) {
        this.sekundy = sekundy;
    }

    public void subskrybuj(Obserwator obserwer) {
        obserwator = obserwer;
    }

    public void odsubskrybuj(Obserwator obserwer) {
        if (obserwer == obserwator) {
            obserwator = null;
        }
    }


    public void run() {

        while (true) {

                if (sekundy > 0) {
                    sekundy--;
                    obserwator.informuj();
                }else {}



            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }

    }

}

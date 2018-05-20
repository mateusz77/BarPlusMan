package BarPlusMan.company.model;


import java.io.Serializable;

public class Licznik extends Thread implements Serializable{
    Obserwator obserwator;
    int godziny;
    int minuty;
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

    public int getSekundy() {
        return sekundy;
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
            if (minuty < 60) {
                if (sekundy < 60) {
                    sekundy++;
                    obserwator.informuj();
                } else {
                    sekundy = 0;
                    minuty++;
                }
            } else {
                minuty = 0;
                godziny++;
            }

            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }

    }
}


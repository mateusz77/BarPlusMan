package BarPlusMan.company.model;


import java.io.Serializable;

public class Stoper implements Serializable {
    private long czasStartu, czasBezPauz,czasSpedzonyNaPrzerwach,czasSpedzonyNaTreningu, czasStopu, czasRozpoczeciaPauzy, czasWznowienia, czasWszystkichPauzRazem = (long) 0;     /* czas startu, stopu, rozpoczecia pauzy, suma wszystkich pauz */
    private boolean stop = false;                                     /* czy pomiar jest skonczny */
    private boolean pauza = false;                                     /* czy aktualnie stoper jest zatrzymany */
    private String nazwa;

    Stoper() {
        nazwa = "standard";
    }

    Stoper(String nazwain) {
        nazwa = nazwain;

    }

    public void start() {
        czasStartu = System.currentTimeMillis();
    }

    public void stop() {
        czasStopu = System.currentTimeMillis();
    }
    public long obliczCzasSpedzonyNaTreningu(){
        czasSpedzonyNaTreningu = (czasStopu - czasStartu) / 1000;
        return czasSpedzonyNaTreningu;
    }
    public long obliczCzasSpedzonyNaPrzerwach(){
        czasSpedzonyNaPrzerwach = (czasRozpoczeciaPauzy - czasWznowienia) / 1000;
        return czasSpedzonyNaPrzerwach;
    }

    public long obliczCzasCwiczen() {
        czasBezPauz = (czasStopu - czasStartu) / 1000 - czasWszystkichPauzRazem;
        return czasBezPauz;
    }

    public void pauza() {
        czasRozpoczeciaPauzy = System.currentTimeMillis();
    }

    public void wznowienie() {
        czasWznowienia = System.currentTimeMillis();
        czasWszystkichPauzRazem = czasWszystkichPauzRazem + (czasWznowienia - czasRozpoczeciaPauzy) / 1000;
    }


}

package BarPlusMan.company.model;

import java.io.Serializable;

public class Statystyka implements Serializable {
    private long lacznaIloscPowtorzen;
    private long lacznyCzasSpedzonyNaTreningusekund, czasNaCwiczeniach, czasNaPrzerwach ;
    private long sekundy,dni,godziny,minuty, lata;


    public String wypiszLacznyCzasSpedzonyNaTreningu(){
        sekundy = lacznyCzasSpedzonyNaTreningusekund %60;
        minuty = sekundy/60 %60;
        godziny = minuty/60 %60;
        dni = godziny/24  %24;
        lata = dni/356 %356;
        return "dni: "+dni+"godziny: "+godziny +"minuty: "+minuty+ "sekundy: "+sekundy;
    }

    public String wypiszCzasCwiczen(){
        sekundy = czasNaCwiczeniach;
        minuty = sekundy/60 %60;
        godziny = minuty/60 %60;
        dni = godziny/24  %24;
        lata = dni/356 %356;
        return "dni: "+dni+"godziny: "+godziny +"minuty: "+minuty+ "sekundy: "+sekundy;
    }

    public String wypiszCzasPrzerw(){
        sekundy = czasNaPrzerwach;
        minuty = sekundy/60 %60;
        godziny = minuty/60 %60;
        dni = godziny/24  %24;
        lata = dni/356 %356;

        return "dni: "+dni+"godziny: "+godziny +"minuty: "+minuty+ "sekundy: "+sekundy;
    }
    public long getLacznaIloscPowtorzen() {
        return lacznaIloscPowtorzen;
    }

    public long getLacznyCzasSpedzonyNaTreningu() {
        return lacznyCzasSpedzonyNaTreningusekund;
    }


    public void dodajPowtorzenia(int nowePowtorzenia){
        lacznaIloscPowtorzen = lacznaIloscPowtorzen+ nowePowtorzenia;
    }

    public void setLacznaIloscPowtorzen(long lacznaIloscPowtorzen) {
        this.lacznaIloscPowtorzen = lacznaIloscPowtorzen;
    }

    public long getLacznyCzasSpedzonyNaTreningusekund() {
        return lacznyCzasSpedzonyNaTreningusekund;
    }

    public void setLacznyCzasSpedzonyNaTreningusekund(long lacznyCzasSpedzonyNaTreningusekund) {
        this.lacznyCzasSpedzonyNaTreningusekund = lacznyCzasSpedzonyNaTreningusekund;
    }

    public long getCzasNaCwiczeniach() {
        return czasNaCwiczeniach;
    }

    public void setCzasNaCwiczeniach(long czasNaCwiczeniach1) {
        this.czasNaCwiczeniach = this.czasNaCwiczeniach + czasNaCwiczeniach1;
    }

    public long getCzasNaPrzerwach() {
        return czasNaPrzerwach;
    }

    public void setCzasNaPrzerwach(long czasNaPrzerwach1) {
        this.czasNaPrzerwach =this.czasNaPrzerwach + czasNaPrzerwach1;
    }

    public void dodajCzas(long nowyczassek){
     /*   if(minuty < 60) {
            if (sekundy < 60) {
                sekundy = sekundy + nowyczassek;
            } else {
                minuty = (minuty + (sekundy % 60));
                sekundy = sekundy + nowyczassek;
            }
        } else {
            godziny = (godziny + (minuty % 60));
            minuty = minuty +
        }*/
        lacznyCzasSpedzonyNaTreningusekund = lacznyCzasSpedzonyNaTreningusekund +  nowyczassek;
    }
}

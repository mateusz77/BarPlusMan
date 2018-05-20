package BarPlusMan.company.model;

import java.io.Serializable;

public class Dieta implements Serializable {

    private String nazwa;
    private String sniadanie;
    private String drugiesniadanie;
    private String obiad;
    private String kolacja;
    private String lunch;


    public Dieta(String nazwaa, String sniadanie1, String drugiesniadanie1, String obiad1, String lunch1, String kolacja1) {
        nazwa = nazwaa;
        sniadanie = sniadanie1;
        drugiesniadanie = drugiesniadanie1;
        obiad = obiad1;
        lunch = lunch1;
        kolacja = kolacja1;

    }

    public String getSniadanie() {
        return sniadanie;
    }

    public String getDrugiesniadanie() {
        return drugiesniadanie;
    }

    public String getObiad() {
        return obiad;
    }

    public String getKolacja() {
        return kolacja;
    }

    public String getLunch() {
        return lunch;
    }

    public String getNazwa() {
        return nazwa;
    }
}

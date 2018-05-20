package BarPlusMan.company.model;

import java.io.*;

public class IO implements Serializable {


    private String nazwa;

    public IO(String nazwa) {

        this.nazwa = nazwa;
    }



    public PlanTreningowy  readPlanTreningowy() {

        PlanTreningowy trenZPliku = null;

        try {
            try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nazwa))) {
                trenZPliku = (PlanTreningowy) inputStream.readObject();



            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return trenZPliku;

    }

    public void writePlanTreningowy(PlanTreningowy x) {

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nazwa))) {
            try {
                outputStream.writeObject(x);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public String getNazwa() {
        return nazwa;
    }
}

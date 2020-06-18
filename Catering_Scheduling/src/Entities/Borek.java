package Entities;

public class Borek {

    // Defining Borek class

    private int yemek_id = 1;

    public Borek(int yemek_id) {        // Constructor Method

        this.yemek_id = yemek_id;
    }

    //Getter and Setter Methods
    public int getYemek_id() {

        return yemek_id;
    }

    public void setYemek_id(int yemek_id) {

        this.yemek_id = yemek_id;
    }
}
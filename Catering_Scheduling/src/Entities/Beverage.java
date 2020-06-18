package Entities;

public class Beverage {

    // Defining Beverage class

    private int yemek_id = 2;

    public Beverage(int yemek_id) {         // Constructor Method

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
package com.webautomation;

/**
 * Bicycle
 */
public class Bicycle {
    int speed, gear;
    String brand;

    //Constructor
    public Bicycle(){
        this.brand = "Honda";
        this.speed = 123;
        this.gear = 5;
    }

    public Bicycle(int speed, int gear, String brand){
        this.brand = brand;
        this.gear = gear;
        this.speed = speed;
    }

    public void speedUp(int increment){
        speed = speed + increment;
    }

    public int addGear(int increment){
        return gear + increment;
    }

    void printStates(){
        System.out.println("Brand" + brand + "\n"
    +"Speed" + speed +"\n"+ "Gear" + gear);
    }

    // toString method for printing Bicycle details
    @Override
    public String toString() {
        return "Bicycle{speed=" + speed + ", gear=" + gear + ", brand='" + brand + "'}";
    }
}

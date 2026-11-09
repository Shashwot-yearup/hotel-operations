package com.pluralsight;

public class Room {

    private  int numberBed;
    private  double price;
    private  boolean occupied;
    private  boolean dirty;
    private  boolean available;

    public boolean isOccupied() {
        return occupied;
    }

    //derived  getter using other properites on the class
    public boolean isAvailable() {
        return !dirty && !occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public int getNumberBed() {
        return numberBed;
    }

    public double getPrice() {
        return price;
    }
}

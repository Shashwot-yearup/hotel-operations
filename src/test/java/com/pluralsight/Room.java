package com.pluralsight;

public class Room {

    private int numberBed;
    private double price;
    private boolean occupied;
    private boolean dirty;
    private boolean available;

    public Room(boolean occupied, boolean dirty) {
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean checkIn() {
        if (!isDirty() && !isOccupied()) {
            System.out.println("room is checked in\n");
            return true;
        }
        System.out.println("room can not be checked in\n");
         return false;
    }

    public boolean checkOut() {
        if (!isOccupied()) {
            System.out.println("room is checked check out\n");
            return true;
        }
        System.out.println("room is not check out\n");
        return false;
    }

    public void cleanRoom() {
        if (isAvailable()) {
            System.out.println("room is clean");
        } else {
            System.out.println("room is not clean");
        }
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

package com.pluralsight;

public class Reservation {
    private String roomType;
    private  double price;
    private  int numberOfNight;
    private  boolean weekend;

    //constructor
    public Reservation(String roomType, double price, int numberOfNight, boolean weekend) {
        this.roomType = roomType;
        this.price = price;
        this.numberOfNight = numberOfNight;
        this.weekend = weekend;
        setRoomType(roomType);
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;

        //if statment to get the price according to the user choice.
        if(roomType.equalsIgnoreCase("king")){
            price = 139;
        }
        else if(roomType.equalsIgnoreCase("double")){
            price = 124;

        }
    }

    public double getPrice() {
        if (weekend){
            return  price * 1.10;
        }
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfNight() {
        return numberOfNight;
    }

    public void setNumberOfNight(int numberOfNight) {
        this.numberOfNight = numberOfNight;
    }

    public boolean isweekend() {
        return weekend;
    }

    public void setweekend(boolean weekend) {
        this.weekend = weekend;
    }

    public double getReservationTotal(){
        return  getPrice() * numberOfNight;
    }
    // Display reservation information
    public void displayReservationInfo() {

        System.out.println("Reservation Information");
        System.out.println("-----------------------");
        System.out.println("Room Type: " + getRoomType());
        System.out.println("Price Per Night: $" + getPrice());
        System.out.println("Number of Nights: " + getNumberOfNight());
        System.out.println("Weekend Reservation: " + isweekend());

        System.out.println("Reservation Total");
        System.out.println("-----------------");
        System.out.printf("Total Price: $%.2f%n\n\n", getReservationTotal());
    }
}

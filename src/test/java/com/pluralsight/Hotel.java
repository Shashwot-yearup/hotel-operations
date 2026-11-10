package com.pluralsight;

public class Hotel {

    private String name;
    private int numberOfSuites;
    private int numberOfRoom;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRoom) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRoom = numberOfRoom;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRoom, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRoom = numberOfRoom;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    //Method to check if the room is booked or not.
    public boolean bookRoom(int roomCount, boolean suites) {

        //if statement to see if they what they chose suites
        if (suites) {
            if (getAvailableSuites() >= roomCount) {
                this.bookedSuites += roomCount;
                return true;
            }
        } else {//if they dont chose suite

            if (getAvailableRooms() >= roomCount) {
                this.bookedBasicRooms += roomCount;
                return true;
            }
        }
        return false;
    }

    //gets the available suites for the hotel.
    public int getAvailableSuites() {
        return getNumberOfSuites() - getBookedSuites();
    }

    //gets the available room for the hotel.
    public int getAvailableRooms() {
        return getNumberOfRoom() - getBookedBasicRooms();
    }


    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

}

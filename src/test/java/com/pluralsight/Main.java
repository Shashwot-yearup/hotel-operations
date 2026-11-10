package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //Creates new object for room.
        Room room1  = new Room(false, false);

        //checks if the room is available or not.
        if(room1.isAvailable()) {
            System.out.println("room is available\n");
        }
        else {
            System.out.println("room is unavailable\n");
        }

        room1.checkIn(); //checks if the room is checked in or not

        room1.checkOut();//checks if the room is checked out or not

        room1.cleanRoom();//checks if the room is clean or not.


        //Creates new object.
        //Reservation hotel = new Reservation("king", 3, 4,true);

        //calls the method to display the information.
        //hotel.displayReservationInfo();

        //Creates new employee object
        //Employee employee1 = new Employee("Shashwot", "Software",20,60);

        //calls the method to display the information.
        //employee1.displayEmployeeInfo();

    }
}

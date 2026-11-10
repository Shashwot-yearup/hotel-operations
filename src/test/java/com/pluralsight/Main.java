package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("Grand Hotel", 10, 50);

        System.out.println("================================================");
        System.out.printf("          🏨 HOTEL MANAGEMENT SYSTEM 🏨%n");
        System.out.println("================================================");

        System.out.printf("  🏨 %-25s : %s%n", "Hotel Name", hotel.getName());

        System.out.println("------------------------------------------------");
        System.out.printf("              🛏️ ROOM AVAILABILITY%n");
        System.out.println("------------------------------------------------");

        System.out.printf("  👑 %-25s : %d%n", "Available King Suites",
                hotel.getAvailableSuites());

        System.out.printf("  🛏️ %-25s : %d%n", "Available Basic Rooms",
                hotel.getAvailableRooms());

        System.out.println("------------------------------------------------");
        System.out.printf("               📋 ROOM BOOKINGS%n");
        System.out.println("------------------------------------------------");

        // Book 2 suites
        boolean suiteBooking = hotel.bookRoom(2, true);

        System.out.printf("  👑 %-25s : %s%n", "King Suite Booking",
                suiteBooking ? "✅ SUCCESSFUL" : "❌ FAILED");

        // Book 5 basic rooms
        boolean roomBooking = hotel.bookRoom(5, false);

        System.out.printf("  🛏️ %-25s : %s%n", "Basic Room Booking",
                roomBooking ? "✅ SUCCESSFUL" : "❌ FAILED");

        System.out.println("------------------------------------------------");
        System.out.printf("              📊 UPDATED AVAILABILITY%n");
        System.out.println("------------------------------------------------");

        System.out.printf("  👑 %-25s : %d%n", "Remaining King Suites",
                hotel.getAvailableSuites());

        System.out.printf("  🛏️ %-25s : %d%n", "Remaining Basic Rooms",
                hotel.getAvailableRooms());

        System.out.println("================================================");
        System.out.printf("   💖 Thank you for choosing %s! 💖%n",
                hotel.getName());
        System.out.println("================================================");
    }



    //Creates new object for room.
    //Room room1  = new Room(false, false);

    //checks if the room is available or not.
    // if(room1.isAvailable()) {
    //System.out.println("room is available\n");
    //}
    //else {
    //System.out.println("room is unavailable\n");
    //}

    //room1.checkIn(); //checks if the room is checked in or not

    //room1.checkOut();//checks if the room is checked out or not

    //room1.cleanRoom();//checks if the room is clean or not.


    //Creates new object.
    //Reservation hotel = new Reservation("king", 3, 4,true);

    //calls the method to display the information.
    //hotel.displayReservationInfo();

    //Creates new employee object
    //Employee employee1 = new Employee("Shashwot", "Software",20,60);

    //calls the method to display the information.
    //employee1.displayEmployeeInfo();
}
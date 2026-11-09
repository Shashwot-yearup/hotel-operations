package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //Creates new object.
        Reservation hotel = new Reservation("king", 3, 4,true);

        //calls the method to display the information.
        hotel.displayReservationInfo();

        //Creates new employee object
        Employee employee1 = new Employee("shashwot", "Software",20,60);

        //calls the method to display the information.
        employee1.displayEmployeeInfo();

    }
}

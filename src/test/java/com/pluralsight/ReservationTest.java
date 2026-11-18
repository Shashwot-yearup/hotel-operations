package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    void getPrice_should_be_accurate_for_the_price(){
        //arrange
        var reservation = new Reservation("king", 1, false);

        //act
        var price = reservation.getPrice();

        //assert
        assertEquals(139, price);
    }


    @Test
    void getPrice_should_be_accurate_for_the_price_for_the_weekend() {
        //arrange
        var reservation = new Reservation("king", 1, true);

        //act
        var price = reservation.getPrice();

        //assert
        assertEquals(152.9, price);
    }

    @Test
    void getPrice_should_be_accurate_for_the_price_for_the_suites_with_weekend_and_3_nights() {
        //arrange
        var reservation = new Reservation("king", 3, true);

        //act
        double price = Math.round(reservation.getReservationTotal());

        //assert
        assertEquals(458.7, price);
    }
}
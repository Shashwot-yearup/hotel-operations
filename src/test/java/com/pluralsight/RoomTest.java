package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkin_should_returns_true_if_its_notOccupied_and_notDirty(){

        //arrange
        Room room = new Room(false, false);

        //act
        boolean result = room.checkIn();

        //assert
        assertTrue(result);
    }

    @Test
    void checkin_should_returns_false_if_its_Occupied_and_notDirty(){

        //arrange
        Room room = new Room(true, false);

        //act
        boolean result = room.checkIn();

        //assert
        assertFalse(result);
    }

    @Test
    void checkin_should_returns_false_if_its_notOccupied_and_Dirty(){

        //arrange
        Room room = new Room(false, true);

        //act
        boolean result = room.checkIn();

        //assert
        assertFalse(result);
    }

    @Test
    void checkin_should_returns_false_if_its_Occupied_and_Dirty(){

        //arrange
        Room room = new Room(true, true);

        //act
        boolean result = room.checkIn();

        //assert
        assertFalse(result);
    }
    @Test
    void cleanRoommm(){
        Room room = new Room(true, true);

        room.checkOut();

        assertFalse(room.isAvailable());
    }
}
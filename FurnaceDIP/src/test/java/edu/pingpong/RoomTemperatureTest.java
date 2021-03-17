package edu.pingpong;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RoomTemperatureTest{

    @Test
    public void testSetTemperature(){
        RoomTemperature temperature1 = new RoomTemperature(10);
        RoomTemperature temperature2 = new RoomTemperature(0);

        temperature1.setTemperature(13);
        assertEquals(13, temperature1.getTemperature(),0);

        temperature2.setTemperature(18);
        assertEquals(18, temperature2.getTemperature(),0);
    }

    @Test
    public void testIncrementTemperature(){
        RoomTemperature temperature1 = new RoomTemperature(10);
        RoomTemperature temperature2 = new RoomTemperature(0);

        temperature1.incrementTemperature(3);
        assertEquals(13, temperature1.getTemperature(),0);

        temperature2.incrementTemperature(4);
        assertEquals(4, temperature2.getTemperature(),0);
    }

}
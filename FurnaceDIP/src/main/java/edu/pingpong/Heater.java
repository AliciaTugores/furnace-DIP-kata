package edu.pingpong;

public interface Heater {

     void disengage(RoomTemperature temperature);
     void engage(RoomTemperature temperature);
}

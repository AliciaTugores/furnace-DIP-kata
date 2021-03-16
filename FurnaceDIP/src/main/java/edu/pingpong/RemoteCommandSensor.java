package edu.pingpong;

public class RemoteCommandSensor implements Thermometer{

    @Override
    public double read(RoomTemperature temperature) {
        return temperature.getTemperature();
    }
}

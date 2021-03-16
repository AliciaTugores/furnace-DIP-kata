package edu.pingpong;

public class RoomTemperature {

    private double temperature = 0d;

    public RoomTemperature(double temperature){
        this.temperature = temperature;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void incrementTemperature(double increment) {
        this.temperature += increment;
    }
}

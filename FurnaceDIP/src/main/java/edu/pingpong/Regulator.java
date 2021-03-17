package edu.pingpong;

public class Regulator {

    public void regulate(Thermometer termometro, Heater heater, double minTemp, double maxTemp, RoomTemperature temperature){
        RegulatorDisplayCodes code;
        while (termometro.read(temperature) < maxTemp) {
            code = RegulatorDisplayCodes.HEATING;
            heater.engage(temperature);
            showMessage(code, temperature);
        }
        while (termometro.read(temperature) > minTemp) {
            code = RegulatorDisplayCodes.WAITING;
            heater.disengage(temperature);
            showMessage(code, temperature);
        }
    }

    private void showMessage(RegulatorDisplayCodes code, RoomTemperature temperature) {
        switch (code) {
            case WAITING:
                System.out.println("WAITING... Temperature => " + temperature.getTemperature());
                break;
            case HEATING:
                System.out.println("HEATING... Temperature => " + temperature.getTemperature());
                break;
            default:
                System.out.println("Something strange it's happening...");
                break;
        }
    }
}

package Dispositivos;

import Trabajo.SmartDevice.SmartDevice;

public class smartWatch extends SmartDevice {

    int bandsize;
    String bandColor;
    String material;
    boolean operadorTelefonico;

    public smartWatch() {
    }

    public smartWatch(String fabricante, String deviceType, String modelo, String color, int year, int bandsize, String bandColor, String material, boolean operadorTelefonico) {
        super(fabricante, deviceType, modelo, color, year);
        this.bandsize = bandsize;
        this.bandColor = bandColor;
        this.material = material;
        this.operadorTelefonico = operadorTelefonico;
    }
}

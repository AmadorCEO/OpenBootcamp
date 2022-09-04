package Trabajo.SmartDevice;

public class SmartDevice {

    // 1. Atributos
    protected String fabricante;
    protected String deviceType;
    protected String modelo;
    protected String Color;
    protected int year;


    // 2. Constructores

    public SmartDevice(){

    }
    public SmartDevice(String fabricante, String deviceType, String modelo, String color, int year) {
        this.fabricante = fabricante;
        this.deviceType = deviceType;
        this.modelo = modelo;
        Color = color;
        this.year = year;
    }

    // 3. Metodos
}

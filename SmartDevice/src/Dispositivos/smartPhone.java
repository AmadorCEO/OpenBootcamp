package Dispositivos;

import Trabajo.SmartDevice.SmartDevice;

public class smartPhone extends SmartDevice {

    boolean cargaInalambrica;
    boolean debloqueoFacial;
    double screenSize;
    int cantidadCameras;

    public smartPhone(){
    }

    public smartPhone(String fabricante, String deviceType, String modelo, String color, int year, boolean cargaInalambrica, boolean debloqueoFacial, double screenSize, int cantidadCameras) {
        super(fabricante, deviceType, modelo, color, year);
        this.cargaInalambrica = cargaInalambrica;
        this.debloqueoFacial = debloqueoFacial;
        this.screenSize = screenSize;
        this.cantidadCameras = cantidadCameras;
    }
}

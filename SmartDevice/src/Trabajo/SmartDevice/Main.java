package Trabajo.SmartDevice;

import Dispositivos.smartPhone;
import Dispositivos.smartWatch;

public class Main {

    public static void main(String[] args) {

        smartPhone iPhone12 = new smartPhone("Apple", "Teléfono Inteligente","iPhone 12","Dorado",2020,true,true,6.06,3);
        smartWatch huaweiG3 = new smartWatch("Huawei", "Smart Watch","Watch GT3","Metalico",2022,46,"Negro","Aluminio",false);


        System.out.println(iPhone12.fabricante);
        System.out.println(iPhone12.modelo);
        System.out.println(iPhone12.deviceType);
        System.out.println(" ");
        System.out.println(huaweiG3.fabricante);
        System.out.println(huaweiG3.modelo);
        System.out.println(huaweiG3.deviceType);
    }
}

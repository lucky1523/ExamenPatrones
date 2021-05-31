package Examen.ejercicio2;

public class Client {
    public static void main(String[] args){
        Televisor televisorBase = new Televisor();
        televisorBase.setVersionSistemaOp("11.0");
        televisorBase.setSistemaOperativo("Android");
        televisorBase.setPuertoUsb(80);
        televisorBase.setResolucion(50);
        televisorBase.setPuertoHdmi(true);
        televisorBase.setPuertoUsb(4);
        televisorBase.setControlRemoto(true);
        televisorBase.setBluetooth(true);
        televisorBase.setSerial("XXXXXXXXX");

        Televisor televisor1 = (Televisor) televisorBase.clone();
        televisor1.setSerial("0111111111");
        Televisor televisor2 = (Televisor) televisorBase.clone();
        televisor2.setSerial("0111111112");
        Televisor televisor3 = (Televisor) televisorBase.clone();
        televisor3.setSerial("0111111113");
        Televisor televisor4 = (Televisor) televisorBase.clone();
        televisor4.setSerial("0111111114");
        Televisor televisor5 = (Televisor) televisorBase.clone();
        televisor5.setSerial("0111111115");

        televisor1.showInfo();
        televisor2.showInfo();
        televisor3.showInfo();
        televisor4.showInfo();
        televisor5.showInfo();

    }
}

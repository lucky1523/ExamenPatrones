package Examen.ejercicio2;

public class Televisor implements ITelevisor{
    private String sistemaOperativo;
    private String versionSistemaOp;
    private int pulgadas;
    private int resolucion;
    private boolean puertoHdmi;
    private int puertoUsb;
    private boolean controlRemoto;
    private boolean bluetooth;
    private String serial;

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getVersionSistemaOp() {
        return versionSistemaOp;
    }

    public void setVersionSistemaOp(String versionSistemaOp) {
        this.versionSistemaOp = versionSistemaOp;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isPuertoHdmi() {
        return puertoHdmi;
    }

    public void setPuertoHdmi(boolean puertoHdmi) {
        this.puertoHdmi = puertoHdmi;
    }

    public int getPuertoUsb() {
        return puertoUsb;
    }

    public void setPuertoUsb(int puertoUsb) {
        this.puertoUsb = puertoUsb;
    }

    public boolean isControlRemoto() {
        return controlRemoto;
    }

    public void setControlRemoto(boolean controlRemoto) {
        this.controlRemoto = controlRemoto;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    @Override
    public Object clone() {
        Televisor objClone = new Televisor();
        objClone.setSistemaOperativo(this.sistemaOperativo);
        objClone.setVersionSistemaOp(this.versionSistemaOp);
        objClone.setPulgadas(this.pulgadas);
        objClone.setPuertoHdmi(this.puertoHdmi);
        objClone.setPuertoUsb(this.puertoUsb);
        objClone.setBluetooth(this.bluetooth);
        objClone.setControlRemoto(this.controlRemoto);
        objClone.setSerial(this.serial);
        return objClone;

    }

    public void showInfo(){
        System.out.println("*************************************");
        System.out.println("sistemaOperativo : " +sistemaOperativo);
        System.out.println("versionSistemaOp : " +versionSistemaOp);
        System.out.println("pulgadas : " +pulgadas);
        System.out.println("resolucion : " +resolucion);
        System.out.println("puertoHdmi : " +puertoHdmi);
        System.out.println("puertoUsb : " +puertoUsb);
        System.out.println("controlRemoto : " +controlRemoto);
        System.out.println("bluetooth : " +bluetooth);
        System.out.println("serial : " +serial);

    }
}

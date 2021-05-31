package Examen.ejercicio4;

public class Client {
    public static void main(String[] args){
        Cine cine = new Cine();
        PaqueteMediano paqueteMediano = new PaqueteMediano();
        MegaPaquete megaPaquete = new MegaPaquete();
        PaqueteNormal paqueteNormal = new PaqueteNormal();

        cine.setBuilderCombo(megaPaquete);
        cine.armarCombo();
        Combo comboMega = cine.getCombo();
        comboMega.showData();

        cine.setBuilderCombo(paqueteMediano);
        cine.armarCombo();
        Combo comboMediano = cine.getCombo();
        comboMediano.showData();

        cine.setBuilderCombo(paqueteNormal);
        cine.armarCombo();
        Combo comboNormal = cine.getCombo();
        comboNormal.showData();


    }
}

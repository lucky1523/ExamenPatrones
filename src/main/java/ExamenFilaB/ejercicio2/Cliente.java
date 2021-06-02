package ExamenFilaB.ejercicio2;

public class Cliente {
    public static void main (String[] args) {
        celularA1 celularBase = new celularA1();
        celularBase.setPeso("60");
        celularBase.setTamanio("20 cm");
        celularBase.setPaisCreado("Bolivia");
        celularBase.setImei("0000");
        celularBase.setModelo("A1");
        celularBase.setCamara(new Camara("10","5mp"));

        celularA1 celularA1_1 = (celularA1) celularBase.clone();
        celularA1_1.setImei("000001");

        celularA1 celularA1_2 = (celularA1) celularBase.clone();
        celularA1_2.setImei("000002");

        celularA1 celularA1_3 = (celularA1) celularBase.clone();
        celularA1_3.setImei("000003");

        celularA1 celularA1_4 = (celularA1) celularBase.clone();
        celularA1_4.setImei("000004");

        celularA1 celularA1_5 = (celularA1) celularBase.clone();
        celularA1_5.setImei("000005");

        celularA1_1.showInformation();
        celularA1_2.showInformation();
        celularA1_3.showInformation();
        celularA1_4.showInformation();
        celularA1_5.showInformation();

    }
}

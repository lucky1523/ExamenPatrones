package Examen.ejercicio1;

public class Vehiculo {
    private String placa;
    private String modelo;
    private String kilometraje;

    public Vehiculo(){}
    public Vehiculo(String placa, String modelo, String kilometraje) {
        this.placa = placa;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void showVehiculo(){
        System.out.println("************************************");
        System.out.println("Placa: "+placa);
        System.out.println("Modelo: "+modelo);
        System.out.println("Kilometraje: "+kilometraje);
        System.out.println("************************************");
    }
}
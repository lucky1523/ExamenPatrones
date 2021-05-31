package Examen.ejercicio1;

import java.util.HashMap;

public class Peaje {

    private static Peaje instancia;
    private int saldo;
    private int numVehiculo;
    private HashMap<Integer, Vehiculo> autos;

    private Peaje(){
        this.numVehiculo=6;
        this.saldo=0;
        this.autos= new HashMap<>();
        System.out.println("************************************");
        System.out.println("Instanciando el peaje");
        System.out.println("************************************");
        rellenarAutos();
    }

    public void rellenarAutos(){
        for(int i= 1 ; i<=6;i++ ){
            autos.put(i,new Vehiculo("default","default","defalut"));
        }
    }

    public static synchronized void makeInstance(){
        if(instancia == null){
            instancia = new Peaje();
        }
    }

    public static  Peaje getInstance(){
        if(instancia ==null){
            makeInstance();
        }
        return instancia;
    }

    public synchronized void cobroPeaje(int monto, Vehiculo vehiculo){
        saldo = saldo+monto;
        autos.put(++numVehiculo,vehiculo);
        System.out.println("Se resivio: "+monto+" del auto: ");
        vehiculo.showVehiculo();
    }

    public int getSaldo(){
        return saldo;
    }

    public int getNumVehiculo() {
        return numVehiculo;
    }

    public HashMap<Integer, Vehiculo> getAutos() {
        return autos;
    }
}

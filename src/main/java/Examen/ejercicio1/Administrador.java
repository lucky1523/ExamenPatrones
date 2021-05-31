package Examen.ejercicio1;
import java.util.HashMap;
public class Administrador {

    private String nombre;
    private String codigo;

    public  Administrador(){}

    public void consultarSaldoCaseta(){
        int saldo= Peaje.getInstance().getSaldo();
        System.out.println("El saldo recaudado por la caseta de peaje es: "+saldo);
    }

    public void consultarVehiculos(){
        HashMap<Integer, Vehiculo> autos = Peaje.getInstance().getAutos();
        int numVehiculos = Peaje.getInstance().getNumVehiculo();

        System.out.println("El numero de vehiculos que pasaron es: "+numVehiculos);
        System.out.println("La lista de autos es: ");
        for(Integer num : autos.keySet()){
            autos.get(num).showVehiculo();
        }
    }
}
package Examen.ejercicio1;

public class Cliente {
    public static void main(String[]args){


        Conductor conductor1= new Conductor();
        conductor1.pagarPeaje(50,new Vehiculo("2315-UHB","Suzuki grand vitara","50.000 km"));
        conductor1.pagarPeaje(50,new Vehiculo("4587-IYB","Toyota corolla","100.000 km"));


        Administrador admi= new Administrador();
        admi.consultarSaldoCaseta();
        admi.consultarVehiculos();

        Conductor conductor2= new Conductor();
        conductor1.pagarPeaje(50,new Vehiculo("2315-UHB","Toyota","10.000 km"));
        conductor1.pagarPeaje(50,new Vehiculo("4587-IYB","Nissan","200.000 km"));


        Administrador admi2= new Administrador();
        admi.consultarSaldoCaseta();
        admi.consultarVehiculos();
    }
}

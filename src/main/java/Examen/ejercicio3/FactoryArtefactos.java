package Examen.ejercicio3;

public abstract class FactoryArtefactos {
    public enum artefacto{
        TELEVISION, RADIO, BATIDORA, REFRIGERADOR, MICROONDAS
    }
    public static IArtefactoElectronico make(artefacto tipo){
        IArtefactoElectronico artefactoElectronico;
        switch (tipo){
            case TELEVISION:
                System.out.println("television");
                artefactoElectronico=  new Television();
                ((Television) artefactoElectronico).setPrecio("1500 $");
                break;
            case RADIO:
                artefactoElectronico=  new Radio();
                ((Radio) artefactoElectronico).setPrecio("80 $");
                break;
            case BATIDORA:
                artefactoElectronico=  new Batidora();
                ((Batidora) artefactoElectronico).setPrecio("120 $");
                break;
            case MICROONDAS:
                artefactoElectronico=  new Microondas();
                ((Microondas) artefactoElectronico).setPrecio("1500 $");
                break;
            case REFRIGERADOR:
                artefactoElectronico=  new Refrigerador();
                ((Refrigerador) artefactoElectronico).setPrecio("1500 $");
                break;
            default:
                artefactoElectronico = new Television();
                ((Television) artefactoElectronico).setPrecio("40 $");
                break;
        }
        return artefactoElectronico;
    }
}

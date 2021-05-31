package Examen.ejercicio3;

public class Batidora implements IArtefactoElectronico{
    private String precio;
    public Batidora(){}
    @Override
    public void crear() {
        System.out.println("Creando television : Precio :"+ precio);
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }
}

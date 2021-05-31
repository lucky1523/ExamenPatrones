package Examen.ejercicio3;

public class Refrigerador implements IArtefactoElectronico{
    private String precio;
    public Refrigerador(){}
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

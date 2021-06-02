package ExamenFilaB.ejercicio3;

public class Tenis implements IProducto{
    public String tamano;
    public String color;
    public  String garantia;
    public String precio;

    public Tenis(){}

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public void crear() {
        System.out.println("********** Creando tenis *******");
        System.out.println("tamano: "+tamano);
        System.out.println("color: "+color);
        System.out.println("garantia: "+garantia);
        System.out.println("precio: "+precio);
    }

}


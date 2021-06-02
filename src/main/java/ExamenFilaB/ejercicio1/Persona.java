package ExamenFilaB.ejercicio1;

public class Persona {
    private String nombre;
    private String ci;
    private String cargo;

    public  Persona() {}
    public Persona(String nombre, String ci,String cargo){
        this.nombre=nombre;
        this.ci=ci;
        this.cargo=cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

package ExamenFilaB.ejercicio4;



public abstract class BuilderParrila {
    protected Parrila parrila;

    public Parrila getParrila() {
        return parrila;
    }
    public void createParrila(){
        parrila= new Parrila();
    }

    public abstract void tipoDdeCarne();
    public abstract void saborRefresco();
    public abstract void guarniciones();
}
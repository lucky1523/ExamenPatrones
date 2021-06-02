package ExamenFilaB.ejercicio4;

public class ParrilaLomito extends BuilderParrila{
    @Override
    public void tipoDdeCarne() {
        parrila.setTipoDeCarne("Lomito");
    }

    @Override
    public void saborRefresco() {
        parrila.setTipoDeRefresco("Papa");

    }

    @Override
    public void guarniciones() {
        parrila.setGuarniciones("Pepsi");

    }
}
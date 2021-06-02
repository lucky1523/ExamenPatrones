package ExamenFilaB.ejercicio4;

public class ParrilaBife extends BuilderParrila{
    @Override
    public void tipoDdeCarne() {
        parrila.setTipoDeCarne("Bife");
    }

    @Override
    public void saborRefresco() {
        parrila.setTipoDeRefresco("Arroz");

    }

    @Override
    public void guarniciones() {
        parrila.setGuarniciones("cocacola");

    }
}

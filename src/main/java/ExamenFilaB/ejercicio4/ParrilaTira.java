package ExamenFilaB.ejercicio4;

public class ParrilaTira extends BuilderParrila{
    @Override
    public void tipoDdeCarne() {
        parrila.setTipoDeCarne("Tira");
    }

    @Override
    public void saborRefresco() {
        parrila.setTipoDeRefresco("Huevo");

    }

    @Override
    public void guarniciones() {
        parrila.setGuarniciones("Fanta");

    }
}
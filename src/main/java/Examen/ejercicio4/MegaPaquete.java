package Examen.ejercicio4;

public class MegaPaquete extends BuilderCombo{
    @Override
    public void buildPipoca() {
        combo.setPipoca("Extragrande");
    }

    @Override
    public void buildRefresco() {
        combo.setRefresco("3 extrandes con recarga ilimitada");

    }

    @Override
    public void buildChocolate() {
        combo.setChocolate("2 chocolates grandes");
    }
}

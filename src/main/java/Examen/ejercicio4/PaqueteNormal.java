package Examen.ejercicio4;

public class PaqueteNormal extends BuilderCombo{
    @Override
    public void buildPipoca() {
        combo.setPipoca("Envase normal");
    }

    @Override
    public void buildRefresco() {
        combo.setRefresco("1");

    }

    @Override
    public void buildChocolate() {
        combo.setChocolate("0");
    }
}
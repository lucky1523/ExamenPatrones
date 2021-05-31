package Examen.ejercicio4;

public class PaqueteMediano extends BuilderCombo{
    @Override
    public void buildPipoca() {
        combo.setPipoca("grande");
    }

    @Override
    public void buildRefresco() {
        combo.setRefresco("2 vasos");

    }

    @Override
    public void buildChocolate() {
        combo.setChocolate("1");
    }
}

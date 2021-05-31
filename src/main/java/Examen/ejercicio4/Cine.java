package Examen.ejercicio4;

public class Cine {
    private BuilderCombo builderCombo;
    public void setBuilderCombo(BuilderCombo builderCombo){
        this.builderCombo=builderCombo;
    }

    public Combo getCombo() {
        return builderCombo.getCombo();
    }

    public void armarCombo(){
        this.builderCombo.createCombo();
        this.builderCombo.buildPipoca();
        this.builderCombo.buildChocolate();
        this.builderCombo.buildRefresco();
    }

}

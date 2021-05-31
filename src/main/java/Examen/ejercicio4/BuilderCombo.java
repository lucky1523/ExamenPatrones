package Examen.ejercicio4;

public abstract class BuilderCombo {
    protected  Combo combo;

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }
    public void createCombo(){
        combo=new Combo();
    }

    public abstract void buildPipoca();
    public abstract void buildRefresco();
    public abstract void buildChocolate();


}

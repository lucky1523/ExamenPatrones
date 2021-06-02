package ExamenFilaB.ejercicio4;

public class Cocinero {
    private BuilderParrila builderParrila;

    public void setBuilderParrila(BuilderParrila builderParrila) {
        this.builderParrila = builderParrila;
    }

    public Parrila getBuilderParrila() {
        return builderParrila.getParrila();
    }
        public void cocinarParrilla() {
            this.builderParrila.createParrila();
            this.builderParrila.tipoDdeCarne();
            this.builderParrila.saborRefresco();
            this.builderParrila.guarniciones();

        }
    }

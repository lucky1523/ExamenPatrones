package ExamenFilaB.ejercicio4;

public class Parrila {
    public String tipoDeCarne;
    public String guarniciones;
    public String tipoDeRefresco;

    public Parrila(){}

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        this.guarniciones = guarniciones;
    }

    public String getTipoDeRefresco() {
        return tipoDeRefresco;
    }

    public void setTipoDeRefresco(String tipoDeRefresco) {
        this.tipoDeRefresco = tipoDeRefresco;
    }
    public void showData() {
        System.out.println("**********************************");
        System.out.println("carne : "+tipoDeCarne);
        System.out.println("refresco : "+tipoDeRefresco);
        System.out.println("guarniciones" + guarniciones);



    }
}

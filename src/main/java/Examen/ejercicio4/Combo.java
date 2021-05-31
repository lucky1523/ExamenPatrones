package Examen.ejercicio4;

public class Combo {
    private String pipoca;
    private String refresco;
    private String chocolate;
    public Combo(){}

    public String getPipoca() {
        return pipoca;
    }

    public void setPipoca(String pipoca) {
        this.pipoca = pipoca;
    }

    public String getRefresco() {
        return refresco;
    }

    public void setRefresco(String refresco) {
        this.refresco = refresco;
    }

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }
    public void showData() {
        System.out.println("*************************************");
        System.out.println("pipoca : " + pipoca);
        System.out.println("refresco : " + refresco);
        System.out.println("chocolate : " + chocolate);

    }
}

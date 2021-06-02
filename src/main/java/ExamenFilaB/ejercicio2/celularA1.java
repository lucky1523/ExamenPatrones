package ExamenFilaB.ejercicio2;

public class celularA1 implements CelularBase {
    private String modelo;
    private String tamanio;
    private String peso;
    private Camara camara;
    private String imei;
    private String paisCreado;

    public celularA1(){}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getPaisCreado() {
        return paisCreado;
    }

    public void setPaisCreado(String paisCreado) {
        this.paisCreado = paisCreado;
    }

    @Override
    public Object clone() {
        celularA1 objClone = new celularA1();
        objClone.setModelo(this.modelo);
        objClone.setImei(this.imei);
        objClone.setPaisCreado(this.paisCreado);
        objClone.setTamanio(this.tamanio);
        objClone.setCamara(this.camara);
        objClone.setPeso(this.peso);
        return objClone;
    }

    public void showInformation() {
        System.out.println("******************************");
        System.out.println("tamaño: " + tamanio);
        System.out.println("modelo: " + modelo);
        System.out.println("paisCreado: " + paisCreado);
        System.out.println("camara (foco y lente ): " + camara.getFoco() + camara.getLente());
        System.out.println(" peso: " + peso);
        System.out.println("imei: " + imei);
    }
}

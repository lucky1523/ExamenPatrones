package ExamenFilaB.ejercicio4;

public class Client {
    public static void main (String []args) {
        Cocinero juen = new Cocinero();
        ParrilaLomito parrilaLomito= new ParrilaLomito();
        ParrilaBife parrilaBife = new ParrilaBife();
        ParrilaTira parrilaTira = new ParrilaTira();

        juen.setBuilderParrila(parrilaBife);
        juen.cocinarParrilla();
        Parrila parrilabife = juen.getBuilderParrila();
        parrilabife.showData();

        juen.setBuilderParrila(parrilaLomito);
        juen.cocinarParrilla();
        Parrila parrilLomito = juen.getBuilderParrila();
        parrilLomito.showData();

        juen.setBuilderParrila(parrilaTira);
        juen.cocinarParrilla();
        Parrila parrilatira = juen.getBuilderParrila();
        parrilatira.showData();


    }
}

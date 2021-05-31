package Examen.ejercicio5;

public class Client {
    public static void main(String[] args){
        String operacion= "1 sumar 2 restar 2 sumar 1 sumar 1";

        InterpreterOperaciones interpreterOperaciones = new InterpreterOperaciones(operacion);
        System.out.println("operacion: "+ operacion);
        System.out.println("Resultado: " + interpreterOperaciones.interpretar());
    }
}

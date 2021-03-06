package ExamenFilaB.ejercicio1;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Ventanilla {
    private static Ventanilla instance = null;

    private Map<String, Estudiante> estudianteMap = new HashMap<>();
    private Map<String, String> estudianteInscripcionMap = new HashMap<>();
    private Map<String, Integer> estudiantePago = new HashMap<>();
    private int amount = 0;

    private Ventanilla() {
    }

    private synchronized static void makeInstance() {
        if (instance == null)
            instance = new Ventanilla();
    }

    public static Ventanilla getInstance() {
        if (instance == null)
            makeInstance();

        return instance;
    }

    public void addEstudiante(Estudiante estudiante, int pagoMatricula) {
        if (!estudianteMap.containsKey(estudiante.getCi())) {
            estudianteMap.put(estudiante.getCi(), estudiante);
            estudianteInscripcionMap.put(estudiante.getCi(), new Date().toString());
            estudiantePago.put(estudiante.getCi(), pagoMatricula);
            amount = amount + pagoMatricula;
            System.out.println("Matriculando ...");
            System.out.println("Datos " + estudiante.getCi() + "\n" + estudiante.getNombre() + "\n" + pagoMatricula);
        } else {
            System.out.println("El estuadiante ya esta Matriculado!");
            System.out.println("Datos Rechazados " + estudiante.getCi() + "\n" + estudiante.getNombre() + "\n" + pagoMatricula);

        }

    }

    public void consultaDatos() {
        for (String key : estudianteMap.keySet()
        ) {
            System.out.println("* Estudiante CI:" + estudianteMap.get(key).getCi());
            System.out.println("  Estudiante Nombre:" + estudianteMap.get(key).getCi());
            System.out.println("  Matricula " + estudiantePago.get(key));
            System.out.println("  Time " + estudianteInscripcionMap.get(key));
        }

        System.out.println("  Total Recaudado " + amount);
    }


}

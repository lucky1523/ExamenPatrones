package ExamenFilaB.ejercicio1;

public class Colegio {
    private String nombreColegio;

    public Colegio(){}

    public Colegio(String nombreColegio) {
        this.nombreColegio = nombreColegio;
    }

    public void Matricularse(Estudiante estudiante, int pagoMatricula){
        Ventanilla.getInstance().addEstudiante(estudiante,pagoMatricula);
    }

    public void consultarListaEstudiantes(Persona persona){
        if (persona.getCargo().equals("HHRR")){
            Ventanilla.getInstance().consultaDatos();
        }else{
            System.out.println("No tiene permisos de consultar");
        }
    }
}

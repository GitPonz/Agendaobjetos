package agendaobjetos;

/**
 * @author alumno
 */
public class Gestor {
    private String nombre;
    private Persona[] vAgenda;

    public Gestor(String nombre) {
        this.nombre = nombre;
        this.vAgenda = new Persona[10];
    }
    
}

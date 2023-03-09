
/**
 *
 * Clase que representa una persona con edad, nombre y provincia.
 */
public class Persona {

    private int edad;
    private String nombre;
    private String provincia;

    /**
     *
     * Constructor de la clase Persona.
     *
     * @param edad la edad de la persona
     * @param nombre el nombre de la persona
     * @param provincia la provincia donde vive la persona
     */
    public Persona(int edad, String nombre, String provincia) {
        this.edad = edad;
        this.nombre = nombre;
        this.provincia = provincia;
    }

    /**
     *
     * Retorna la edad de la persona.
     *
     * @return la edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * Actualiza la edad de la persona.
     *
     * @param edad la nueva edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * Retorna el nombre de la persona.
     *
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * Actualiza el nombre de la persona.
     *
     * @param nombre el nuevo nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * Retorna la provincia donde vive la persona.
     *
     * @return la provincia donde vive la persona
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     *
     * Actualiza la provincia donde vive la persona.
     *
     * @param provincia la nueva provincia donde vive la persona
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}

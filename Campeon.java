/**
 * Clase Persona: Representa un objeto persona con métodos para obtener y mostrar las caracteristicas del campeon.
 */
public class Campeon {
    /******************** Atributos ********************/
    String nombredelpersonaje;
    int numerodevidas;
    String tipodeclase;

    /******************** Métodos ********************/
    /**
     * Constructor de la clase Campeon: Inicializa los atributos del personaje.
     * @param nombredelpersonaje
     * @param numerodevidas
     * @param tipodeclase
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public Campeon(String nombredelpersonaje, int numerodevidas, String tipodeclase) {
        this.nombredelpersonaje = nombredelpersonaje;
        this.numerodevidas = numerodevidas;
        this.tipodeclase = tipodeclase;
    }

    /**
     * Método para obtener el nombre del Personaje.
     * @return El nombre del Personaje
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public String obtenerNombredelPersonaje() {
        return nombredelpersonaje;
    }

    /**
     * Método para obtener las vidas del Campeon.
     * @return La edad de la persona.
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public int obtenerNuemrodevidas() {
        return numerodevidas;
    }

    /**
     * Método para obtener el tipo de clase del Campeon.
     * @return La dirección de la persona.
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public String obtenerTipodeclase() {
        return tipodeclase;
    }
}

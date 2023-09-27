/**
 * Clase Principal: Crea un objeto llmado campeon y llama a los métodos para obtener y mostrar el nombre del campeon, el numero de vidas y la caracteristica del campeon.
 */
public class Principal {
    /**
     * El primer metodo que se ejecutara en mi programa
     * @param args
     * Complejidad temporal: O(1) Tiempo Constante
     */
    public static void main(String[] args) {
        // Crear el objeto llamado campeon
        Campeon campeon= new Campeon ("Lux", 3, "Guerra y Magico");

        // Llamar a los métodos para obtener y mostrar las caracteristicas del Campeon
        String nombredelpersonaje = campeon.obtenerNombredelPersonaje();
        int nuemerodevidas = campeon.obtenerNuemrodevidas();
        String tipodeclase = campeon.obtenerTipodeclase();

        // Imprime la información obtenida del Campeon
        System.out.println(" NombredelPersonaje: " + nombredelpersonaje + " NumeroDeVidas: " + nuemerodevidas + " TipoDeClase: " + tipodeclase);

    }
}
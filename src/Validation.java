public class Validation {
    /**
     * Método estático que valida si un un string es de un tamaño determinado
     * @param string String a validar
     * @param size Tamaño del string
     * @return true si el string es del tamaño indicado, false si no
     */
    public static boolean validateSize(String string, int size) {
        return string.length() == size;
    }
}

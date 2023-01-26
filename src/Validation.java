public class Validation {
    /**
     * Método estático que valida si un número está dentro de un rango
     * @param number Número a validar
     * @param min Rango mínimo
     * @param max Rango máximo
     * @return true si el número está dentro del rango, false si no
     */
    public static boolean isNumberInRange(double number, double min, double max) {
        return number >= min && number <= max;
    }
}

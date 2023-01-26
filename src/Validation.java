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

    /**
     * Método estático que valida si un número es positivo
     * @param number Número a validar
     * @return true si el número es positivo, false si no
     */
    public static boolean isPositiveNumber(double number) {
        return number >= 0;
    }

    /**
     * Método estático que valida si un número es negativo
     * @param number Número a validar
     * @return true si el número es negativo, false si no
     */
    public static boolean isNegativeNumber(double number) {
        return number < 0;
    }
}

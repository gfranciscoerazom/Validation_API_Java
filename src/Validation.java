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

    /**
     * Método estático que valida si un un string es un número entero
     * @param string String a validar
     * @return true si el string es un número entero, false si no
     */
    public static boolean validateInteger(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Método estático que valida si un un string es un número decimal
     * @param string String a validar
     * @return true si el string es un número decimal, false si no
     */
    public static boolean validateDouble(String string) {
        try {
            Double.parseDouble(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Método estático que valida si un un string es un número entero positivo
     * @param string String a validar
     * @return true si el string es un número entero positivo, false si no
     */
    public static boolean validatePositiveInteger(String string) {
        try {
            int number = Integer.parseInt(string);
            return number >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Método estático que valida si un un string es un número decimal positivo
     * @param string String a validar
     * @return true si el string es un número decimal positivo, false si no
     */
    public static boolean validatePositiveDouble(String string) {
        try {
            double number = Double.parseDouble(string);
            return number >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Método estático que valida si un un string es un número entero negativo
     * @param string String a validar
     * @return true si el string es un número entero negativo, false si no
     */
    public static boolean validateNegativeInteger(String string) {
        try {
            int number = Integer.parseInt(string);
            return number < 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Método estático que valida si un un string es un número decimal negativo
     * @param string String a validar
     * @return true si el string es un número decimal negativo, false si no
     */
    public static boolean validateNegativeDouble(String string) {
        try {
            double number = Double.parseDouble(string);
            return number < 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Método estático que valida si un un string es un número entero positivo o cero
     * @param string String a validar
     * @return true si el string es un número entero positivo o cero, false si no
     */
    public static boolean validatePositiveOrZeroInteger(String string) {
        try {
            int number = Integer.parseInt(string);
            return number >= 0;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /**
     * Método estático que valida si un un string es un e-mail válido
     * @param string String a validar
     * @return true si el string es un e-mail válido, false si no
     */
    public static boolean validateEmail(String string) {
        return string.matches("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");
    }
}

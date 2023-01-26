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

    /**
     * Método estático que valida si un un string es un número de teléfono válido
     * @param string String a validar
     * @return true si el string es un número de teléfono válido, false si no
     */
    public static boolean validatePhoneNumber(String string) {
        return string.matches("^\\d{9}$");
    }

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

    /**
     * Método estático que valida si un número es par
     * @param number Número a validar
     * @return true si el número es par, false si no
     */
    public static boolean isEvenNumber(double number) {
        return number % 2 == 0;
    }

    /**
     * Método estático que valida si un número es impar
     * @param number Número a validar
     * @return true si el número es impar, false si no
     */
    public static boolean isOddNumber(double number) {
        return number % 2 != 0;
    }
    /**
     * Método estático que valida si un número está dentro de un rango
     * @param number Número a validar
     * @param min Rango mínimo
     * @param max Rango máximo
     * @return true si el número está dentro del rango, false si no
     */
    public static boolean isNumberInRange(int number, int min, int max) {
        return number >= min && number <= max;
    }

    /**
     * Método estático que valida si un número es positivo
     * @param number Número a validar
     * @return true si el número es positivo, false si no
     */
    public static boolean isPositiveNumber(int number) {
        return number >= 0;
    }

    /**
     * Método estático que valida si un número es negativo
     * @param number Número a validar
     * @return true si el número es negativo, false si no
     */
    public static boolean isNegativeNumber(int number) {
        return number < 0;
    }

    /**
     * Método estático que valida si un número es par
     * @param number Número a validar
     * @return true si el número es par, false si no
     */
    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

    /**
     * Método estático que valida si un número es impar
     * @param number Número a validar
     * @return true si el número es impar, false si no
     */
    public static boolean isOddNumber(int number) {
        return number % 2 != 0;
    }
}

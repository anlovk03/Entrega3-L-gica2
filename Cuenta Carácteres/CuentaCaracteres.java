// Ejercicio 6
public class CuentaCaracteres {

    public static int contarCaracter(String cadena, char caracter, int indice) {
        // Caso base: si el índice alcanza la longitud de la cadena, detener la recursión
        if (indice == cadena.length()) {
            return 0;
        }
        // Comparar el carácter en el índice actual y sumarle 1 si este coincide 
        return (cadena.charAt(indice) == caracter ? 1 : 0) + contarCaracter(cadena, caracter, indice + 1);
    }

    public static void main(String[] args) {
        String cadena = "programacion"; 
        char caracter = 'o';           // Carácter específico para el ejercicio
        int resultado = contarCaracter(cadena, caracter, 0); // Llamada inicial
        System.out.println("El carácter '" + caracter + "' aparece " + resultado + " veces en la cadena \"" + cadena + "\".");
    }
}

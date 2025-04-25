// Ejercicio 5
public class RevertirCadena {

    public static String invertir(String cadena) {
        // Caso base: si la longitud de la cadena es 0 o 1, vamos a devolverla tal cual
        if (cadena.length() <= 1) {
            return cadena;
        }
        // Llamada recursiva: tomamos el último carácter y lo concatenamos con el resto invertido
        return cadena.charAt(cadena.length() - 1) + invertir(cadena.substring(0, cadena.length() - 1));
    }

    public static void main(String[] args) {
        String entrada = "hola"; // Ejemplo de la entrada
        String salida = invertir(entrada); // Llama a la función recursiva
        System.out.println("La cadena invertida de \"" + entrada + "\" es: \"" + salida + "\"");
    }
}
//Ejercicio 2
public class Palindromo {
    public static boolean verificar(String palabra, int inicio, int fin) {
        return inicio >= fin || (palabra.charAt(inicio) == palabra.charAt(fin) && verificar(palabra, inicio + 1, fin - 1)); //Verificamos la cantidad de letras
    }

    public static void main(String[] args) {
        System.out.println(verificar("reconocer", 0, "reconocer".length() - 1)); // Colocamos la palabra que queramos reconocer
    }
}

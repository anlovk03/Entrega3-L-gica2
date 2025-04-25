// Ejercicio 1
public class ImprimirNumDescendente {

    public static void main(String[] args) {
        imprimirNumeros(100); // Llamamos 1 al 100
    }

    public static void imprimirNumeros(int numero) {
        if (numero >= 1) { // Caso base: detenerse cuando el número sea menor que 1
            System.out.println(numero); // Imprime el número actual
            imprimirNumeros(numero - 1); // Llamada recursiva con el número descendente que sigue
        }
    }
}

// Ejercicio 4
public class SerieFibonacci {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Caso base: el término 0 es 0
        }
        if (n == 1) {
            return 1; // Caso base: el término 1 es 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Sumamos los dos términos anteriores
    }

    public static void main(String[] args) {
        int n = 6; 
        System.out.println("El término " + n + " de la serie de Fibonacci es: " + fibonacci(n));
    }
}

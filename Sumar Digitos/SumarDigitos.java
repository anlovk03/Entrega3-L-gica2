//Ejercicio 3
public class SumarDigitos {

    public static int sumarDigitos(int numero) {
        if (numero == 0) {
            return 0; // Caso base: cuando el número es 0 detenemos la recursión
        }
        return (numero % 10) + sumarDigitos(numero / 10); // Suma el último dígito y se llama a sí mismo con el resto
    }

    public static void main(String[] args) {
        int numero = 1234;
        int suma = sumarDigitos(numero); // Llama a la función recursiva
        System.out.println("La suma de los dígitos de " + numero + " es: " + suma);
    }
}

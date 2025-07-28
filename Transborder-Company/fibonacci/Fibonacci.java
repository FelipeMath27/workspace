
package fibonacci;

/** Haz que la función FibonacciChecker(num) devuelva la cadena "yes" si el número dado es parte de la secuencia de Fibonacci.
 Esta secuencia se define por:
 Fn = Fn-1 + Fn-2,
 lo que significa que para encontrar el número Fn, se suman los dos números anteriores.

 Los primeros dos números de la secuencia son 0 y 1, y luego sigue: 1, 2, 3, 5, 8, 13, 21, ..., etc.
 Si el número no está en la secuencia de Fibonacci, retorna la cadena "no"*/

public class Fibonacci {
    public static String isFibonacciString(int n) {
        if (n < 0) {
            return "The number must be greater or equal than zero";
        } else if (n == 0 || n == 1) {
            return "yes"; // Cambiado a "yes"
        } else {
            int a = 0, b = 1; // ¡b = 1, no 0!
            while (b < n) {
                int temp = b;
                b = a + b;
                a = temp;
            }
            return (b == n || a == n) ? "yes" : "no";
        }
    }
}

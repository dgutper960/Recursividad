package Ejercicios_Basicos;
public class Main {
    public static void main(String[] args) {
        // Números atrás
        System.out.println("Ejercicion1:\nCuenta atrás desde un número dado: ");
        numerosAtras(7);
        System.out.println("\n______________________________________________________\n");

        // Suma Números
        System.out.println("Ejercicio 2:\nSuma de los números hasta n: ");
        System.out.println(sumaNumeros(8));
        System.out.println("______________________________________________________");

        // Figonnaci
        System.out.println("Ejercicio 3:\nSecuencia de Fibonnaci hasta el núm dado: ");
        System.out.println(sucesionFibonnaci(17));
        System.out.println("______________________________________________________");

        // Máximo común divisor
        System.out.println("Ejercicio 4:\nMáximo común divisor entre dos núm dados: ");
        System.out.println(maximoComunDivisor(12, 610));
        System.out.println("______________________________________________________");

        // Factorial
        System.out.println("Ejercicio 5:\nResuelve el factorial de un número dado: ");
        System.out.println(factorial(6));
        System.out.println("______________________________________________________");

    }

    /** Ejercicio 1.
     Crea una función que imprima los números naturales en orden inverso comenzando por el número n.  */
    private static void numerosAtras(int num){
        if (num > 0) {
            System.out.print(num + " ");
            numerosAtras(num-1);
        }
    }

    /** Ejercicio 2.
     Calcula la suma de los primeros n números naturales utilizando recursividad. */
    private static int sumaNumeros(int i) {
        if (i == 1) {
            return 1;
        }
        else if (i == 0){
            return 0;
        }
        return i + sumaNumeros(i - 1);
    }

    /** Ejercicio 3.
     Realiza una función que calcule el n-ésimo término de la sucesión de Fibonacci. */
    private static int sucesionFibonnaci(int num){
        if ( num < 2){
            return  num;
        }
        return sucesionFibonnaci(num - 2) + sucesionFibonnaci(num - 1);
    }

    /** Ejercicio 4.
     Crea un método que calcule el máximo común divisor (MCD) de dos números enteros
     (utilizando la división euclídea). */
    public static int maximoComunDivisor(int a, int b) {
        if (b == 0) return a;
        return maximoComunDivisor(b, a % b);
    }

    /** Factorial */
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }else
        return num * factorial(num -1);
    }

}

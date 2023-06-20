#### Web visor de código por pasos

- https://pythontutor.com/visualize.html#mode=display

#### Números Atrás
````java
public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicion1:\nCuenta atrás desde un número dado: ");
        numerosAtras(7);
    }
    private static void numerosAtras(int num){
        if (num > 0) {
            System.out.print(num + " ");
        }
          
        numerosAtras(num-1);
    } 
}
````

#### Suma Números
```java
public class YourClassNameHere {
    public static void main(String[] args) {
        System.out.println("Ejercicio 2:\nSuma de los números hasta n: ");
        System.out.println(sumaNumeros(8));
        System.out.println("______________________________________________________");

    }

    private static int sumaNumeros(int i) {
        if (i == 1) {
            return 1;
        } //
        else if (i == 0) {
            return 0;
        }
        return i + sumaNumeros(i - 1);
    }
}
```

#### Fibonacci
```java
public class YourClassNameHere {
    public static void main(String[] args) {
        System.out.println("Ejercicio 3:\nSecuencia de Fibonnaci hasta el núm dado: ");
        System.out.println(sucesionFibonnaci(17));
        System.out.println("______________________________________________________");
        }
        
        private static int sucesionFibonnaci(int num){
        if ( num < 2){ // Si el argumeto es menor a 2 se retorna directamente
        return  num;// Los dos primeros ním de Fibonnaci son 0 y 1 (la suma de los dos anteriores)
        } // Sabiendo que la formula de Fibonnaci es F(n) = F(n-1) + F(n-2) hacemos lo siguiente:
        return sucesionFibonnaci(num - 2) + sucesionFibonnaci(num - 1);
        }
}
```
#### Máximo Común Divisor
```java
public class YourClassNameHere {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4:\nMáximo común divisor entre dos núm dados: ");
        System.out.println(maximoComunDivisor(12, 610));
        System.out.println("______________________________________________________");
    }

    public static int maximoComunDivisor(int a, int b) {
        /* El MCD es el mayor número entero que divide a y b sin dejar un residuo */
        if (b == 0) return a; // Cualquier núm dividido entre 0 es % = 0
        return maximoComunDivisor(b, a % b);
    }
}
```

#### Factorial
```java
public class YourClassNameHere {
    public static void main(String[] args) {
        
    }
    

```
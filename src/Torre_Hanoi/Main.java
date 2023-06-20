package Torre_Hanoi;

public class Main {
    public static void main(String[] args) {

        hanoi(3, 'A', 'C', 'B');

    }

    public static void hanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 0) {  // Si num de discos es cero salimos del programa
            System.out.println("Mover disco " + n + " desde " + origen + " a " + destino);
            return;
        }
        /* Se resuelve el problema de forma recursiva, ya que se llama al método
         * en dos momentos diferentes */
        hanoi(n - 1, origen, auxiliar, destino);
        System.out.println("Mover disco " + n + " desde " + origen + " a " + destino);
        hanoi(n - 1, auxiliar, destino, origen);
    }


}

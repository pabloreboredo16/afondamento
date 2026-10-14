package biblioteca;


import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el número de filas y columnas 
        System.out.println("Introduce el número de filas: ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el número de columnas: ");
        int cols = Integer.parseInt(sc.nextLine());

        // Rellenar e imprimir la matriz 
        Basicas.imprimirMatriz(Basicas.rellenarMatriz(rows, cols));
    }
}
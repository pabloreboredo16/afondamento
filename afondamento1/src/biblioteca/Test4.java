package biblioteca;

import static biblioteca.Basicas.*;
import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el número de filas y columnas 
        System.out.println("Introduce el número de filas: ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el número de columnas: ");
        int cols = Integer.parseInt(sc.nextLine());

        // Imprimir la matriz original
        int[][] matrizOriginal = rellenarMatriz(rows, cols);
        System.out.println("\nMatriz Original:");
        imprimirMatriz(matrizOriginal);

        // Calcular la traza de la matriz
        System.out.println("\nTraza de la Matriz: " + traza(matrizOriginal));

        // Comprobar si la matriz es diagonal
        System.out.println("Diagonal: " + esDiagonal(matrizOriginal));
    }
}
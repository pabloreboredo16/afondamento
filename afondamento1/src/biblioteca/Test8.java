package biblioteca;

import static biblioteca.Basicas.*;

import java.util.Scanner;

public class Test8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el número de filas y columnas de la matriz
        System.out.println("Introduce el número de filas de la matriz: ");
        int rows1 = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el número de columnas de la matriz: ");
        int cols1 = Integer.parseInt(sc.nextLine());
        int[][] matriz = rellenarMatriz(rows1, cols1);

        // Imprimir matrices
        System.out.println("\nMatriz 1:");
        imprimirMatriz(matriz);

        // Calcular el determinante de la matriz
        int determinante = determinante(matriz);
        System.out.println("Determinante de la matriz: " + determinante);
    }
}
package biblioteca;

import static biblioteca.Basicas.*;

import java.util.Scanner;

public class Test7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el número de filas y columnas de la primera matriz
        System.out.println("Introduce el número de filas de la primera matriz: ");
        int rows1 = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el número de columnas de la primera matriz: ");
        int cols1 = Integer.parseInt(sc.nextLine());
        int[][] matriz1 = rellenarMatriz(rows1, cols1);

        // Pedir el número de filas y columnas de la segunda matriz
        System.out.println("\nIntroduce el número de filas de la segunda matriz: ");
        int rows2 = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el número de columnas de la segunda matriz: ");
        int cols2 = Integer.parseInt(sc.nextLine());
        int[][] matriz2 = rellenarMatriz(rows2, cols2);

        // Pedir el número de filas y columnas de la tercera matriz
        System.out.println("\nIntroduce el número de filas de la segunda matriz: ");
        int rows3 = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el número de columnas de la segunda matriz: ");
        int cols3 = Integer.parseInt(sc.nextLine());
        int[][] matriz3 = rellenarMatriz(rows3, cols3);

        // Imprimir matrices
        System.out.println("\nMatriz 1:");
        imprimirMatriz(matriz1);
        System.out.println("\nMatriz 2:");
        imprimirMatriz(matriz2);
        System.out.println("\nMatriz 3:");
        imprimirMatriz(matriz3);

        // Calcular el pruducto de matrices 
        int[][] producto = productoMatrices(productoMatrices(matriz1, matriz2), matriz3);

        System.out.println("\nProducto de las matrices: ");
        imprimirMatriz(producto);
    }
}
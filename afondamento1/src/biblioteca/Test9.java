package biblioteca;

import static biblioteca.Basicas.*;

public class Test9 {

    public static void main(String[] args) {
        // Pedir una matriz 3x3
        System.out.println("Introduce una matriz 3x3");
        int[][] matriz = rellenarMatriz(3, 3);

        // Imprimir matriz original
        System.out.println("\nMatriz 1:");
        imprimirMatriz(matriz);

        // Calcular e imprimir la matriz adjunta
        int[][] matrizAdjunta = adjunta(matriz);
        System.out.println("\nMatriz adjunta:");
        imprimirMatriz(matrizAdjunta);

        // Calcular e imprimir la matriz inversa
        double[][] matrizInversa = inversa(matriz);
        System.out.println("\nMatriz inversa:");
        imprimirMatriz(matrizInversa);

        System.out.println("\nComprobacion: MATRIZ * INVERSA = IDENTIDAD ");
        double[][] identidad = productoMatrices(matriz, matrizInversa);
        imprimirMatriz(identidad);
    }
}
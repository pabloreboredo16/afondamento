package biblioteca;

import static biblioteca.Basicas.*;

import java.util.Scanner;

public class Test5 {

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
        
        // Mostrar la primera matriz
        System.out.println("\nMatriz 1:");
        imprimirMatriz(matriz1);

        // Mostrar la segunda matriz
        System.out.println("\nMatriz 2:");
        imprimirMatriz(matriz2);

        

        // Calcular la suma y resta de matrices 
        int[][] suma = sumaMatrices(matriz1, matriz2);
        int[][] resta = restaMatrices(matriz1, matriz2);
        int[][] producto = productoMatrices(matriz1, matriz2);

        System.out.println("\nSuma de las matrices: ");
        imprimirMatriz(suma);
        System.out.println("\nResta de las matrices: ");
        imprimirMatriz(resta);
        System.out.println("\nProducto de las matrices: ");
        imprimirMatriz(producto);
    }
}

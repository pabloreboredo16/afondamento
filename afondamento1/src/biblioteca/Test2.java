package biblioteca;


import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir el número de filas y columnas 
        System.out.println("Introduce el número de filas: ");
        int rows = Integer.parseInt(sc.nextLine());
        System.out.println("Introduce el número de columnas: ");
        int cols = Integer.parseInt(sc.nextLine());

        // Imprimir la matriz original
        int[][] matrizOriginal = Basicas.rellenarMatriz(rows, cols);
        System.out.println("\nMatriz Original:");
        Basicas.imprimirMatriz(matrizOriginal);

        // Transponer la matriz e imprimir
        int[][] matrizTranspuesta = Basicas.trasponerMatriz(matrizOriginal);
        System.out.println("\nMatriz Transpuesta:");
        Basicas.imprimirMatriz(matrizTranspuesta);
    }
}
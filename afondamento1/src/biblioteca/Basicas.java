package biblioteca;

import java.util.Scanner;

public class Basicas {

    // FUNCION PARA PEDIR POR TECLADO ELEMENTOS DE UNA MATRIZ
    public static int[][] rellenarMatriz(int rows, int cols) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[rows][cols];
        System.out.println("Añade " + (rows * cols) + " numeros");
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print("Introduce el elemento [" + (i+1) + "][" + (j+1) + "]: ");
                array[i][j] = sc.nextInt();
            }
        }
        return array;
    }
    
    // FUNCION PARA IMPRIMIR MATRIZ  
    public static void imprimirMatriz(int[][] array) {
        for(int[] row : array) {
            for(int elemento : row) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }

    /*  
    Funcion que traspone una matriz de enteros
    Algoritmo para invertir los indides de las filas y columnas:
    For i = 0 hasta numeroFilasOriginal
        For j = 0 hasta numeroColumnasOriginal
            matrizOriginal[i][j] -> matrizTranspuesta[j][i]
        Fin
    Fin
    */
    // FUNCION PARA TRASPONER UNA MATRIZ
    public static int[][] trasponerMatriz(int[][] array) {
        // Obtener las filas y columnas de la matriz original
        int rows = array.length;
        int cols = array[0].length;
        // Crear una nueva matriz para invertir las filas y las columnas
        int[][] traspuesta = new int[cols][rows];
        // Para cada elemento de la matriz original, asignarlo al elemnto invertido 
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) 
                traspuesta[j][i] = array[i][j];
        }
        // Devuelve la traspuesta
        return traspuesta;
    }     

    // FUNCION PARA CALCULAR LA TRAZA DE UNA MATRIZ CUADRADA
    public static int traza(int[][] array) {
        // Obtener las filas y columnas de la matriz
        int rows = array.length;
        int cols = array[0].length;
        // Solo podemos calcular la traza de matrices cuadradas
        if (rows != cols) {
            throw new IllegalArgumentException("La matriz debe ser cuadrada para calcular la traza");
        }
        // Sumar los elementos de la diagonal ([1][1], [2][2]...)
        int traza = 0;
        for(int i = 0; i < rows; i++) {
            traza += array[i][i];
        }
        return traza;
    }

    // FUNCION PARA COMPROBAR SI UNA MATRIZ ES SIMETRICA
    public static boolean esSimetrica(int[][] array) {
        // Obtener las filas y columnas de la matriz
        int rows = array.length;
        int cols = array[0].length;
        // Una matriz solo puede ser simétrica si es cuadrada
        if (rows != cols) {
            return false;
        }
        boolean esSimetrica = true;
        // Comprobar si array[i][j] es igual a array[j][i] en cada posición
        for (int i = 0; i < rows; i++) {
            for (int j = i+1; j < cols; j++) {
                if (array[i][j] != array[j][i]) {
                    return false;
                }
            }
        }
        return esSimetrica;
    }

    // FUNCION PARA COMPROBAR SI UNA MATRIZ ES DIAGONAL
    public static boolean esDiagonal(int[][] array) {
        // Obtener las filas y columnas de la matriz
        int rows = array.length;
        int cols = array[0].length;
        // Una matriz solo puede ser diagonal si es cuadrada
        if (rows != cols) {
            return false;
        }
        boolean esDiagonal = true;
        // Comprobar si array[i][j] es igual a array[j][i] en cada posición
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Si fuera de la diagonal el elemento no es 0
                if (i!=j && array[i][j]!=0) {
                    return false;
                }
            }
        }
        return esDiagonal;
    }

    // FUNCION PARA CALCULAR LA MATRIZ SUMA DE DOS MATRICES DE ENTEROS
    public static int[][] sumaMatrices(int[][] array1, int[][] array2) {
        // Obtener las filas y columnas de la matriz
        int rows1 = array1.length;
        int cols1 = array1[0].length;
        int rows2 = array2.length;
        int cols2 = array2[0].length;
        // Comprobar que las matrices tienen el mismo tamaño
        if (rows1 != rows2 || cols1 != cols2) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño para poder sumarlas");
        }
        // Crear una nueva matriz para almacenar la suma
        int[][] suma = new int[rows1][cols1];
        // Sumar los elementos de las dos matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                suma[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return suma;
    }

    // FUNCION PARA CALCULAR LA MATRIZ RESTA DE DOS MATRICES DE ENTEROS
    public static int[][] restaMatrices(int[][] array1, int[][] array2) {
        // Obtener las filas y columnas de la matriz
        int rows1 = array1.length;
        int cols1 = array1[0].length;
        int rows2 = array2.length;
        int cols2 = array2[0].length;
        // Comprobar que las matrices tienen el mismo tamaño
        if (rows1 != rows2 || cols1 != cols2) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño para poder restarlas");
        }
        // Crear una nueva matriz para almacenar la resta
        int[][] resta = new int[rows1][cols1];
        // Restar los elementos de las dos matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                resta[i][j] = array1[i][j] - array2[i][j];
            }
        }
        return resta;
    }

    // FUNCION PARA CALCULAR LA MATRIZ PRUDUCTO DE DOS MATRICES DE ENTEROS
    public static int[][] productoMatrices(int[][] array1, int[][] array2) {
        // Obtener las filas y columnas de la matriz
        int rows1 = array1.length;
        int cols1 = array1[0].length;
        int rows2 = array2.length;
        int cols2 = array2[0].length;
        // Comprobar que el numero de columnas de la primera es igual al numero de filas de la segunda
        if (cols1 != rows2) {
            throw new IllegalArgumentException("El numero de columnas de la primera matriz debe ser igual al numero de filas de la segunda");
        }
        // Crear una nueva matriz para almacenar el producto
        int[][] producto = new int[rows1][cols2];
        // Calcular el producto de las dos matrices
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    producto[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }
        return producto;
    }
}
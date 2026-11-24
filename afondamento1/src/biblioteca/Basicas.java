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
    
    // FUNCION PARA IMPRIMIR MATRIZ DE ENTEROS
    public static void imprimirMatriz(int[][] array) {
    for (int[] row : array) {
        for (int elemento : row) {
            System.out.printf("%5d ", elemento);
        }
        System.out.println();
    }
}
    public static void imprimirMatriz(double[][] array) {
        for(double[] row : array) {
            for(double elemento : row) {
                System.out.printf("%8.3f ", elemento);
            }
            System.out.println();
        }
    }

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

    // FUNCION PARA CALCULAR LA MATRIZ PRUDUCTO DE UNA MATRIZ DE ENTEROS POR OTRA DE DOUBLES
    public static double[][] productoMatrices(int[][] array1, double[][] array2) {
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
        double[][] producto = new double[rows1][cols2];
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

    // FUNCION PARA CALCULAR EL DETERMINANTE DE UNA MATRIZ DE ENTEROS
    public static int determinante(int[][] array) {
        // Obtener las filas y columnas de la matriz
        int rows = array.length;
        int cols = array[0].length;
        // Para calcualar el determinante la matriz debe ser cuadrada
        if (rows != cols) {
            throw new IllegalArgumentException("La matriz debe ser cuadrada para calcular el determinante");
        }
        // Calcular el determinante de la matriz
        if (rows == 1) {
            return array[0][0];
        } else if (rows == 2) {
            return array[0][0] * array[1][1] - array[0][1] * array[1][0];
        } else {
            int det = 0;
            for (int j = 0; j < cols; j++) {
                det += Math.pow(-1, j) * array[0][j] * determinante(subMatriz(array, 0, j));
            }
            return det;
        }
    }

    // Metodo auxiliar para calcular la submatriz eliminando [i][j]
    private static int[][] subMatriz(int[][] array, int row, int col) {
        int rows = array.length;
        int cols = array[0].length;
        int[][] subMatriz = new int[rows - 1][cols - 1];
        for (int i = 0, subI = 0; i < rows; i++) {
            if (i == row) continue;
            for (int j = 0, subJ = 0; j < cols; j++) {
                if (j == col) continue;
                subMatriz[subI][subJ] = array[i][j];
                subJ++;
            }
            subI++;
        }
        return subMatriz;
    }

    // FUNCION PARA COMPROBAR SI DOS MATRICES SON IGUALES
    public static boolean matricesIguales(int[][] A, int[][] B) {
        // Obtener las filas y columnas de las matrices
        int rows1 = A.length;
        int cols1 = A[0].length;
        int rows2 = B.length;
        int cols2 = B[0].length;
        // Dos matrices solo pueden ser iguales si tienen el mismo tamaño
        if (rows1 != rows2 || cols1 != cols2) {
            return false;
        }
        boolean sonIguales = true;
        // Comprobar si A[i][j] es igual a B[i][j] en cada posición
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                if (A[i][j] != B[i][j]) {
                    return false;
                }
            }
        }
        return sonIguales;
    }
    
    // FUNCION PARA CALCULAR LA ADJUNTA DE UNA MATRIZ
    public static int[][] adjunta(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        if (rows != cols) {
            throw new IllegalArgumentException("La matriz debe ser cuadrada para calcular la adjunta");
        }
        int[][] adjunta = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                adjunta[i][j] = (int) Math.pow(-1, i + j) * determinante(subMatriz(array, i, j));
            }
        }
        return adjunta;
    }

    // FUNCION PARA CALCULAR LA MATRIZ INVERSA DE ENTEROS (ADJUNTA(TRASPUESTA) / DETERMINANTE)
    public static double[][] inversa(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        if (rows != cols) {
            throw new IllegalArgumentException("La matriz debe ser cuadrada para calcular la inversa");
        }
        // Calcular el determinante
        int det = determinante(array);
        if (det == 0) {
            throw new IllegalArgumentException("La matriz no tiene inversa porque su determinante es 0");
        }
        // Calcular la matriz adjunta de la traspuesta
        int[][] adjuntaTraspuesta = adjunta(trasponerMatriz(array));
        // Calcular la matriz inversa
        double[][] inversa = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                inversa[i][j] = (double) adjuntaTraspuesta[i][j] / det;
            }
        }
        return inversa;
    }

    // FUNCION PARA OBTENER LA MATRIZ IDENTIDAD DE UN TAMAÑO DADO
    public static int[][] matrizIdentidadI(int size) {
        int[][] identidad = new int[size][size];
        for(int i = 0; i < size; i++) {
            identidad[i][i] = 1;
        }
        return identidad;
    }
    public static double[][] matrizIdentidadD(int size) {
        double[][] identidad = new double[size][size];
        for(int i = 0; i < size; i++) {
            identidad[i][i] = 1.0;
        }
        return identidad;
    }

    // RESOLVER UN SISTEMA DE ECUACIONES LINEALES Ax = b USANDO LA INVERSA DE A
    public static double[] resolverSistemaLineal(int[][] A, int[] b) {
        int rows = A.length;
        int cols = A[0].length;
        if(rows != cols) {
            throw new IllegalArgumentException("La matriz A debe ser cuadrada para resolver");
        }
        if (b.length != rows) {
            throw new IllegalArgumentException("El vector b debe tener el mismo numero de filas que la matriz");
        }
        double[][] A_inversa = inversa(A);
        double[] x = new double[rows];
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                x[i] += A_inversa[i][j] * b[j];
            }
        }
        return x;
    }

    // FUNCION PARA RELLENAR UN VECTOR DE ENTEROS
    public static int[] rellenarVector(int size) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[size];
        System.out.println("Añade " + size + " numeros");
        for (int i = 0; i < size; i++) {
            System.out.print("Elemento [" + i + "]: ");
            vector[i] = Integer.parseInt(sc.nextLine());
        }
        return vector;
    }

    // FUNCION PARA IMPRIMIR VECTOR 
    public static void imprimirVector(int[] array) {
        for (int elemento : array) {
            System.out.printf("%5d\n", elemento);
        }
    }
    public static void imprimirVector(double[] array) {
        for (double elemento : array) {
            System.out.printf("%8.3f\n", elemento);
        }
    }

    // 
}
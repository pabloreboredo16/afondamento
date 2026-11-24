package biblioteca;

import static biblioteca.Basicas.imprimirMatriz;
import static biblioteca.Basicas.imprimirVector;
import static biblioteca.Basicas.rellenarMatriz;
import static biblioteca.Basicas.rellenarVector;
import static biblioteca.Basicas.resolverSistemaLineal;

public class Test10 {

    /*
    Sistema 1:
    x + 2y = 1
    -x = 1 

    A = 1, 2, -1, 0
    b = 1, 1
    Solucion: x = -1, 1
    */

    public static void main(String[] args) {

        // Matriz A de coeficientes
        System.out.println("Introduce la matriz de coeficientes A (2x2):");
        int[][] A = rellenarMatriz(2, 2);

        System.out.println("\nMatriz de coeficientes A:");
        imprimirMatriz(A);

        // Vector b de constantes
        System.out.println("\nIntroduce los 2 términos independientes del vector b:");
        int[] b = rellenarVector(2);

        System.out.println("\nVector de términos independientes b:");
        imprimirVector(b);

        // Resolver el sistema
        double[] x = resolverSistemaLineal(A, b);

        // Mostrar solucion
        System.out.println("\nSolución del sistema:");
        imprimirVector(x);
    }
}
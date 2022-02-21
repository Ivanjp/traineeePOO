package v57;

import java.util.Scanner;

/*
*Programa que muestra la matriz transpuesta
*/
public class Ejercicio3Matrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int matrizA[][] = new int[3][3];
        int transpuesta[][] = new int[3][3];

        System.out.print("\nIngresa los datos del arreglo: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpuesta[i][j] = matrizA[j][i];
            }
        }

        System.out.println("\nImprimiendo resultado:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }

    }
}

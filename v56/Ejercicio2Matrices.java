package v56;

import java.util.Scanner;

/*
*Programa que dice realiza la suma de 2 matrices
*/
public class Ejercicio2Matrices {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];
        int suma[][] = new int[3][3];

        System.out.print("\nIngresa los datos del arreglo A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = sc.nextInt();
            }
        }

        System.out.print("\nIngresa los datos del arreglo B: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizB[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("\nImprimiendo resultado:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(suma[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}

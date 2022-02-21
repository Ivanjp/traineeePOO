package v58;

import java.util.Scanner;

/*
*Programa que muestra la suma de las filas y columnas de una matriz nxm
*/
public class Ejercicio5Matrices {
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int matriz[][], nFilas, nColumnas, sumaF = 0, sumaCol = 0;

        System.out.print("Ingresa el numero de filas: ");
        nFilas = sc.nextInt();
        System.out.print("\nIngresa el numero de columnas: ");
        nColumnas = sc.nextInt();
        matriz = new int[nFilas][nColumnas];

        System.out.print("\nIngresa los datos del arreglo: ");
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        //Suma de filas
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                sumaF += matriz[i][j];
            }

            System.out.println("Suma de la fila "+i+" = "+sumaF);
            sumaF = 0;
        }

        System.out.println();
        // Suma de columnas
        for (int i = 0; i < nColumnas; i++) {
            for (int j = 0; j < nFilas; j++) {
                sumaCol += matriz[i][j];
            }

            System.out.println("Suma de la columna " + i + " = " + sumaCol);
            sumaCol = 0;
        }
    }
}

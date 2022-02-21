package v56;

import java.util.Scanner;

/*
*Programa que dice si una matriz es simetrica
*/
public class Ejercicio1Matrices {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int matriz[][], nFilas, nColumnas;
        boolean simetrica = true;

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

        if (nFilas == nColumnas) {
            int i,j;
            i=0;

            while (i<nFilas && simetrica == true ) {
                j=0;
                while (j<i && simetrica == true) {
                    if (matriz[i][j] != matriz[j][i]) {
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }

            if (simetrica == true) {
                System.out.println("\nLa matriz es simetrica");
            } else {
                System.out.println("\nLa matriz no es simetrica");
            }
        } else {
            System.out.println("\nLa matriz no es simetrica");
        }
    }
}

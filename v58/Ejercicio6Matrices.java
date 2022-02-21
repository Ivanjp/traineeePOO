package v58;
import java.util.Scanner;

/*
*Programa que transpone una matriz de 5x9 a una de 9x5
*/
public class Ejercicio6Matrices {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int matrizA[][] = new int[5][9];
        int transpuesta[][] = new int[9][5];

        System.out.print("\nIngresa los datos del arreglo: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                matrizA[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                transpuesta[j][i] = matrizA[i][j];
            }
        }

        System.out.println("\nImprimiendo resultado:");
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}

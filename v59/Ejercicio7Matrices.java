package v59;

/*
*Programa que crea una matriz marco 5x5 con 1's y 0's
*/
public class Ejercicio7Matrices {
    
    public static void main(String[] args) {
        
        int matrizA[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
               if (i == 0 || i == 4) {
                   matrizA[i][j] = 1;
               } else if(j == 0  || j == 4){
                   matrizA[i][j] = 1;
               }else{
                   matrizA[i][j] = 0;
               }
            }
        }

        System.out.println("\nImprimiendo resultado:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizA[i][j] + " ");
            }
            System.out.println();
        }
    }
}

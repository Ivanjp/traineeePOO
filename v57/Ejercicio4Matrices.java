package v57;

/*
*Programa que crea una matriz de 7x7 con diagonal con puros 1nos.
*/
public class Ejercicio4Matrices {
    
    public static void main(String[] args) {
        
        int matriz[][] = new int[7][7];
        int count = 7;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
               
                if(count == 7){
                    matriz[i][j] = 1;
                    count = 0;
                }else{
                    matriz[i][j] = 0;
                    count++;
                }
            }
        }

        System.out.println("\nImprimiendo resultado:");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

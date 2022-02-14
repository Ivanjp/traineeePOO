package v35;

import java.util.Scanner;

/*
*Programa que calcula el factorial de un número
*/
public class Ejercicio12ciclos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        long factorial = 1;

        System.out.print("Ingresa un numero: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            factorial *= i; 
        }

        System.out.println("\nEl factorial de "+num+" es: "+factorial);
    }
}

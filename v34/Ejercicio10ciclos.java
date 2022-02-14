package v34;

import java.util.Scanner;

/*
*Programa que pide 10 numeros y escribe la suma total
*/
public class Ejercicio10ciclos {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num, suma = 0;

        System.out.print("Ingresa un numero: ");
        num = sc.nextInt();

        for (int i = 0; i <= num; i++) {
            suma += i;
        }

        System.out.println("\nLa suma es: "+suma);
    }
}

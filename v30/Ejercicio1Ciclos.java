package v30;

import java.util.Scanner;

public class Ejercicio1Ciclos{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, cuadrado;

		System.out.print("Ingresa un numero: ");
		num = sc.nextInt();

		while(num>=0){
			cuadrado = (int) Math.pow(num,2);
			System.out.println("\nEl cuadrado de "+num+" es "+cuadrado);
			System.out.print("Ingresa otro numero: ");
			num = sc.nextInt();
		}
	}
}
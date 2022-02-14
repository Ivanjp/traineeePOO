package v32;

import java.util.Scanner;

public class Ejercicio6Ciclos{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int suma = 0, num;


		do{
			System.out.print("Ingresa un numero: ");
			num = sc.nextInt();
			suma += num;
			System.out.println("La suma es: "+suma);
		}while(num != 0);
	}
}
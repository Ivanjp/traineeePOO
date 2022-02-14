package v33;

import java.util.Scanner;

public class Ejercicio8Ciclos{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Ingresa un numero: ");
		num = sc.nextInt();

		for (int i = 0; i<=num; i++) {
			System.out.println(i);
		}
	}
}
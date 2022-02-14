package v31;

import java.util.Scanner;

public class Ejercicio4Ciclos{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num,count = 0;

		System.out.print("Ingresa un numero: ");
		num = sc.nextInt();

		while(num>=0){
			count++;
			System.out.print("Numeros ingresados hasta ahora: "+count);
			System.out.print("\nIngresa otro numero: ");
			num = sc.nextInt();
		}
	}
}
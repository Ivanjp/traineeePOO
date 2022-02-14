package v31;

import java.util.Scanner;

public class Ejercicio3Ciclos{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Ingresa un numero: ");
		num = sc.nextInt();

		while(num!=0){
			if(num%2 == 0){
				System.out.println("\nEl numero es par");
			}else if(num%2 == 1){
				System.out.println("\nEl numero es impar");
			}
			System.out.print("Ingresa otro numero: ");
			num = sc.nextInt();
		}
	}
}
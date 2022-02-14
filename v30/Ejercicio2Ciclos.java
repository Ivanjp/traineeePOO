package v30;

import java.util.Scanner;

public class Ejercicio2Ciclos{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.print("Ingresa un numero: ");
		num = sc.nextInt();

		while(num!=0){
			if(num>0){
				System.out.println("\nEl numero es positivo");
			}else{
				System.out.println("\nEl numero es negativo");
			}
			System.out.print("Ingresa otro numero: ");
			num = sc.nextInt();
		}
	}
}
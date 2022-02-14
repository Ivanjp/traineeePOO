package v25;

import java.util.Scanner;

/*
*Programa que simula una calculadora con operaciones básicas
*/

public class Ejercicio11cond{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char operacion;
		double num1, num2, total;

		System.out.print("Ingresa la operacion y los dos numeros: ");
		operacion = sc.next().charAt(0);
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();

		switch(operacion){
			case 's':
			case 'S':
				total = num1 + num2;
				System.out.print("El resultado de la suma es "+num1+" + "+num2+" = "+total);
				break;
			case 'r':
			case 'R':
				total = num1 - num2;
				System.out.print("El resultado de la resta es "+num1+" - "+num2+" = "+total);
				break;
			case 'p':
			case 'P':
			case 'm':
			case 'M':
				total = num1 * num2;
				System.out.print("El resultado de la multiplicacion es "+num1+" x "+num2+" = "+total);
				break;
			case 'd':
			case 'D':
				total = num1 / num2;
				System.out.print("El resultado de la division es "+num1+" / "+num2+" = "+total);
				break;
			default:
				System.out.print("Los datos que ingresaste son invalidos");
				break;
		}
	}
}
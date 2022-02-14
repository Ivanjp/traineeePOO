package v25;

import java.util.Scanner;

/*
*Programa que muestra una calificacion en forma (insuficiente, suficiente, bien, notable y sobresaliente)
*/

public class Ejercicio12cond{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int calif;

		System.out.print("Ingresa tu calificacion: ");
		calif = sc.nextInt();

		switch(calif){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				System.out.print("INSUFICIENTE");
				break;
			case 6:
			case 7:
				System.out.print("SUFICIENTE");
				break;
			case 8:
				System.out.print("BIEN");
				break;
			case 9:
				System.out.print("NOTABLE");
				break;
			case 10:
				System.out.print("SOBRESALIENTE");
				break;
			default:
				System.out.print("Los datos que ingresaste son invalidos");
				break;
		}
	}
}
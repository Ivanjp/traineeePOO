package V24;

import java.util.Scanner;

/*
*Programa que indica si la fecha proporcionada es correcta
*/

public class Ejercicio9cond{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dia, mes, year;

		System.out.print("Ingresa el dia, mes y año: ");
		dia = sc.nextInt();
		mes = sc.nextInt();
		year = sc.nextInt();

		if (dia < 1 || dia > 30) {
			System.out.println("\nEl dia que ingresaste no es valido");
		}else if(mes < 1 || mes > 12){
			System.out.println("\nEl mes que ingresaste no es valido");
		}else if(year < 0 ){
			System.out.println("\nEl año que ingresaste no es valido");
		}else{
			System.out.println("\nLa fecha es correcta.");
		}
	}
}
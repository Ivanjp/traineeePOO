package V24;

import java.util.Scanner;

/*
*Programa que indica si la fecha proporcionada es correcta con meses de 28, 30 y 31 dias
*/

public class Ejercicio10cond{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dia, mes, year;

		System.out.print("Ingresa el dia, mes y año: ");
		dia = sc.nextInt();
		mes = sc.nextInt();
		year = sc.nextInt();

		if (dia > 0 && dia < 29 && mes == 2 && year >= 0 ) {
			System.out.println("\nLa fecha es correcta.");
		}else if(dia > 0 && dia < 31 && (mes == 4 || mes == 6 || mes == 9 || mes == 11) && year >= 0){
			System.out.println("\nLa fecha es correcta.");
		}else if(dia > 0 && dia < 32 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && year >= 0){
			System.out.println("\nLa fecha es correcta.");
		}else{
			System.out.println("\nLa fecha es incorrecta.");
		}
	}
}
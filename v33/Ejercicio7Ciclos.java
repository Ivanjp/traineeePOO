package v33;

import java.util.Scanner;

public class Ejercicio7Ciclos{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int count = 0, num, suma=0;
		double media;

		System.out.println("Ingresa un numero: ");
		num = sc.nextInt();


		while(num >= 0){
			suma += num;
			count++;
			System.out.println("Ingresa un numero: ");
			num = sc.nextInt();
		}

		if(count == 0){
			System.out.print("No se puede dividir entre 0");
		}else{
			media = suma/count;
			System.out.print("La media es de: "+media);
		}
	}
}
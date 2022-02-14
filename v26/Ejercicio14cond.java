package v26;

import java.util.Scanner;

/*
*Programa que convierte kg a otra medida de masa
*/

public class Ejercicio14cond{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int opc;
		double masa, masaConv;

		System.out.print("Selecciona una opcion:\n1.KG a Toneladas\n2.KG a Libras\n3.KG a Onzas\n4.KG a Gramos\n5.Salir ");
		opc = sc.nextInt();

		switch(opc){
			case 1:
				System.out.print("Ingrese el peso en KG: ");
				masa = sc.nextDouble();
				masaConv = masa / 1000;
				System.out.println(masa+"KG es equivalente a "+masaConv+" Toneladas");
				break;
			case 2:
				System.out.print("Ingrese el peso en KG: ");
				masa = sc.nextDouble();
				masaConv = masa / 0.45359237;
				System.out.println(masa+"KG es equivalente a "+masaConv+" libras");
				break;
			case 3:
				System.out.print("Ingrese el peso en KG: ");
				masa = sc.nextDouble();
				masaConv = masa * 35.274;
				System.out.println(masa+"KG es equivalente a "+masaConv+" onzas");
				break;
			case 4:
				System.out.print("Ingrese el peso en KG: ");
				masa = sc.nextDouble();
				masaConv = masa * 1000;
				System.out.println(masa+"KG es equivalente a "+masaConv+" gramos");
				break;
			case 5:
				break;
			default:
				System.out.print("Los datos que ingresaste son invalidos");
				break;
		}
	}
}
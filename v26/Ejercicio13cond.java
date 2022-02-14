package v26;

import java.util.Scanner;

/*
*Programa que simula un cajero automatico
*/

public class Ejercicio13cond{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int saldoInicial = 1000, opc,monto, saldoUser;

		System.out.print("Selecciona una opcion:\n1.Ingresar dinero a la cuenta\n2.Retirar dinero de la cuenta\n3.Salir ");
		opc = sc.nextInt();

		switch(opc){
			case 1:
				System.out.print("Digite la cantidad a ingresar: ");
				monto = sc.nextInt();
				saldoUser = saldoInicial + monto;
				System.out.println("Su saldo es: "+saldoUser);
				break;
			case 2:
				System.out.print("Ingrese la cantidad a retirar: ");
				monto = sc.nextInt();
				if(saldoInicial>=monto){
					saldoInicial -= monto;
					System.out.println("Operacion exitosa\nSaldo restante: "+saldoInicial);
				}else{
					System.out.println("Saldo insuficiente");
				}
				break;
			case 3:
				break;
			default:
				System.out.print("Los datos que ingresaste son invalidos");
				break;
		}
	}
}
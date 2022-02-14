package v32;

import java.util.Scanner;

public class Ejercicio5Ciclos{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numAleatorio, num, count=0;
		boolean flag = false;

		numAleatorio = (int) (Math.random() * 100);

		System.out.print("Ingresa un numero: ");
		num = sc.nextInt();

		while(flag == false){
			if (num < numAleatorio) {
				System.out.println("\nEs menor");
				count++;
				System.out.print("Ingresa un numero: ");
				num = sc.nextInt();
			}else if(num > numAleatorio){
				System.out.println("\nEs mayor");
				count++;
				System.out.print("Ingresa un numero: ");
				num = sc.nextInt();
			}else{
				count++;
				System.out.print("Adivinaste!!");
				System.out.print("Lo lograste en "+count+" intentos.");
				flag = true;
			}
		}
	}
}
import java.util.Scanner;

public class operadoresArit{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		float num1, num2, suma, resta, mult, div;

		System.out.print("Ingresa un float: ");
		num1 = sc.nextFloat();
		num2 = sc.nextFloat();

		suma = num1 + num2;
		resta = num1 - num2;
		mult = num1 * num2;
		div = num1 / num2;

		System.out.println("\nLa suma es:  "+ suma);
		System.out.println("\nLa resta es:  "+ resta);
		System.out.println("\nLa multiplicación es:  "+ mult);
		System.out.println("\nLa division es:  "+ div);

	}
}
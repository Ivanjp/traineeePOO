package v71;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        /* Cuadrilatero c1;
        float lado1,lado2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa los dos lados del cuadrilatero: ");
        lado1 = sc.nextFloat();
        lado2 = sc.nextFloat();

        if (lado1 == lado2) {
            c1 = new Cuadrilatero(lado1);
        } else {
            c1 = new Cuadrilatero(lado1,lado2);
        }

        System.out.println("\nEl perimetro es: "+c1.getPerimetro());
        System.out.println("\nEl area es: "+c1.getArea()); */

        //Ejercicio2

        Ejercicio2 ej = new Ejercicio2();

        System.out.println("Las Cordenadas iniciales son : (0,0,0,0)");
        ej.derecha();
        ej.izquierda();;
        ej.izquierda();
        ej.arriba();
        ej.abajo();
        ej.abajo();

    }
}

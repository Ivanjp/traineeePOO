package v73;

import java.util.Scanner;

public class Main {

    static double mayorA(Triangulo_Isoceles[] tr){
        double aux = 0.0;
        for (int i = 1; i < tr.length; i++) {
            if (tr[i].obtenerArea() > aux) {
                aux = tr[i].obtenerArea();
            }
        }
        return aux;
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        /* double base,lado;
        int numTriangulos;

        System.out.print("Ingresa el numero de triangulos: ");
        numTriangulos = sc.nextInt();

        Triangulo_Isoceles[] triangulos = new Triangulo_Isoceles[numTriangulos];

        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("\nIngrese los datos del triangulo "+(i+1));
            System.out.print("Base: ");
            base = sc.nextDouble();
            System.out.print("\nLado: ");
            lado = sc.nextDouble();
            triangulos[i] = new Triangulo_Isoceles(base,lado);

            System.out.println("El perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("El area del triangulo es: "+triangulos[i].obtenerArea());
        }

        System.out.println("El area del triangulo de mayor superficie es: "+mayorA(triangulos)); */

        int opc;

        System.out.println("Selecciona una opcion:\n1.Suma\n2.Multiplicar\n3.Comparar\n4.Multiplicar por un entero");
        opc = sc.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Ingresa tus números complejos:");
                System.out.print("Parte real complejo 1: ");
                int real_C1 = sc.nextInt();
                System.out.print("\nParte imaginaria complejo 1: ");
                int img_C1 = sc.nextInt();

                Complejo c1 = new Complejo(real_C1,img_C1);

                System.out.print("Parte real complejo 2: ");
                int real_C2 = sc.nextInt();
                System.out.print("\nParte imaginaria complejo 2: ");
                int img_C2 = sc.nextInt();

                Complejo c2 = new Complejo(real_C2,img_C2);
                

                break;
            case 2:
            
                break;
            case 3:
        
                break;
            case 4:
        
                break;
            default:
                break;
    }
    }

}

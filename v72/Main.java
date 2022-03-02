package v72;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numAtletas, numero,id;
        String nombre;
        float tiempo, tiempoaux;

        System.out.print("Ingresa el numero de atletas: ");
        numAtletas = sc.nextInt();

        Atleta[] atletas = new Atleta[numAtletas];

        System.out.println("\nINGRESA LOS DATOS DE LOS ATLETAS");

        for (int i = 0; i < atletas.length; i++) {
            System.out.println("Atleta "+(i+1));
            System.out.print("Ingresa el numero del atleta: ");
            numero = sc.nextInt();
            sc.nextLine();
            System.out.print("\nIngresa el nombre del atleta: ");
            nombre = sc.nextLine();
            System.out.print("\nIngresa el tiempo del atleta: ");
            tiempo = sc.nextFloat();
            atletas[i] = new Atleta(numero,nombre,tiempo);
        }

        tiempoaux = atletas[0].getTiempo();
        id = 0;

        for (int i = 1; i < atletas.length; i++) {
            if (atletas[i].getTiempo() < tiempoaux) {
                tiempoaux = atletas[i].getTiempo();
                id = i;
            }
        }

        System.out.println("\nEl ganador es: ");
        System.out.println(atletas[id].toString());
    }
}

package v35;
/*
*Programa que muestra el producto de los 10 primeros numeros impares
*/
public class Ejercicio11ciclos {
    
    public static void main(String[] args) {
        
        int prod = 1;

        for (int i = 0; i <= 20; i++) {
            if (i%2 == 1) {
                prod *= i;
            }    
        }

        System.out.println("El producto de los primeros 10 numeros impares es: "+prod);
    }
}

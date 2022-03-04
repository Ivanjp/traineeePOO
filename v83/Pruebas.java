package v83;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Pruebas {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Excepciones Verificadas (IOException)
       /*  BufferedReader bf = new BufferedReader(new FileReader("file"));
        String linea;
        while ((linea=bf.readLine()))!=null) {
            System.out.println(linea); 
        }*/

        //Excepciones no verificadas(RuntimeException)
        int num1=5,num2=0;
        System.out.println(num1/num2);
    }
}

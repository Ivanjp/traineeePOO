package V85;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prueba {
    
    public void leerArchivo() throws FileNotFoundException, IOException{
        File archivo = new File("");
        FileReader fr = new FileReader(archivo);
        BufferedReader bf = new BufferedReader(fr);
        String linea;

        while ((linea=bf.readLine())!=null) {
            System.out.println(linea); 
        }
    }

    public void leerArchivo2(){
        try {
            leerArchivo();
        } catch (FileNotFoundException e) {
            //TODO: handle exception
            System.err.println(e);
        } catch(IOException e){
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        Prueba p = new Prueba();
        p.leerArchivo2();
    }
}

package v77;

public class Main {
    
    public static void main(String[] args) {
        
        Vehiculo v1 = new Vehiculo("YHGA6","BMW","2021G");
        Vehiculo v2 = new VehiculoDeportivo("TYSGD","Mercedes","W13",12);
        Vehiculo v3 = new VehiculoFurgoneta("SDFER","Ferrari","FE12",33);
        Vehiculo v4 = new VehiculoTurismo("WWEF","Aston Martin","AM13",4);

        System.out.println(v1.toString());
        System.out.println(v2.toString());
        System.out.println(v3.toString());
        System.out.println(v4.toString());
    }
}

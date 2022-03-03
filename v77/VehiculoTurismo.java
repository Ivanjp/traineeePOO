package v77;

public class VehiculoTurismo extends Vehiculo{
    
    int numPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numPuertas) {
        super(matricula, marca, modelo);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo + " puertas="+numPuertas+"]";
    }

    
}

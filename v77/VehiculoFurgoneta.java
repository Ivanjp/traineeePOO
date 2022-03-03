package v77;

public class VehiculoFurgoneta extends Vehiculo{
    
    int carga;

    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", matricula=" + matricula + ", modelo=" + modelo + " carga="+carga+"]";
    }
}

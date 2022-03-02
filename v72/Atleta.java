package v72;

public class Atleta {
    
    private int numeroAtl;
    private String nombre;
    private float tiempo;

    public Atleta(int numeroAtl, String nombre, float tiempo) {
        this.numeroAtl = numeroAtl;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    public float getTiempo() {
        return tiempo;
    }

    @Override
    public String toString() {
        return "Atleta [nombre=" + nombre + ", numeroAtl=" + numeroAtl + ", tiempo=" + tiempo + "]";
    }
    
}

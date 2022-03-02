package v73;

public class Triangulo_Isoceles {
    
    private double base;
    private double lado;

    public Triangulo_Isoceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    public double obtenerPerimetro(){
        double perim = 2*lado+base;
        return perim;
    }

    public double obtenerArea(){
        double area = (base*Math.sqrt(Math.pow(lado, 2) - (Math.pow(base, 2)/4)))/2;
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo_Isoceles [base=" + base + ", lado=" + lado + ", Perimetro=" + obtenerPerimetro() + ", Area=" + obtenerArea() + "]";
    }
}

package v71;

public class Ejercicio2 {
    
    private int x;
    private int y;
    private int xN;
    private int yN;

    public Ejercicio2() {
        this.x = 0;
        this.y = 0;
        this.xN = 0;
        this.yN = 0;
    }

    public void derecha(){
        if (y >= 0) {
            y++;
            System.out.println("Coordenadas actuales: ("+this.x+","+this.y+","+this.xN+","+this.yN+")");
        } else {
            yN++;
            System.out.println("Coordenadas actuales: ("+this.x+","+this.y+","+this.xN+","+this.yN+")");
        }
    }

    public void izquierda(){
        if (y > 0) {
            y--;
            System.out.println("Coordenadas actuales: ("+this.x+","+this.y+","+this.xN+","+this.yN+")");
        } else {
            yN--;
            System.out.println("Coordenadas actuales: ("+this.x+","+this.y+","+this.xN+","+this.yN+")");
        }
    }

    public void arriba(){
        if (x >= 0) {
            x++;
            System.out.println("Coordenadas actuales: ("+this.x+","+this.y+","+this.xN+","+this.yN+")");
        } else {
            xN++;
            System.out.println("Coordenadas actuales: ("+this.x+","+this.y+","+this.xN+","+this.yN+")");
        }
    }

    public void abajo(){
        if (x >= 0) {
            x--;
            System.out.println("Coordenadas actuales: ("+this.x+","+this.y+","+this.xN+","+this.yN+")");
        } else {
            xN--;
            System.out.println("Coordenadas actuales: ("+this.x+","+this.y+","+this.xN+","+this.yN+")");
        }
    }

}

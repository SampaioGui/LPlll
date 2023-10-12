package Data;

import java.lang.Math;

public class Ex4 {
    private double x;
    private double y;

    
    public Ex4(double x, double y) {
        this.x = x;
        this.y = y;
    }

    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    
    public void imprimirPonto() {
        System.out.println("Coordenadas do Ponto: (" + x + ", " + y + ")");
    }

   
    public boolean isEixoX() {
        return y == 0;
    }

    
    public boolean isEixoY() {
        return x == 0;
    }

    
    public boolean isEixos() {
        return x == 0 && y == 0;
    }

   
    public int quadrante() {
        if (isEixos()) {
            return 0;
        } else if (x > 0 && y > 0) {
            return 1;
        } else if (x < 0 && y > 0) {
            return 2;
        } else if (x < 0 && y < 0) {
            return 3;
        } else {
            return 4;
        }
    }

    
    public double distancia(Ex4 outroPonto) {
        double dx = this.x - outroPonto.getX();
        double dy = this.y - outroPonto.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static void main(String[] args) {
        Ex4 ponto1 = new Ex4(3, 4);
        

        ponto1.imprimirPonto();
        
    }
}

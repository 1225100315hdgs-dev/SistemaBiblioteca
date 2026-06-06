package model;

public class Pentagono  extends FiguraGeometrica {
    

    public Pentagono(double lado) {
        super("Pentagono", lado, 0);
        calcularArea();
        calcularPerimetro();
    }

    @Override
    public void calcularArea() {
        area = (5 * dimension1 * dimension1) / (4 * Math.tan(Math.PI / 5));
    }

    @Override
    public void calcularPerimetro() {
        perimetro = dimension1 * 5;
    }
    
}

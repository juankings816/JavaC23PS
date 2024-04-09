package co.com.ps.block5;

public class Circulo implements FiguraGeometrica{

    int radio;

    @Override
    public Object area() {
        return 2*Math.PI*radio*radio;
    }
}

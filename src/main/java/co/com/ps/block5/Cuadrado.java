package co.com.ps.block5;

public class Cuadrado implements FiguraGeometrica {
    int lado;


    @Override
    public  Object area (){
        return lado * lado;
    }
}

package co.com.ps.block5;

public class Main {
    public static void main(String[] args) {

        DiaSemana diaSemana = DiaSemana.MARTES;

        if (diaSemana == DiaSemana.DOMINGO || diaSemana == DiaSemana.SABADO)
            System.out.println("Descansa");
        else
            System.out.println("Trabaja");
    }
}

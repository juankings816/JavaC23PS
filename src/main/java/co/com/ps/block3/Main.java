package co.com.ps.block3;

public class Main {
    public static void main(String[] args) {

        Colombiano colombiano = new Colombiano("1111111","Juan","Reyes", "CC", "A+");
        System.out.println(colombiano.getNombre());
        colombiano.setNombre("Manuel");
        System.out.println(colombiano.getApellido());

    }
}

package co.com.ps.block5;

public class TrabajoEnClase4 {
    public static void main(String[] args) {

        Mercado mercado = Mercado.PAPA;
        if (mercado == Mercado.PAPA){
            System.out.println("Compraste una Papa");}
        else if (mercado == Mercado.YUCA){
            System.out.println("Compraste una Yuca");
        } else if (mercado == Mercado.ARBERJA) {
            System.out.println("Compraste una Arberja");
        } else if (mercado == Mercado.SALCHICHON) {
            System.out.println("Compraste un sabroso Salchichon");
        }
    }
}

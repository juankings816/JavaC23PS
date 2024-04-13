package co.com.ps.block6;

public class Main {
    public static void main(String[] args) {
       try {
           int resultado = dividir(10,0);
           System.out.println();
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
        System.out.println("La aplicación termino con exito");
    }
    public static int dividir( int a, int b){
        return a/b;
    }
}

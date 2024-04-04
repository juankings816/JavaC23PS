package co.com.ps.block3;

public class Colombiano {

    private  String cedula;
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String tipoDeSangre;



    public Colombiano(String cedula, String nombre, String apellido, String tipoDocumento, String tipoDeSangre) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.tipoDeSangre = tipoDeSangre;

    }
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido(){
        return apellido;
    }
}

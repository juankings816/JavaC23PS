package co.com.ps.block2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.nombre = "Juan";
        persona.colorPiel = "Blanco";
        persona.edad = 20;
        persona.id = "1000380487";
        persona.estatura = 1.75f;

        persona.caminar (3);
        persona.bailar();
        Persona.cantar();
        System.out.println(LocalDate.now());

    }
}

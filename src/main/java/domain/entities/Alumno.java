package domain.entities;


import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

@Getter
@Setter
public class Alumno {

    private String nombre;
    private String apellido;
    private Integer legajo;
    private Materia[] materiasAprobadas;

    public Alumno(String nombre, String apellido, Integer legajo, Materia[] materiasAprobadas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
        this.materiasAprobadas = materiasAprobadas;
    }

    public boolean cumpleCorrelativasDe(Materia materia) {
        return Arrays.stream(materia.getCorrelativas()).allMatch( correlativa ->
            Arrays.stream(this.materiasAprobadas).anyMatch(aprobado -> aprobado == correlativa)
        );
    }

}

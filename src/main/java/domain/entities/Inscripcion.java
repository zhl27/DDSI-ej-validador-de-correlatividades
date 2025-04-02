package domain.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class Inscripcion {

    private Materia[] materiasPropuestas;
    private Alumno alumno;

    public Inscripcion(Alumno alumno, Materia[] materiasPropuestas) {
        this.alumno = alumno;
        this.materiasPropuestas = materiasPropuestas;
    }

    public boolean aprobada() {
        return Arrays.stream(this.materiasPropuestas).allMatch(materia -> this.alumno.cumpleCorrelativasDe(materia));
    }

}

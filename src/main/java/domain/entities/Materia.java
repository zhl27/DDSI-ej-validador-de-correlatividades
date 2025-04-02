package domain.entities;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Materia {

    private Materia[] correlativas;

    public Materia(Materia[] correlativas) {
        this.correlativas = correlativas;
    }

}

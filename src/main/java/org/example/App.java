package org.example;

import domain.entities.Alumno;
import domain.entities.Inscripcion;
import domain.entities.Materia;

public class App 
{
    public static void main( String[] args )
    {
        Materia algoritmos = new Materia(new Materia[0]);
        Materia discreta = new Materia(new Materia[0]);
        Materia paradigmas = new Materia(new Materia[]{algoritmos, discreta});
        Materia ingles1 = new Materia(new Materia[0]);
        Materia algebra = new Materia(new Materia[0]);
        Materia sistemasYProcesosDeNegocio = new Materia(new Materia[0]);
        Materia analisisDeSistemas = new Materia(new Materia[]{algoritmos, paradigmas});
        Materia disenioDeSistemas = new Materia(new Materia[]{analisisDeSistemas, ingles1});

        Alumno alumno0 = new Alumno("L", "Z", 123456789, new Materia[]{algoritmos, discreta, paradigmas, ingles1, sistemasYProcesosDeNegocio, analisisDeSistemas});
        Alumno alumno1 = new Alumno("U", "H", 987654321, new Materia[]{algoritmos, discreta, paradigmas, algebra});
        Alumno alumno2 = new Alumno("C", "E", 123459876, new Materia[]{algoritmos, discreta});
        Alumno alumno3 = new Alumno("A", "N", 987612345, new Materia[]{algoritmos, algebra, ingles1});
        Alumno alumno4 = new Alumno("S", "G", 125634789, new Materia[]{algoritmos, discreta, sistemasYProcesosDeNegocio});

        Inscripcion inscri0 = new Inscripcion(alumno0, new Materia[]{disenioDeSistemas});
        System.out.println("inscri0: "+ inscri0.aprobada());

        Inscripcion inscri01 = new Inscripcion(alumno1, new Materia[]{disenioDeSistemas});
        System.out.println("inscri01: "+ inscri01.aprobada());

        Inscripcion inscri2 = new Inscripcion(alumno2, new Materia[]{paradigmas});
        System.out.println("inscri2: "+ inscri2.aprobada());

        Inscripcion inscri3 = new Inscripcion(alumno3, new Materia[]{analisisDeSistemas});
        System.out.println("inscri3: "+ inscri3.aprobada());
    }
}

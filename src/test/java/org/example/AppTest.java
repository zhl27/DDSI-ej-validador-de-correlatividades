package org.example;

import domain.entities.Alumno;
import domain.entities.Inscripcion;
import domain.entities.Materia;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
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
        assertTrue(inscri0.aprobada());

        // le falta ingles1
        Inscripcion inscri01 = new Inscripcion(alumno1, new Materia[]{disenioDeSistemas});
        assertFalse(inscri01.aprobada());

        // habilitado, no tiene correlativas, es materia de primer anio
        Inscripcion inscri1 = new Inscripcion(alumno1, new Materia[]{sistemasYProcesosDeNegocio});
        assertTrue(inscri1.aprobada());

        // habilitado para cursar paradigmas
        Inscripcion inscri2 = new Inscripcion(alumno2, new Materia[]{paradigmas});
        assertTrue(inscri2.aprobada());

        Inscripcion inscri3 = new Inscripcion(alumno3, new Materia[]{analisisDeSistemas});
        assertFalse(inscri3.aprobada());

        Inscripcion inscri4 = new Inscripcion(alumno4, new Materia[]{analisisDeSistemas});
        assertTrue(inscri4.aprobada());
    }
}

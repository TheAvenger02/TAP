package jtab;

import java.util.*;

/**
 *
 * @author emiliomurillo
 */
public class DatosPersonas {

    private List<Persona> personas;

    public DatosPersonas() {
        obtenerDatos();
    }

    public void obtenerDatos() {
        personas = new ArrayList<Persona>();
        personas.add(new Persona("AORL640713HA32", "LUIS ARMANDO", "ACOSTA", "614 123 45 67", 25, false));
        personas.add(new Persona("COBC7010222342", "CLAUDIA ELODIA", "CORDERO", "614 654 65 87", 20, true));
        personas.add(new Persona("ERTY023456YHF5", "ERICK ADRIAN", "ACOSTA", "614 341 53 63", 28, false));
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void deplegarDatosConsola() {
        System.out.println("CURP: \t\t NOMBRE: \t\t APELLIDO: \t CELULAR: \t EDAD: \t SOLTERO:");
        for (Persona p : personas) {
            System.out.println(p.getCurp() + "\t" + p.getNombre() + "\t" + p.getApellido()
                    + "\t\t" + p.getCelular() + "\t" + p.getEdad() + "\t" + p.isSoltero());
        }
        System.out.println("\n\n");
    }

}

package appfecha;
import libfecha.*;
import libfecha.Fecha.DiaInvalido;
/**
 *
 * @author emiliomurillo
 */

public class Vista {

    public static void main (String [] args) throws DiaInvalido, Fecha.MesInvalido, Fecha.AnioInvalido {
        try {
            Fecha uno = new Fecha (20,10,2020);
            System.out.println(uno);
        }
        catch (DiaInvalido e) {
            System.out.println(e. getMessage ());
        }
    }
}
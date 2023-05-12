package practica11_arraylist1;

import java.util.ArrayList;

/**
 *
 * @author emiliomurillo
 */
public class Practica11_arrayList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creamos un arreglo lista
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Tamaño inicial de la lista: " + al.size());
        //se añaden algunos elementos a la lista
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1,"A2");
        System.out.println("Tamaño de la lista después de las adiciones: " + al.size());
        //mostramos el contenido de la lista
        System.out.println("El contenido de la lista es: " + al);
        //quitamos dos elementos de la lista
        al.remove("F");
        al.remove(2);
        System.out.println("Tamaño de la lista después de la eliminación: " + al.size());
        System.out.println("El contenido de la lista es: " + al);
    }   
}

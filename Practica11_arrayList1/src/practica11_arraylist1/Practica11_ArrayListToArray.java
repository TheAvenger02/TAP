package practica11_arraylist1;

import java.util.ArrayList;

/**
 *
 * @author emiliomurillo
 */
public class Practica11_ArrayListToArray {
    
    public static void main(String[] args) {
        // creamos una lista
        ArrayList<Integer> al = new ArrayList<Integer> ();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        System.out.println("Contenido de la lista: " + al);
        // obtener el arreglo
        Integer ia[] = new Integer[al.size()];
        ia = al.toArray(ia);
        
        int suma = 0;
        for(int i:ia)suma += i;
        
        System.out.println("La suma es: " + suma);
    } 
}
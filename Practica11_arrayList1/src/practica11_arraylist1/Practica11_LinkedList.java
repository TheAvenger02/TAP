package practica11_arraylist1;

import java.util.LinkedList;

/**
 *
 * @author emiliomurillo
 */
public class Practica11_LinkedList {
    public static void main(String[] args) {
        //crear la lista enlazada
        LinkedList<String> ll = new LinkedList<String>();
        //se añaden elementos a la lista
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1,"A2");
        System.out.println("Contenido original de la lista: " + ll);
        //remover dos elementos de la lista enlazada
        ll.remove("F");
        ll.remove(2);
        System.out.println("Contenido después del borrado: " + ll);
        //eliminamos el primero y el último elemento
        ll.removeFirst();
        ll.removeLast();
        System.out.println("Contenido después del borrado del primero y último: " + ll);
        //obtener y asignar valor por método
        String val = ll.get(2);
        ll.set(2, val + "Cambiado");
        System.out.println("Contenido después de los cambios: " + ll);
    }
}
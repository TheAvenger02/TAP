package practica11_genericos;

/**
 *
 * @author emiliomurillo
 */

class Gen<T>{
    T ob;
    
    Gen(T o){
        ob = o;
    }
    
    T getob(){
        return ob;
    }
    
    void showType(){
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

public class Practica11_Genericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gen<Integer> iOb;
        iOb = new Gen<Integer>(88);
        iOb.showType();
        int v = iOb.getob();
        System.out.println("value: "+v);
        System.out.println();
        Gen<String> strOb = new Gen<String> ("Generics test");
        strOb.showType();
        String str = strOb.getob();
        System.out.println("value: "+ str);
    }
    
}

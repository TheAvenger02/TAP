package ejercicios;

/**
 *
 * @author emiliomurillo
 */
public class Recta {

    private int punto1, punto2;

    public Recta() {
    }

    public int getPunto1() {
        return punto1;
    }

    public void setPunto1(int punto1) {
        this.punto1 = punto1;
    }

    public int getPunto2() {
        return punto2;
    }

    public void setPunto2(int punto2) {
        this.punto2 = punto2;
    }

    public Recta(int punto1, int punto2) {
        setPunto1(punto1);
        setPunto2(punto2);
    }

    public double distancia() {
        //  squirt((x_2-x_1)²+(y_2-y_1)²) 
        // return x1 = (-b + (Math.sqrt((Math.pow(b, 2)) - (4 * a * c)))) / (2 * a);
        return 0;
    }
    @Override
    public String toString(){
        
    }
}

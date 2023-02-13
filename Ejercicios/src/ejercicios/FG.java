package ejercicios;

/**
 *
 * @author emiliomurillo
 */
public class FG {

    int a = 0, b = 0, c = 0;
    double x1 = 0, x2 = 0;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public FG(int a, int b, int c) {
        setA(a);
        setB(b);
        setC(c);
    }

    public double x1() {
        return x1 = (-b + (Math.sqrt((Math.pow(b, 2)) - (4 * a * c)))) / (2 * a);
    }

    public double x2() {
        return x2 = (-b - (Math.sqrt((Math.pow(b, 2)) - (4 * a * c)))) / (2 * a);
    }
}

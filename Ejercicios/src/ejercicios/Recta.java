package ejercicios;

/**
 *
 * @author emiliomurillo
 */
public class Recta {

    public static Punto punto1 = new Punto();
    public static Punto punto2 = new Punto();

    public Recta() {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public Recta(Punto punto1, Punto punto2) {
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public static Punto getPunto1() {
        return punto1;
    }

    public static void setPunto1(Punto punto1) {
        Recta.punto1 = punto1;
    }

    public static Punto getPunto2() {
        return punto2;
    }

    public static void setPunto2(Punto punto2) {
        Recta.punto2 = punto2;
    }

    public double distancia() {
        // Implement pythagorean theorem
        double ct1 = this.getPunto1().x1 - this.getPunto2().x2;
        double ct2 = this.getPunto1().y1 - this.getPunto2().y2;
        double hip = Math.sqrt(ct1 * ct1 + ct2 * ct2);
        return hip;
    }
}

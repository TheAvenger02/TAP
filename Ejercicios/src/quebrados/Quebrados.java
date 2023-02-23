package quebrados;

public class Quebrados {

    private int n1, n2, d1, d2;

    public Quebrados() {
        this.n1 = 0;
        this.d1 = 1;
        this.n2 = 0;
        this.d2 = 1;
    }

    public Quebrados(int numerador1, int denominador1, int numerador2, int denominador2) {
        this.n1 = numerador1;
        this.d1 = denominador1;
        this.n1 = numerador2;
        this.d1 = denominador2;
    }

    public int getNumerador1() {
        return n1;
    }

    public void setNumerador1(int numerador) {
        this.n1 = numerador;
    }

    public int getDenominador1() {
        return d1;
    }

    public void setDenominador1(int denominador) {
        this.d1 = denominador;
    }

    public int getNumerador2() {
        return n2;
    }

    public void setNumerador2(int numerador) {
        this.n2 = numerador;
    }

    public int getDenominador2() {
        return d2;
    }

    public void setDenominador2(int denominador) {
        this.d2 = denominador;
    }
}

package quebrados;

public class Operaciones {

    String n, d;

    public Operaciones() {
    }

    public String sumar(Quebrados a, Quebrados b) {
        if (a.getNumerador1() * b.getDenominador2() == 0) {
            return "0";
        } else {
            n = String.valueOf((a.getNumerador1() * b.getDenominador2() + b.getNumerador2() * a.getDenominador1()));
            d = String.valueOf((a.getDenominador1() * b.getDenominador2()));
            return n + "/" + d;
        }
    }

    public String restar(Quebrados a, Quebrados b) {
        if (a.getNumerador1() * b.getDenominador2() == 0) {
            return "0";
        } else {
            n = String.valueOf(a.getNumerador1() * b.getDenominador2() - b.getNumerador2() * a.getDenominador1());
            d = String.valueOf(a.getDenominador1() * b.getDenominador2());
            return n + "/" + d;
        }
    }

    public String multiplicar(Quebrados a, Quebrados b) {
        if (a.getNumerador1() * b.getDenominador2() == 0) {
            return "0";
        } else {
            n = String.valueOf(a.getNumerador1() * b.getNumerador2());
            d = String.valueOf(a.getDenominador1() * b.getDenominador2());
            return n + "/" + d;
        }
    }

    public String dividir(Quebrados a, Quebrados b) {
        n = String.valueOf(a.getNumerador1() * b.getDenominador2());
        d = String.valueOf(a.getDenominador1() * b.getNumerador2());

        if ("0".equals(n)) {
            return "Indeterminación";
        } else {
            return n + "/" + d;
        }
    }
}

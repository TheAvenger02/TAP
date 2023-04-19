package libfecha;

/**
 *
 * @author emiliomurillo
 */
public class Fecha {
    int d, m, a;

    public Fecha(int d, int m, int a) throws FechaInvalidaException {
        if (!validarFecha(d, m, a)) {
            throw new FechaInvalidaException("La fecha ingresada no es válida.");
        }
        this.d = d;
        this.m = m;
        this.a = a;
    }

    public int getDia() {
        return d;
    }

    public void setDia(int d) {
        this.d = d;
    }

    public int getMes() {
        return m;
    }

    public void setMes(int m) {
        this.m = m;
    }

    public int getAnio() {
        return a;
    }

    public void setAnio(int a) {
        this.a = a;
    }

    private boolean validarFecha(int d, int m, int a) {
        if (m < 1 || m > 12) {
            return false;
        }
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (esBisiesto(a)) {
            diasPorMes[1] = 29;
        }
        if (d < 1 || d > diasPorMes[m - 1]) {
            return false;
        }
        return true;
    }

    private boolean esBisiesto(int a) {
        if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
            return true;
        }
        return false;
    }
}

class FechaInvalidaException extends Exception {
    public FechaInvalidaException(String mensaje) {
      super(mensaje);
    }
}
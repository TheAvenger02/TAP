package ejercicios;

/**
 *
 * @author emiliomurillo
 */
// Una clase es un tipo de dato abstracto
class Fibonacci { //Declaración
    //Implementación
    //Atributos de la clase

    byte bNumTerminos;
    String sFiboSerie;
    long lFiboValor;

    public Fibonacci(byte bNumTerminos) {
        this.bNumTerminos = bNumTerminos;
    }

    public byte getbNumTerminos() {
        return bNumTerminos;
    }

    public void setbNumTerminos(byte bNumTerminos) {
        this.bNumTerminos = bNumTerminos;
    }
}

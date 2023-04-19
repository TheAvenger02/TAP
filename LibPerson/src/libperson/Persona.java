/*
CURP: 18 carácteres, es única.
1-4 inicial y primera vocal del apellido, inicial del 2do apellido, inicial nombre
fecha nacimiento y mes día, mes o día menor a 10 se antepone 0.
*/
package libperson;
import java.util.regex.Pattern; //Expresiones regulares -> https://www.arteco-consulting.com/post/tutorial-java-regexp
import libfecha.Fecha;
/*
El API de Java para expresiones regulares está incluido de base en el JDK y por tanto en el JRE sin que deba añadir ninguna dependencia adicional. Su punto de partida es la construcción de un objeto Pattern del paquete java.util.regex. Pattern tiene un método estático compile(«…») por el cual se obtiene una instancia, dado un String que contiene la expresión regular. Este objeto debe reutilizarse entre usos de la misma expresión regular, para evitar incurrir en tiempos innecesarios al compilar una y otra vez la misma expresión.
Así que una vez compilada, el siguiente paso es aplicar la expresión sobre una entrada de texto a través del método del objeto matcher(«…»). Este método devuelve un objeto Matcher que agrupa todos los resultados que haya podido producir la aplicación de la expresión regular (regex) sobre la entrada. Obviamente este objeto no podrá reutilizarse para entradas de datos diferentes. El primer y más importante resultado que ofrece Matcher es si la regex ha sido válida o no para la entrada, esto es ofrecido por el método boolean find(). Si la respuesta es cierta, mediante el método group(int)
*/
/**
 *
 * @author emiliomurillo
 */
public class Persona {
    String curp, paterno, materno, nombre, celular, estadoDeNacimiento;
    Fecha fecha;
    char sexo;

    public Persona() {
    }

    public Persona(String CURP, String paterno, String materno, String nombre, String celular, String estadoDeNacimiento, Fecha fecha, char sexo) throws Exception {
        this.curp = CURP;
        this.paterno = paterno;
        this.materno = materno;
        this.nombre = nombre;
        this.celular = celular;
        this.estadoDeNacimiento = estadoDeNacimiento;
        this.fecha = fecha;
        this.sexo = sexo;
        
        validar(CURP);
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEstadoDeNacimiento() {
        return estadoDeNacimiento;
    }

    public void setEstadoDeNacimiento(String estadoDeNacimiento) {
        this.estadoDeNacimiento = estadoDeNacimiento;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    private boolean validar(String curp) throws Exception{
        String regex = "[A-Z]{1}[AEIOU]{1}[A-Z]{2}" + "(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])" + "[HM]{1}" +
                        "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)" +
                        "[B-DF-HJ-NP-TV-Z]{3}" + "[0-9A-Z]{1}[0-9]{1}$";
        Pattern p = Pattern.compile(regex);
        
        if (!p.matcher(curp).matches()) {
            excepciones(curp);
            return false;
        }else{
            return true;
        }
    }
    
    public void excepciones(String c) throws Exception{
        String n = "[A-Z]{1}[AEIOU]{1}[A-Z]{2}";
        String f = "(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])";
        String h = "[HM]{1}";
        String e = "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)";
        String l = "[B-DF-HJ-NP-TV-Z]{3}";
        String u = "[0-9A-Z]{1}[0-9]{1}$";
        
        Pattern p1 = Pattern.compile(n);
        Pattern p2 = Pattern.compile(f);
        Pattern p3 = Pattern.compile(h);
        Pattern p4 = Pattern.compile(e);
        Pattern p5 = Pattern.compile(l);
        Pattern p6 = Pattern.compile(u);
        
        if (!p1.matcher(n).matches()) {
            throw new Exception("ERROR EN EL NOMBRE");
        }else if(!p2.matcher(f).matches()){
            throw new Exception("ERROR EN LA FECHA DE NACIMIENTO");
        }else if(!p3.matcher(h).matches()){
            throw new Exception("ERROR EN EL SEXO");
        }else if(!p4.matcher(e).matches()){
            throw new Exception("ERROR EN EL ESTADO");
        }else if(!p5.matcher(l).matches()){
            throw new Exception("ERROR EN LAS CONSONANTES");
        }else if(!p6.matcher(u).matches()){
            throw new Exception("ERROR EN LA HOMOCLAVE");
        }
    }
}


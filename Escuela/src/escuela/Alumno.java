package escuela;

public class Alumno {

    private String nombre;
    private String apellido;
    private int edad;
    private int nota;

    public Alumno() {
    }

    public Alumno(String nombre, String apellido, int edad, int nota) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {//esto me dice la edad
        return edad;
    }

    public void setEdad(int edad) {//esto sirve para modificar la edad
        this.edad = edad;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    public String situacion(int nota){
       String estado;
        if (nota >=7 && nota<10) {
           estado = "Muy bien";
        } else {
           estado=" vas bien pero tan bien";
        }
    return estado;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", nota=" + nota + "situación"+situacion(nota)+'}';
    }

}

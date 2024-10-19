package clases;

public class Persona{
    //atributos
    private String nombre;
    private int edad;

    //constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    //getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void despliegaInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}
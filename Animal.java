
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;

public class Animal {

    // Atributo protegido.
    protected String nombre;

    // Atributo privado.
    private int edad;

    // Atributo público.
    public String especie;

    // Colecciones de Java.
    protected ArrayList<String> cuidados = new ArrayList<>();
    protected LinkedList<String> historial = new LinkedList<>();
    protected HashSet<String> vacunas = new HashSet<>();
    protected HashMap<String, String> caracteristicas = new HashMap<>();

    // Constructor de la clase padre.
    public Animal(String nombre, int edad, String especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    // Getter para consultar la edad.
    public int getEdad() {
        return edad;
    }

    // Setter para modificar la edad.
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Getter para consultar el nombre.
    public String getNombre() {
        return nombre;
    }

    // Setter para modificar el nombre.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método que utilizarán las clases hijas.
    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

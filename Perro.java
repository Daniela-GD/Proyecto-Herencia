
// Clase hija que hereda de la clase Animal.
public class Perro extends Animal {

    // Constructor de la clase Perro.
    public Perro(String nombre, int edad) {

        // super permite utilizar el constructor de la clase padre.
        super(nombre, edad, "Perro");
    }

    // Sobrescribimos el método de la clase padre.
    @Override
    public void hacerSonido() {

        // Mostramos el sonido característico del perro.
        System.out.println(nombre + " dice: ¡Guau, guau!");
    }
}

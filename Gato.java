
// Clase hija que hereda de Animal.
public class Gato extends Animal {

    // Constructor de la clase Gato.
    public Gato(String nombre, int edad) {

        // Llamamos al constructor de la clase padre.
        super(nombre, edad, "Gato");
    }

    // Sobrescribimos el método hacerSonido.
    @Override
    public void hacerSonido() {

        // Mostramos el sonido característico del gato.
        System.out.println(nombre + " dice: ¡Miau, miau!");
    }
}

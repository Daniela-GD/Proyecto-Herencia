
// Clase hija que hereda de Animal.
public class Ave extends Animal {

    // Constructor de la clase Ave.
    public Ave(String nombre, int edad) {

        // Llamamos al constructor de la clase padre.
        super(nombre, edad, "Ave");
    }

    // Sobrescribimos el método de la clase padre.
    @Override
    public void hacerSonido() {

        // Mostramos el sonido característico del ave.
        System.out.println(nombre + " dice: ¡Pío, pío!");
    }
}

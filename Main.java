
public class Main {

    public static void main(String[] args) {

        // ==========================================
        // 1. HERENCIA Y POLIMORFISMO
        // ==========================================

        // Creamos objetos utilizando la clase padre Animal,
        // pero con los constructores de las clases hijas.

        Animal[] animales = {
                new Perro("Max", 3),
                new Gato("Michi", 2),
                new Ave("Piolín", 1)
        };

        // Ciclo for que recorre todos los objetos.
        // Cada animal ejecuta su propio método hacerSonido().
        System.out.println("=== SONIDOS DE LOS ANIMALES ===");

        for (Animal animal : animales) {
            animal.hacerSonido();
        }

        // ==========================================
        // 2. ENCAPSULAMIENTO
        // ==========================================

        // Creamos un objeto de tipo Animal con constructor Perro.
        Animal mascota = new Perro("Rocky", 4);

        System.out.println("\n=== ENCAPSULAMIENTO ===");

        // Consultamos la edad mediante el getter.
        System.out.println("Edad inicial: " + mascota.getEdad());

        // Modificamos la edad mediante el setter.
        mascota.setEdad(5);

        // Consultamos nuevamente la edad.
        System.out.println("Edad modificada: " + mascota.getEdad());

        // Consultamos el atributo público.
        System.out.println("Especie: " + mascota.especie);

        // ==========================================
        // 3. TIPOS DE DATOS PRIMITIVOS Y OBJETO
        // ==========================================

        // int e Integer.
        int edad_primitiva = 5;
        Integer edad_objeto = 5;

        // double y Double.
        double peso_primitivo = 12.5;
        Double peso_objeto = 12.5;

        // char y Character.
        char inicial_primitiva = 'M';
        Character inicial_objeto = 'M';

        // boolean y Boolean.
        boolean activo_primitivo = true;
        Boolean activo_objeto = true;

        // long y Long.
        long codigo_primitivo = 123456L;
        Long codigo_objeto = 123456L;

        // float y Float.
        float altura_primitiva = 0.45f;
        Float altura_objeto = 0.45f;

        // byte y Byte.
        byte nivel_primitivo = 2;
        Byte nivel_objeto = 2;

        // short y Short.
        short cantidad_primitiva = 10;
        Short cantidad_objeto = 10;

        // Mostramos los valores en consola.
        System.out.println("\n=== TIPOS DE DATOS ===");

        System.out.println("Edad: " + edad_primitiva + " / " + edad_objeto);
        System.out.println("Peso: " + peso_primitivo + " / " + peso_objeto);
        System.out.println("Inicial: " + inicial_primitiva + " / " + inicial_objeto);
        System.out.println("Activo: " + activo_primitivo + " / " + activo_objeto);
        System.out.println("Código: " + codigo_primitivo + " / " + codigo_objeto);
        System.out.println("Altura: " + altura_primitiva + " / " + altura_objeto);
        System.out.println("Nivel: " + nivel_primitivo + " / " + nivel_objeto);
        System.out.println("Cantidad: " + cantidad_primitiva + " / " + cantidad_objeto);

        // ==========================================
        // 4. USO DE COLECCIONES
        // ==========================================

        System.out.println("\n=== COLECCIONES ===");

        // ArrayList: almacena los cuidados de la mascota.
        mascota.cuidados.add("Alimentación");
        mascota.cuidados.add("Paseos");

        System.out.println("Cuidados: " + mascota.cuidados);

        // LinkedList: almacena el historial de la mascota.
        mascota.historial.add("Primera visita al veterinario");
        mascota.historial.add("Vacunación");

        System.out.println("Historial: " + mascota.historial);

        // HashSet: almacena vacunas sin elementos repetidos.
        mascota.vacunas.add("Rabia");
        mascota.vacunas.add("Parvovirus");

        System.out.println("Vacunas: " + mascota.vacunas);

        // HashMap: almacena características mediante clave y valor.
        mascota.caracteristicas.put("Color", "Café");
        mascota.caracteristicas.put("Tamaño", "Mediano");

        System.out.println("Características: " + mascota.caracteristicas);
    }
}

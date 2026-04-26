package EJ1T8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {

        // List (interfaz) + ArrayList (implementación dinámica)
        List personas = null;
        personas = new ArrayList();

        // Añadir elementos
        personas.add(new Personas("Paco"));
        personas.add(new Personas("Maria"));
        personas.add(new Personas("Pino"));

        System.out.println(personas.getLast()); // → Pino

        // Cast obligatorio por no usar genéricos <Personas>
        Personas primera = (Personas) personas.get(0);
        primera.setNombre("Hugo"); // Modifica el objeto dentro de la lista

        System.out.println(personas); // → [Hugo, Maria, Pino]

        personas.remove(1); // Elimina por índice → quita "Maria"

        System.out.println(personas); // → [Hugo, Pino]

        // Cast en cada iteración por falta de genéricos
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(((Personas) personas.get(i)).getNombre());
        }

        Personas juan = new Personas(); // Constructor vacío
        personas.add(juan);

        System.out.println(personas.contains(juan)); // → true (misma referencia)

        personas.clear();
        System.out.println(personas.isEmpty()); // → true
    }
}

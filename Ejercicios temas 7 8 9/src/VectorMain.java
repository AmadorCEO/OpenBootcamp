import java.util.Vector;

public class VectorMain {

    public static void TareaVector() {
        Vector<String> vector = new Vector<>(5, 1);
        vector.add("Honda");
        vector.add("Toyota");
        vector.add("BMW");
        vector.add("Lexus");
        vector.add("TESLA");
        System.out.println("Datos del vector: " + vector);

        vector.remove(1);
        vector.remove(1);
        System.out.println("Datos del vector sin elementos 2 y 3: " + vector);
    }
}

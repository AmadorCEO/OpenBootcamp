import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinkedListMain {


    public static void ArrayLinkedList() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.add("Elemento 4");


            LinkedList<String> lista2 = new LinkedList<>(lista);


            for (String l2 : lista2) {
                System.out.println("Mostrando Elementos de LinkedList: " + l2);
            }

    }
}


import java.util.ArrayList;

public class ArrayListParesMain {

    public static void ArrayListElimandoPares() {
        ArrayList<Integer> numerosList = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numerosList.add(i);
            System.out.println(numerosList);
        }
        ArrayList<Integer> even = new ArrayList<>();
        for (int i : numerosList) {
            if (i % 2 == 0) {
                even.add(i);
            }
        }
        for (Integer i : even) {
            numerosList.remove(i);
        }
        System.out.println("Mostrando numeros impares solamente: " + numerosList);
    }

}

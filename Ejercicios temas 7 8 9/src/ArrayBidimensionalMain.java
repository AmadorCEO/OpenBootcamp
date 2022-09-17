public class ArrayBidimensionalMain {

    public static void ArrayBidimensional() {
        int[][] numeros = new int[][]{
                {1, 2, 3, 4, 5},
                {10, 20, 30, 40, 50},
        };
        for (int i = 0; i < numeros.length; i++) {

            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println("Estoy en i = " + i + ",j = " + j);
                System.out.println(numeros[i][j]);
            }

        }
    }
}

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {

        //  Cadena de texto al revés.
        System.out.println(reverse("Hola Mundo"));

        // 1.   Array Unidimensional
        ArrayUnidimensionalMain.ArrayUnidimencional();

        // 2.   Array Bidimensional
        ArrayBidimensionalMain.ArrayBidimensional();

        // 3.   Vector con 5 elementos

        VectorMain.TareaVector();

        /*  PROBLEMA DE USAR UN VECTOR CON SU CAPACIDAD POR DEFECTO:
         * El problema de utilizar un vector con la capacidad por defecto es que esto
         * copiaria los datos cada vez que llegue a tope y necesite incrementarse
         * lo cual produce un gran uso de recursos del ordenar lo que puede generar
         * lentitud o incluso colapso de la aplicación.
         * */

        // 5  Array list tipo String y copiar a linkedlist

        ArrayLinkedListMain.ArrayLinkedList();

        // 6. Crear ArraList tipo Int y rellenarlo
        ArrayListParesMain.ArrayListElimandoPares();

        // 7. DividePorCero
        DividePorCeroMain.DividePorCero();

        // 8. InputStream y PrintStream




    }


    public static String reverse (String texto){
                StringBuilder alReves = new StringBuilder();
                for (int i = texto.length() - 1; i >= 0; i--) {
                    alReves.append(texto.charAt(i));
                }
                return alReves.toString();
            }

    }
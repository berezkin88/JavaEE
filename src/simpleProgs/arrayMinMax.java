package simpleProgs;

/**
 * @author Aleksandr Beryozkin
 */

public class arrayMinMax {

    public static void main(String[] args) {
        int[] array = {1, 7, 19, -3, 5};
        int min = array[0], max = array[0];

        for (int item: array) {
            if (item < min) min = item;
            if (item > max) max = item;
        }

        System.out.println("Minimum: " + min + ";\n" + "Maximum: " + max);
    }
}

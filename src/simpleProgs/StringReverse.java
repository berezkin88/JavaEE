package simpleProgs;

import java.util.Scanner;

/**
 * @author Aleksandr Beryozkin
 */

public class StringReverse {

    public static void main(String[] args) {
        String origin, reverse = "";

        Scanner in = new Scanner(System.in);

        System.out.println("reading the original string");

        origin = in.nextLine();

        for (int i = origin.length() - 1; i >= 0; i--) {
            reverse += origin.charAt(i);
        }

        System.out.println("Reverse string is: " + reverse);
    }
}

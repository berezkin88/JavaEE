package Palindrome;

import java.util.Scanner;

/**
 * @author Aleksandr Beryozkin
 */

public class PalindromeConsiderer {

    public static void main(String[] args) {

        String origin, reverse = "";

        Scanner in = new Scanner(System.in);

        System.out.println("reading the original string");

        origin = in.nextLine();

        for (int i = origin.length() - 1; i >= 0; i--) {
            reverse += origin.charAt(i);
        }

        if (origin.equals(reverse)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This isn't a palindrome");
        }
    }
}

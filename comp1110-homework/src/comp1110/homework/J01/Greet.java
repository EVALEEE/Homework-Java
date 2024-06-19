package comp1110.homework.J01;

import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 21/2/2024 12:55 pm
 */
public class Greet {
    public static void main(String[] args) {
//        System.out.println("Plz input a name ~");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println("Hi" + " " + input + "!");
    }
}

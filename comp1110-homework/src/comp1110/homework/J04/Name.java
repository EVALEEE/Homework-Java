package comp1110.homework.J04;

import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 21/2/2024 3:03 pm
 */
public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("input your name!");
        String input = scanner.nextLine();
        if (input == null) {
            System.out.println("wrong input!");
        }
        String name = input.toUpperCase();
        System.out.println(name);
        System.out.println(name.length());
    }
}

package comp1110.homework.J05;

import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 21/2/2024 10:25 pm
 */
public class Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("input a integer!");
        int input = scanner.nextInt();

        if (isOdd(input)) {
            System.out.println(input + " is odd");
        } else {
            System.out.println(input + " is even");
        }
    }

    public static boolean isOdd(int input) {
        return input % 2 != 0;
    }
}

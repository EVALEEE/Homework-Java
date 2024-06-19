package comp1110.homework.J06;

import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 21/2/2024 11:04 pm
 */
public class Even {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("input an integer!");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

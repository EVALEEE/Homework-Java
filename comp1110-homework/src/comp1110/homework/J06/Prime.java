package comp1110.homework.J06;

import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 22/2/2024 8:00 pm
 */
public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("input a integer!");
        int input = scanner.nextInt();
        tool(input);
    }

    public static void tool(int input) {
        for (int i = 1; i <= input; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    //not a prime number
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

}

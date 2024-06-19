package comp1110.homework.J03;

import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 21/2/2024 2:53 pm
 */
public class Square {
    /*
    read from the console an integer that represents the length of a side
    and then calculate and print an integer that reprents the area of a square
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("input a number to represent the length of the side!");
        int length = scanner.nextInt();
//      double area2 = Math.pow(length, 2);
        System.out.println(length * length);
    }
}

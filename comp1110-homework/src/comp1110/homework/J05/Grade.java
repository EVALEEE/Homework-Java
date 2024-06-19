package comp1110.homework.J05;

import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 21/2/2024 9:45 pm
 */
public class Grade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input your mark of the subject!");
        int mark = scanner.nextInt();
        if (mark >= 0 && mark <= 49) {
            System.out.println("N");
        } else if (mark >= 50 && mark <= 59) {
            System.out.println("P");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("C");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("D");
        } else if (mark >= 80 && mark <= 100) {
            System.out.println("HD");
        } else {
            System.out.println("Bad mark");
        }

    }
}

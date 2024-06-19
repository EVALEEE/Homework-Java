package comp1110.homework.J01;

import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 21/2/2024 1:16 pm
 */
public class NumberWord {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input a String, Plz~");
        String inputS = scanner.next();
//        System.out.println("Input a Integer, Plz~");
        int inputI = scanner.nextInt();

        System.out.println(inputI + "," + " " + inputS);
    }
}

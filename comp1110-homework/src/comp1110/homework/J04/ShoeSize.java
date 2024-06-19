package comp1110.homework.J04;

import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 21/2/2024 3:12 pm
 */
public class ShoeSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input your height (in meters)!");

        double v = scanner.nextDouble();
        double v1 = v * 5;

        int sizeI = (int) v1;
        if (v1 >= (sizeI + 0.5)) {
            sizeI += 1;
        }
        System.out.println(sizeI);
    }
}

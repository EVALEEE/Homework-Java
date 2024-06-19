package comp1110.homework.J06;

import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 22/2/2024 5:50 pm
 */
public class Permute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("input a String!");
        String a = scanner.nextLine();
//        System.out.println("input another String!");
        String b = scanner.nextLine();
        tool(a, b);
    }

    public static void tool(String a, String b) {
        char[] charArrayA = a.toCharArray();
        char[] charArrayB = b.toCharArray();

        if (a.length() == b.length()) {
            labelA:
            for (int i = 0; i < charArrayA.length; i++) {
                for (int j = 0; j < charArrayB.length; j++) {
                    if (charArrayA[i] == charArrayB[j]) {
                        break;
                    }
                    if ((j == charArrayB.length - 1) && (charArrayA[i] != charArrayB[j])) {
                        System.out.println("No");
                        break labelA;
                    }
                }
                if (i == charArrayA.length - 1) {
                    System.out.println("Yes");
                    break labelA;
                }
            }
        } else {
            System.out.println("No");
            return;
        }
    }
}

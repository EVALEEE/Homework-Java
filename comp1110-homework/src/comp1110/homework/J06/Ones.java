package comp1110.homework.J06;

import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 21/2/2024 11:19 pm
 */
public class Ones {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String result = Integer.toBinaryString(a);

        char[] charArray = result.toCharArray();
        int temp = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '1') {
                temp++;
            }
        }
        System.out.println(temp);

    }
}

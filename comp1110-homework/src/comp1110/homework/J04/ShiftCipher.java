package comp1110.homework.J04;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 21/2/2024 3:06 pm
 */
public class ShiftCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Input a string of any length which contains any type of symbol (the plaintext)!");
        String inputString = scanner.nextLine();

//        System.out.println("Input a shift value which should be between 0 and 25");
        int shiftValue = scanner.nextInt();

        char[] charArray = inputString.toCharArray();
        //create a temporary array
        char[] charsTemp = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            //if the element is a letter
            if (Character.isLetter(charArray[i])) {
                // Determine the case (uppercase or lowercase)!!!
                char base = Character.isUpperCase(charArray[i]) ? 'A' : 'a';
                charsTemp[i] = (char) ((charArray[i] - base + shiftValue) % 26 + base);

//                charsTemp[i] = (char) (charArray[i] + shiftValue);
            } else {
                //if the element is not a letter
                charsTemp[i] = charArray[i];
            }
        }
        charArray = charsTemp;

        String stringFinal = new String(charArray);
        System.out.println(stringFinal);

    }
}

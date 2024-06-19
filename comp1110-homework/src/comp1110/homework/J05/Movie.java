package comp1110.homework.J05;

import java.util.Scanner;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 21/2/2024 10:01 pm
 */
public class Movie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input the name of a movie and its length in minutes!");

        String movieName = scanner.nextLine();
        int minutes = scanner.nextInt();

        if (minutes < 60) {
            //no hour
            if (minutes == 1) {
                System.out.println(movieName + " runs for " + minutes + " minute");
            } else {
                System.out.println(movieName + " runs for " + minutes + " minutes");
            }
        } else if (minutes >= 60 && (minutes % 60 != 0)) {
            //have minutes
            if ((minutes / 60) != 1) {
                if (minutes % 60 == 1) {
                    System.out.println(movieName + " runs for " + (minutes / 60) + " hours and " + (minutes % 60) + " minute");
                } else {
                    System.out.println(movieName + " runs for " + (minutes / 60) + " hours and " + (minutes % 60) + " minutes");
                }
            } else {
                if (minutes % 60 == 1) {
                    System.out.println(movieName + " runs for " + (minutes / 60) + " hour and " + (minutes % 60) + " minute");
                } else {
                    System.out.println(movieName + " runs for " + (minutes / 60) + " hour and " + (minutes % 60) + " minutes");
                }
            }
        } else {
            //no minutes
            if ((minutes / 60) == 1) {
                System.out.println(movieName + " runs for " + (minutes / 60) + " hour");
            } else {
                System.out.println(movieName + " runs for " + (minutes / 60) + " hours");
            }
        }
    }
}

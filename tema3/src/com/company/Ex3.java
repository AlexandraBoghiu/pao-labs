package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        if (firstString.length() == secondString.length()) {
            char[] firstCharArray = firstString.toCharArray();
            char[] secondCharArray = secondString.toCharArray();
            Arrays.sort(firstCharArray);
            Arrays.sort(secondCharArray);
            if (Arrays.equals(firstCharArray, secondCharArray)) {
                System.out.println("Anagrame.");
            } else {
                System.out.println("Nu sunt anagrame.");
            }

        } else {
            System.out.println("Nu sunt anagrame.");
        }
    }
}

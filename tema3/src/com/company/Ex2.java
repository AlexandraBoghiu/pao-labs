package com.company;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        StringBuilder str2 = new StringBuilder(str);

        if (str.equals(str2.reverse().toString()))
            System.out.println("Palindrom.");
        else System.out.println("Nu e palindrom.");
    }
}

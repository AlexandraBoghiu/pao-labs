package com.company;

import java.util.Scanner;

// 3. Scrieți o metoda care sa calculeze factorialul unui numar n citit de la tastatura.

public class Ex3 {
    private static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++)
            fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        System.out.println(factorial(n));
    }
}

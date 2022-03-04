package com.company;

import java.util.Scanner;

// 4. Fiind dat un numar n, scrieti o metoda care insumeaza toti multiplii de 3 si 5 pana la n (inclusiv).

public class Ex4 {
    private static int sumThreeFive(int n) {
        int sum = 0;
        for (int i = 3; i <= n; i++)
            if ((i % 3) == 0 || (i % 5) == 0)
                sum += i;

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        System.out.println(sumThreeFive(n));
    }
}

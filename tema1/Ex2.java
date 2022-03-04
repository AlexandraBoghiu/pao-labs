package com.company;

import java.util.Scanner;

// 2. Scrieți un program care sa compare doua numere a și b citite de la tastatura si sa afiseze numarul mai mare

public class Ex2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a > b)
            System.out.println("a = " + a);
        else if (a < b)
            System.out.println("b = " + b);
        else System.out.println("a = b = " + a);
    }
}

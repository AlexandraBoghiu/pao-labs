package com.company;

import java.util.Scanner;

public class Main {
 // 1. Scrieti un program care sa afișeze toate numerele pare din intervalul [0,n], unde n este un numar citit de la tastatura.

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    int n;
    n = scanner.nextInt();
    for(int i = 0; i <= n; i += 2)
        System.out.println(i);
    }

// 2. Scrieți un program care sa compare doua numere a și b citite de la tastatura si sa afiseze numarul mai mare

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

    // 3. Scrieți o metoda care sa calculeze factorialul unui numar n citit de la tastatura.

    private static long factorial(int n)
    {
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

// 4. Fiind dat un numar n, scrieti o metoda care insumeaza toti multiplii de 3 si 5 pana la n (inclusiv).

    private static int sumThreeFive(int n)
    {
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

// 5. Cititi de la tastatura n numere. Elementele citite vor fi organizate in doi vectori diferiti, in functie de
//paritate (de ex: elementele pare in vectorul x, iar cele impare in vectorul y).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, x, evenIndex = -1, oddIndex = -1;
        n = scanner.nextInt();
        int[] myEvenArray = new int[n];
        int[] myOddArray = new int[n];
        for (int i = 0; i < n; i++) {
            x = scanner.nextInt();
            if (x % 2 == 0) {
                evenIndex += 1;
                myEvenArray[evenIndex] = x;
            }
            else {
                oddIndex += 1;
                myOddArray[oddIndex] = x;
            }
    }
//  6. Cititi de la tastatura n note, numere intregi, intr-un vector. Cand cititi valoarea -1 de la tastatura, citirea
//      notelor se opreste si programul afiseaza media acestora.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, counter = 0, sum = 0;
        int[] myArray = new int[100];
        x = scanner.nextInt();
        if (x == -1)
            System.out.println(0);
        else {
            myArray[0] = x;
            sum += x;
        }
        while(x != -1)
        {
            x = scanner.nextInt();
            if (x != -1) {
                counter++;
                myArray[counter] = x;
                sum += x;
            }
        }
        System.out.println(sum / counter);

    }
}

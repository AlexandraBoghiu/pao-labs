package com.company;

import java.util.Scanner;

//  6. Cititi de la tastatura n note, numere intregi, intr-un vector. Cand cititi valoarea -1 de la tastatura, citirea
//      notelor se opreste si programul afiseaza media acestora.

public class Ex6 {
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
        while (x != -1) {
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


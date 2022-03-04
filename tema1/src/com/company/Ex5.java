package com.company;

import java.util.Scanner;

// 5. Cititi de la tastatura n numere. Elementele citite vor fi organizate in doi vectori diferiti, in functie de
//paritate (de ex: elementele pare in vectorul x, iar cele impare in vectorul y).

public class Ex5 {
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
            } else {
                oddIndex += 1;
                myOddArray[oddIndex] = x;
            }
        }
    }
}
